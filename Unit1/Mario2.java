import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
 
public class Mario2
{
   public void levelTwoRun()
   {
      Display.openWorld("maps/Level2.map");
      Display.setSize(25,25);
      Display.setSpeed(8);
     
      MarioBros mario = new MarioBros();
      Turtle turtle = new Turtle(22,1);

      mario.rise();
      mario.jagged();
      mario.fall();
     
      for(int a = 0; a < 3; a++)
      {
         mario.move();
      }
           
      mario.rise();
      mario.collectCoins();
      mario.turnRight();
      mario.fall();
     
      mario.move();
     
      mario.rise();
      mario.jagged();
      mario.fall();
     
      mario.move();
     
      mario.rise();
      mario.collectCoins();
      mario.turnRight();
      mario.fall();
      mario.jagged();
      mario.fall();
 
      mario.avoidTurtle();     
      mario.rise();
      mario.collectCoins();
   }
}