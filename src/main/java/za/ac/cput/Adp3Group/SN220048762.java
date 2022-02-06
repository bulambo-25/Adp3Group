package za.ac.cput.Adp3Group;

public class SN220048762
{
    private String StudentName;
    private String StudentCourse;
    private String Balance;


    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getStudentCourse() {
        return StudentCourse;
    }

    public void setStudentCourse(String StudentCourse) {
        this.StudentCourse = StudentCourse;
    }

    public String getBalance() {
        return Balance;
    }

    public void setBalance(String Balance) {
        this.Balance = Balance;
    }

    @Override
    public String toString() {
        return "University{" + "StudentName=" + StudentName + ", StudentCourse=" + StudentCourse + ", Balance=" + Balance + '}';
    }

}
