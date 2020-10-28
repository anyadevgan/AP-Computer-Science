import java.util.*; 
import java.lang.Math.*;

public class Lab10
{
   public static double approximate(double input)
   {
      double b = 0.0;
      double index = input;
      double approxNum = 0;
      
      for(double x = 1.0 ; x <= index; x++)
      {
         double a = 1.0/(x * 2 - 1);
         
         if(x % 2 == 0)
         {
            a = a * (-1.0);
         }
         
         b += a;
      }
      approxNum = 4.0 * b;
      return approxNum;
   }
   
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter a number: "); 
      double input = sc.nextInt();
      
      //part 1
      double answer = approximate(input);
      
      System.out.println("The approximation to pi of " + input + " is " + answer);
      
   
      //part 2
      double off = Math.PI - answer;
      if(answer < Math.PI)
      {
         System.out.println("The approximation is off by -" + off);

      }
      else
      {
         System.out.println("The approximation is off by " + off);
      }
       
   }
   

}