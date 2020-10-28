//Anya Devgan
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03
{
   public static void main (String[] args)
   {
      Display.openWorld("maps/mountain.map");
      Display.setSize(16, 16);
      Display.setSpeed(7);
      
      Climber lisa = new Climber(8);  
      Climber maria = new Climber(8);
      
      lisa.turnRight();
      lisa.move();
      maria.turnRight();
      maria.move();
      lisa.climbUpRight();
      maria.climbUpRight();
      lisa.climbUpRight();
      maria.climbUpRight();
      lisa.climbUpRight();  
      maria.climbUpRight(); 
      lisa.climbDownRight();
      maria.climbDownRight();
      lisa.climbDownRight();
      maria.climbDownRight();
      lisa.pickBeeper();
      lisa.turnAround();
      maria.turnAround();
      lisa.climbUpLeft();
      maria.climbUpLeft();
      lisa.climbUpLeft();
      maria.climbUpLeft();
      lisa.climbDownLeft();
      maria.climbDownLeft();
      lisa.climbDownLeft();
      maria.climbDownLeft();
      lisa.climbDownLeft();
      maria.climbDownLeft();
      lisa.move();
      maria.move();
      lisa.putBeeper();
      lisa.move();
   
   }
}