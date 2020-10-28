import java.io.*;      //the File 
import java.util.*;    //the Scanner 

public class LabDriver
{
   private static int amount=1325;
   
   public static void main(String[] args) throws Exception
   {
      //scanner for keyboard
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the amount of money you want to spend on a lab: ");
      double budget = sc.nextDouble(); 
      System.out.print("Enter the difficulty level of a lab you want: ");
      int diffLevel = sc.nextInt();  
      System.out.print("Enter the reaction type you want for your lab: ");
      String type = sc.next(); 
      
      //scanner for file
      File f = new File("PossibleLabs.txt");
      Scanner sc2 = new Scanner(f);
 
      //create ArrayList
      Lab experiment = new Lab();
      
      
   }
 
   
 
}