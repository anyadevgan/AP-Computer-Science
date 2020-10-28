//Anya Devgan
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab04
{
 public static void takeTheField(Athlete arg)
   {
      arg.move();
      arg.move();
      arg.move();
      arg.move();
      arg.turnRight();
      arg.move();
      arg.move();
    }
    
   public static void main (String[] args)
   {
      Display.openWorld("maps/arena.map");
      Display.setSize(10, 10);
      Display.setSpeed(7);  
      
      Athlete maria = new Athlete();
      Athlete gary = new Athlete();
      Athlete pete = new Athlete();
      Athlete lisa = new Athlete();
      Athlete david = new Athlete();
      Athlete mary = new Athlete();
      Athlete coach = new Athlete(2, 7, Display.EAST, 0);
      
      takeTheField(maria);
      takeTheField(gary);
      takeTheField(pete);
      takeTheField(lisa);
      takeTheField(david);
      takeTheField(mary);
      mary.move();
      mary.move();
      mary.move();
      mary.turnLeft();
      mary.move();
      mary.move();
      mary.turnAround();
      maria.move();
      maria.move();
      maria.move();
      maria.move();
      maria.move();
      maria.turnLeft();
      maria.move();
      maria.turnAround();
      david.move();
      david.turnLeft();
      david.move();
      david.turnAround();
      gary.move();
      gary.move();
      gary.move();
      gary.move();
      gary.turnRight();
      lisa.move();
      lisa.move();
      lisa.move();
      lisa.turnRight();
      pete.move();
      pete.move();
      pete.turnRight();
       
   }
       
}