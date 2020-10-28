import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot; 
 
public class Mario1
{
   public void levelOneRun()
   {
      Display.openWorld("maps/Level1.map");
      Display.setSize(20,20);
      Display.setSpeed(10);
     
      MarioBros mario = new MarioBros();
   
      while(!mario.nextToABeeper())
      {
         if(mario.frontIsClear() && !mario.leftIsClear() && !mario.nextToABeeper())
         {
            mario.move();
         }
         
         if(!mario.leftIsClear() && !mario.rightIsClear() && !mario.frontIsClear())
         {
            mario.turnAround();
         }
         
         if(!mario.leftIsClear() && !mario.frontIsClear() && !mario.nextToABeeper())
         {
            mario.turnRight();
            mario.move();
         }
         
         if(mario.leftIsClear() && !mario.nextToABeeper())
         {
            mario.turnLeft();
            mario.move();
         }
      }
      mario.pickBeeper();
   }
}