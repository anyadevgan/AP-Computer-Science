import java.util.*;

public class Lab03Part2
{
   public static void main(String[] args) 
   {
      Walker alex = new Walker(); 
      
      int count = 0;
      double loc = alex.getX(); 
   
      while(loc <= 100)
      {
         alex.walk( 10.0 );
         loc = alex.getX();
         count++;
      }
      
      loc = alex.getX(); 
      System.out.println( "alex is now at " + loc + " km and the walk method was called " + count + " times"); 
   }

}