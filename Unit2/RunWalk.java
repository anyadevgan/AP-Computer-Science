import java.util.*; 

public class RunWalk
{
   public static void main(String[] args) 
   {
      Walker maggie = new Walker(); 
   
      maggie.walk( 5.2 ); // moves 1 - 5.2 (random)
      maggie.walk( -4.0 ); // should not move 
      maggie.walk( 8.5 ); // moves 1 - 8.5 (random) 
      maggie.walk( 1.0 ); // moves 1 foot
      double loc = maggie.getX(); 
      System.out.println( "maggie is now at " + loc ); 
   }

}