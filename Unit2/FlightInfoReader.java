import java.io.File;
import java.util.Scanner;

public class FlightInfoReader
{
   public static void main(String[] args) throws Exception
   {
      File f = new File("FlightArrivalInfo.txt");
      Scanner file = new Scanner(f);      
      
      while(file.hasNextLine())
      {
         System.out.println(file.nextLine());
      }
   }
}