import java.util.*;
import java.io.*;

public class ReportCard
{
   private String name;
   private CourseScore[] list;
   
   public ReportCard(String fileName)
   {
      Scanner sc = null;
      try
      {
         sc = new Scanner(new File(fileName));   // open the file
      }
      catch(Exception e)   // e is commonly used as the identifier
      {
         System.out.println("The scanner failed!");
      }
  
      name = sc.nextLine();
      list = new CourseScore[8];
   
      for(int a=1; a<9; a++)
      {
         String line = "";
         line = sc.nextLine();
         
         String period = line.substring(0, line.indexOf(":"));
         String course = line.substring(line.indexOf(":")+1, line.indexOf("["));
         String grade  = line.substring(line.indexOf("[")+1, line.indexOf("]"));
         double newGrade = Double.parseDouble(grade);
      
         list[a] = new CourseScore(course, period, newGrade);
      }
   }

   public String toStringRC()
   {
      String studentBio = "";
      studentBio = name + "\n";
      for(int k=0; k<list.length; k++)
      {
         studentBio += list[k].toString() + "\n"; 
      }
      return studentBio;
   }
   
   public double getGPA()
   {
      double grade = 0.0;
      double GPA = 0.0;
      double finalGPA = 0.0;
      int k = 0;
      int l = 0;
      while(k < 8.0)
      {
         String course = list[k].getCourse();
         if(course.equals("Study Hall"))
         {
            list[k].setGrade(0);
            l++;
         }
         grade = list[k].getGrade();
         GPA = grade + GPA;
         k++;
      }
      finalGPA = GPA / ((k+1)-1); 
      return finalGPA;
   }
   
   public String bestCourse()
   {
      for(int k = 0; k < list.length; k++)
      {
         for(int a = 1; a <= list.length; a++)
         {
            if(list[k].getGrade() > list[a].getGrade())
            {
               return list[k].getCourse();
            }
         }
      }
      return list[k].getCourse();
   }
}
