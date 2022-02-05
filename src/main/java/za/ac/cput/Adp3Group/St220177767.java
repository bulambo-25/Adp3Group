package za.ac.cput.Adp3Group;

public class St220177767
{
   private String StudentNumber;
   private String Studentname;
   private String courses;

   public String getStudentNumber() {
      return StudentNumber;
   }

   public void setStudentNumber(String studentNumber) {
      StudentNumber = studentNumber;
   }

   public String getStudentname() {
      return Studentname;
   }

   public void setStudentname(String studentname) {
      Studentname = studentname;
   }

   public String getCourses() {
      return courses;
   }

   public void setCourses(String courses) {
      this.courses = courses;
   }


   @Override
   public String toString() {
      return "St220177767{" +
              "StudentNumber='" + StudentNumber + '\'' +
              ", Studentname='" + Studentname + '\'' +
              ", courses='" + courses + '\'' +
              '}';
   }

}
