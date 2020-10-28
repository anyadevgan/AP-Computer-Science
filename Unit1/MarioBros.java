import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class MarioBros extends Athlete
{
   public MarioBros()
   {
      super(1, 1, Display.EAST, 0); 
   }
  
   public void jagged()
   {
      for(int b = 0; b < 2; b++)
      {
         move();
         turnRight();
         move();
         turnLeft();
      }
      move();
      turnRight();
      move();
      for(int c = 0; c < 3; c++)
      {
         move();
         turnRight();
         move();
         turnLeft();
      }
   }
   
   public void fall()
   {
      while(frontIsClear())
      {
         move();
      }
      turnLeft();
   }
   
   public void collectCoins()
   {
      do
      {
         pickBeeper();
         move();
      }
      while(nextToABeeper());
   }
   
   public void avoidTurtle()
   {
      turnLeft();
      move();
      turnRight();
      move();
      move();
      turnRight();
      move();
      turnLeft();
      move();
   }
  
   public void swim()
   {
      while(frontIsClear())
      {
         move();
         while(nextToABeeper())
         {
            pickBeeper();
         }
      }
   }
   public void dive()//assume mario is already at the edge
   {
      turnRight();
      while(frontIsClear())
      {
         move();
      }
      turnLeft();
   }
   public void rise()//assume mario is right next to pillar 
   {
      turnLeft();
      move();
      while(!rightIsClear())
      {
         move();
      }
      turnRight();
      move();
   }
}