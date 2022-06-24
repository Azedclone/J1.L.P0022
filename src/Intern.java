
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
public class Intern extends Candidate {

    private String major;
    private String semester;
    private String university;

    public Intern() {
    }

    public Intern(String major, String semester, String university, String id, String firstName, String lastName, Date DOB, String address, String phone, String email, int candidateType) {
        super(id, firstName, lastName, DOB, address, phone, email, candidateType);
        this.major = major;
        this.semester = semester;
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public String getSemester() {
        return semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

}
