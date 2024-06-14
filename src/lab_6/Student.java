
package Q1;

/**
 *
 * @author Student
 */import java.io.Serializable;

public class Student implements Serializable {
    private String studentID;
    private String lastName;
    private String firstName;
    private String midName;
    private int yearOfBirth;
    private String gender;
    private String SchoolStage; // Elementary, middle, high school

    public Student(String studentID, String lastName, String firstName, String midName, int yearOfBirth, String gender, String schoolStage) {
        this.studentID = studentID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.midName = midName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        SchoolStage = schoolStage;
    }
    public Student(){}

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSchoolStage() {
        return SchoolStage;
    }

    public void setSchoolStage(String schoolStage) {
        SchoolStage = schoolStage;
    }
}