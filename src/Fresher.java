
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
public class Fresher extends Candidate {

    private Date graduationDate;
    private String graduationRank;
    private String graduationUniversity;

    public Fresher() {
    }

    public Fresher(Date graduationDate, String graduationRank, String graduationUniversity, String id, String firstName, String lastName, Date DOB, String address, String phone, String email, int candidateType) {
        super(id, firstName, lastName, DOB, address, phone, email, candidateType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.graduationUniversity = graduationUniversity;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public String getGraduationUniversity() {
        return graduationUniversity;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public void setGraduationUniversity(String graduationUniversity) {
        this.graduationUniversity = graduationUniversity;
    }

}
