
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Azedclone
 */
public class Display {

    void displayMenu() {
        System.out.println("CANDIDATE MANAGEMENT SYSTEM");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Internship");
        System.out.println("4. Searching");
        System.out.println("5. Exit");
    }

    void displayAllCandidate(ArrayList<Candidate> listCandidate) {
        //Display all experience
        System.out.println("======== Experience Candidate ========");
        for (Candidate candidate : listCandidate) {
            if (candidate.getCandidateType() == 0) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }

        System.out.println("======== Fresher Candidate ========");
        for (Candidate candidate : listCandidate) {
            if (candidate.getCandidateType() == 1) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }

        System.out.println("======== Intern Candidate ========");
        for (Candidate candidate : listCandidate) {
            if (candidate.getCandidateType() == 2) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
    }

    void displayResult(ArrayList<Candidate> listResult) {
        System.out.println("The candidates found: ");
        for (Candidate candidate : listResult) {
            System.out.println(candidate.toString());
        }
    }
}
