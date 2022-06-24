
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Azedclone
 */
public class CandidateManager {

    CandidateDatabase candidateDatabase = new CandidateDatabase();
    ArrayList<Candidate> data = candidateDatabase.getCandidateDatabase();
    Display display = new Display();
    GetData getData = new GetData();

    Candidate createCandidate() {
        String id = getData.getString("ID: ", "^.*$", "");

        //Check id have existed or not
        boolean isExist = false;
        for (Candidate candidate : data) {
            if (candidate.getId().equals(id)) {
                isExist = true;
            }
        }
        if (!isExist) {

            String firstName = getData.getString("First name: ", "^[a-zA-Z\\s]+$", "Name must contain only letter");
            String lastName = getData.getString("Last name: ", "^[a-zA-Z\\s]+$", "Name must contain only letter");
            Date dob = getData.getDate("DOB: ");
            String address = getData.getString("Address: ", "^[a-zA-Z\\s]+$", "Address must contain only letter");
            String phone = getData.getString("Phone: ", "^\\d{10,11}$", "Phone must be 10 or 11 numbers");
            String email = getData.getEmail("Email: ");

            return new Candidate(id, firstName, lastName, dob, address, phone, email, 0);
        } else {
            System.out.println("This id have already exist");
            return null;
        }
    }

    void createExperience() {
        Candidate candidate = createCandidate();

        if (candidate != null) {
            candidate.setCandidateType(0);

            int expInYear = getData.getInt("Year of experience: ", 0, 100);
            String proSkill = getData.getString("Professional skill: ", "^[a-zA-Z\\s]+$", "Skill must contain only letter");

            data.add(new Experience(expInYear, proSkill, candidate.getId(), candidate.getFirstName(),
                    candidate.getLastName(), candidate.getDOB(), candidate.getAddress(),
                    candidate.getPhone(), candidate.getEmail(), candidate.getCandidateType()));

            System.out.println("Create experience successfull!");
        }
    }

    void createFresher() {
        Candidate candidate = createCandidate();

        if (candidate != null) {
            candidate.setCandidateType(1);
            Date graduationDate = getData.getDate("Graduation date: ");
            String graduationRank = getData.getString("Graduation rank: ", "^[a-zA-Z\\s]+$", "Rank must contain only letter");
            String graduationUniversity = getData.getString("Graduation university: ", "^[a-zA-Z\\s]+$", "University must contain only letter");

            data.add(new Fresher(graduationDate, graduationRank, graduationUniversity,
                    candidate.getId(), candidate.getFirstName(), candidate.getLastName(),
                    candidate.getDOB(), candidate.getAddress(), candidate.getPhone(),
                    candidate.getEmail(), candidate.getCandidateType()));

            System.out.println("Create fresher successfull!");
        }
    }

    void createIntern() {
        Candidate candidate = createCandidate();

        if (candidate != null) {
            candidate.setCandidateType(2);

            String major = getData.getString("Major: ", "^[a-zA-Z\\s]+$", "Major must contain only letter");
            String semester = getData.getString("Semester: ", "^[a-zA-Z\\s]+$", "Semester must contain only letter");
            String university = getData.getString("University: ", "^[a-zA-Z\\s]+$", "University must contain only letter");

            data.add(new Intern(major, semester, university, candidate.getId(),
                    candidate.getFirstName(), candidate.getLastName(), candidate.getDOB(),
                    candidate.getAddress(), candidate.getPhone(), candidate.getEmail(),
                    candidate.getCandidateType()));

            System.out.println("Create fresher successfull!");
        }
    }

    void search() {
        ArrayList<Candidate> listResult = new ArrayList<>();
        display.displayAllCandidate(data);

        String nameSearch = getData.getString("Input Candidate name (First name or Last name): ", "^[a-zA-Z\\s]+$", "Name must contain only letter");
        int candidateType = getData.getInt("Input type of candidate: ", 0, 2);

        for (Candidate candidate : data) {
            if ((candidate.getFirstName().contains(nameSearch) || candidate.getLastName().contains(nameSearch)) && candidate.getCandidateType() == candidateType) {
                listResult.add(candidate);
            }
        }

        if (listResult.isEmpty()) {
            System.out.println("No results match your search criteria");
        } else {
            display.displayResult(listResult);
        }
    }
}
