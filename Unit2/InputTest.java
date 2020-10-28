import java.util.Scanner; 
import java.io.File;//could use * (for wildcards)
public class InputTest
{
   public static void main(String[] args) throws Exception
   {
      File f = new File("spooky.txt");//calls scanner constructor for file
      Scanner s = new Scanner(f);
      
      System.out.println(s.nextLine());
      System.out.println(s.next());//next reads the next item and returns it as a string
   }
}