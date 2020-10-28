public class CourseScore
{
   private String course;
   private String period;
   private double grade;
      
   public CourseScore(String c, String p, double g)
   {
      course = c;
      period = p;
      grade = g;
   }
   
   public String getCourse()
   {
      return course;
   }
   
   public void setCourse(String newCourse)
   {
      course = newCourse;
   }
   
   public String getPeriod()
   {
      return period;
   }
   
   public void setPeriod(String newPeriod)
   {
      period = newPeriod;
   }
   
   public double getGrade()
   {
      return grade;
   }
   
   public void setGrade(double newGrade)
   {
      grade = newGrade;
   }
   public String toString()
   {
      return period + ":" + course + "[" + grade + "]";
   }
  
}