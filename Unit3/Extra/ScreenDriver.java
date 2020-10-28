/**
 * Author: 
 * Date: 
 * Description: 
 *
 */
 
public class ScreenDriver
{
  
   public static void main(String[] args)
   {
      Screen myMac = new Screen();
            
      // test that a default Window can be built 
      myMac.openWindow();
      
      // test that a new window can be built in various sizes and locations
      myMac.openWindow("Test Window", "Blah de da blah blah blah blah-blah blah, blah da de blah blah blah blah-blah blah blah.", 5, 25, 10, 30); 
      
      myMac.printScreen();   // check the Screen is built correctly
   }
}
