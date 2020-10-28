import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class Lab10
{
   public static void main(String[] args) 
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
      
      Display.openWorld("maps/"+filename+".map");
      Display.setSize(10, 10);
      Display.setSpeed(1);  
      
      Athlete joe = new Athlete(1, 1, Display.NORTH, Display.INFINITY);
         
      while(!joe.nextToABeeper())
      {
         if(joe.frontIsClear() && !joe.leftIsClear() && !joe.nextToABeeper())
         {
            joe.move();
         }
         
         if(!joe.leftIsClear() && !joe.rightIsClear() && !joe.frontIsClear())
         {
              joe.turnAround();
         }
         
         if(!joe.leftIsClear() && !joe.frontIsClear() && !joe.nextToABeeper())
         {
            joe.turnRight();
            joe.move();
         }
         
         if(joe.leftIsClear() && !joe.nextToABeeper())
         {
            joe.turnLeft();
            joe.move();
         }
      }
   }
}  