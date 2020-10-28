import java.util.*; 
import java.io.File;

public class Temperature
{
   public static int getFahrenheit(int fahrenheit)
   {
      return fahrenheit;
   }
   
   public static double fahrenheitToCelsius(int fahrenheit)
   {
      double celsius = (5.0/9)*(fahrenheit-32);
      return celsius;
   }
   
   public static void main(String[] args) throws Exception 
   {
      //part 1
      Scanner sc = new Scanner(System.in);
   
      System.out.println("PART 1");
      System.out.println("What is the temperature in fahrenheit? ");
      int fahrenheit = sc.nextInt();
      double celsius = fahrenheitToCelsius(fahrenheit);
      
      System.out.println("= "+celsius+" degrees celsius");
      
      //part 2
      File f = new File("temps.txt");
      Scanner sc2 = new Scanner(f);
      
      int numTemps = sc2.nextInt();
      int[] temp = new int[numTemps];
   
      for(int k = 0; k < numTemps; k++)
      {
         int fDegrees = sc2.nextInt();
         temp[k] = fDegrees;
      }
      
      int temp1F = getFahrenheit(temp[0]);
      int temp2F = getFahrenheit(temp[1]);
      int temp3F = getFahrenheit(temp[2]); 
      int temp4F = getFahrenheit(temp[3]); 
      int temp5F = getFahrenheit(temp[4]); 
      int temp6F = getFahrenheit(temp[5]); 
      int temp7F = getFahrenheit(temp[6]); 
      int temp8F = getFahrenheit(temp[7]); 
      int temp9F = getFahrenheit(temp[8]); 
      int temp10F = getFahrenheit(temp[9]); 
      
      double avgF = (temp1F + temp2F + temp3F + temp4F + temp5F + temp6F + temp7F + temp8F + temp9F + temp10F)/10.0;
      System.out.println("");
      System.out.println("PART 2");
      System.out.println("The average of temperatures in temps.txt (fahrenheit) is " + avgF);
      
      double temp1C = fahrenheitToCelsius(temp1F);
      double temp2C = fahrenheitToCelsius(temp2F);
      double temp3C = fahrenheitToCelsius(temp3F);      
      double temp4C = fahrenheitToCelsius(temp4F);
      double temp5C = fahrenheitToCelsius(temp5F);
      double temp6C = fahrenheitToCelsius(temp6F);
      double temp7C = fahrenheitToCelsius(temp7F);
      double temp8C = fahrenheitToCelsius(temp8F);
      double temp9C = fahrenheitToCelsius(temp9F);
      double temp10C = fahrenheitToCelsius(temp10F);
      
      double avgC = (temp1C + temp2C + temp3C + temp4C + temp5C + temp6C + temp7C + temp8C + temp9C + temp10C)/9.0;
      System.out.println("The average of temperatures in temps.txt (celsius) is " + avgC);
      
      //extension - print out the largest temperature
      int largest = temp[0];
               
      for(int i = 1; i < temp.length; i++)
      {
         if(temp[i] > largest)
         {
            largest = temp[i];
         }
      }
      
      System.out.println("");
      System.out.println("EXTENSION");
      System.out.println("The largest temperature is " + largest + " degrees fahrenheit");
   }

}