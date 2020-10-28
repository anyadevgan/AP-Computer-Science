import java.util.*; 
import java.io.File;

public class Lab02
{
   public static void main(String[] args) throws Exception 
   {
      Scanner sc = new Scanner(System.in);
   
      System.out.println("Enter a positive integer: ");
      int input = sc.nextInt();
      
      if(input < 0)
      {
         System.out.println("Please enter a POSITIVE integer: ");
         input = sc.nextInt();
      }
      
      int days = input/24;
      int hours = input%24;
      
      System.out.println(days + " days and " + hours + " hours");
   }

}