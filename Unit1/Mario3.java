import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
 
public class Mario3
{
   public void levelThreeRun()
   {
      Display.openWorld("maps/Level3.map");
      Display.setSize(30,25);
      Display.setSpeed(8);
     
      MarioBros mario = new MarioBros();

      mario.swim();
      mario.rise();
      mario.move();

      while(!mario.rightIsClear())
      {
         mario.move();
      }
      mario.dive();
      mario.swim();
      mario.rise();
      mario.move();

      while(!mario.rightIsClear())
      {
         mario.move();
      }
      mario.dive();
      mario.swim();
      mario.rise();
      mario.move();

      while(!mario.rightIsClear())
      {
         mario.move();
      }
      mario.dive();
      mario.swim();
      mario.rise();
      mario.pickBeeper();
   }
}