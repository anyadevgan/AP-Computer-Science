//Anya Devgan
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab05
 {   
 public static void runTheRace(Racer arg)
   {
     arg.shuttle(2, 7);
     arg.shuttle(4, 5);
     arg.shuttle(6, 3); 
     arg.move();   
   }

   public static void main (String[] args)
   {
      Display.openWorld("maps/shuttle.map");
      Display.setSize(10, 10);
      Display.setSpeed(10);  
      
      Racer adam = new Racer(7);
      Racer carl = new Racer(4);
      Racer dan = new Racer(1);
      
      runTheRace(adam);
      runTheRace(carl);
      runTheRace(dan);
       
   }
       
}