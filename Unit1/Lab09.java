import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class Lab09
{
   public static void main(String[] args) 
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
      
      Display.openWorld("maps/"+filename+".map");
      Display.setSize(10, 10);
      Display.setSpeed(1);  
      
      Athlete joe = new Athlete(1, 1, Display.EAST, 0);
   
      for(int n = 1; n <= 7; n++)
      {
         joe.move();
      }
      
      joe.turnAround();
      
      while(joe.frontIsClear())
      {
         while(!joe.nextToABeeper() && joe.frontIsClear())
         {
            joe.move();
         }
         while(joe.nextToABeeper())
         {
            joe.pickBeeper();
         }
         joe.turnAround();
         joe.move();
         while(joe.hasBeepers())
         {
            joe.putBeeper();
         }
         joe.turnAround();
         joe.move();
      }
   }
}  