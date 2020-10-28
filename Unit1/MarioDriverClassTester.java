import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import java.util.Scanner;

public class MarioDriverClassTester
{
   public static void main(String[] args)
   {
  
      Scanner kb = new Scanner(System.in);
     
      System.out.println("Hi! In this program, you have the option to play ");
      System.out.println("one of three levels. The difficulty of each level ");
      System.out.println("increases progressively, with level one being the ");
      System.out.println("easiest. In order to choose a level, you must "); 
      System.out.print("enter a number from one to three: ");
      int input = kb.nextInt();
      kb.close();
     
      switch(input)
      {
     
         case 1:
            Mario1 a = new Mario1();
            System.out.println("");
            a.levelOneRun();
            break;
           
         case 2:
            Mario2 b = new Mario2();
            System.out.println("");
            b.levelTwoRun();
            break;
     
         case 3:
            Mario3 c = new Mario3();
            System.out.println("");
            c.levelThreeRun();
            break;
      }
   }
}  
