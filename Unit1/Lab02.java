//Anya Devgan
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab02
{
   public static void main (String[] args)
   {
      Display.openWorld("maps/maze.map");
      Display.setSize(8, 8);
      Display.setSpeed(5);
      
      Athlete maria = new Athlete();
      
      maria.putBeeper();
      maria.move();
      maria.putBeeper();
      maria.turnRight();
      maria.move();
      maria.putBeeper();
      maria.turnRight();
      maria.move();
      maria.putBeeper();
      maria.turnLeft();
      maria.move();
      maria.putBeeper();
      maria.turnLeft();
      maria.move();
      maria.putBeeper();
      maria.turnRight();
      maria.move();
      maria.putBeeper();
      maria.move();
      maria.putBeeper();
      maria.turnRight();
      maria.move();
      maria.putBeeper();
      maria.turnLeft();
      maria.move();
      maria.putBeeper();
      maria.turnLeft();
      maria.move();
      maria.putBeeper();
      maria.move();
      maria.putBeeper();
      maria.move();
      maria.putBeeper();
      maria.move();
      maria.putBeeper();
      maria.turnRight();
      maria.move();
      maria.putBeeper();
      maria.move();
      
   }
}