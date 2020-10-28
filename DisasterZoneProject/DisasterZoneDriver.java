import java.io.*;
import java.util.Scanner;
/**
 * Write a description of class DisasterZoneTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DisasterZoneDriver
{
    // instance variables 
    

    
    public static void main(String[] args) throws IOException
    {
        DisasterZone karel = new DisasterZone();   // use the default/empty disaster zone
        // DisasterZone karel = new DisasterZone(4);   // with density of 4% debris
        // DisasterZone karel = new DisasterZone(5, 'B');   // with density of 5% debris with a Building
        
        System.out.println("Initial status = " + karel.getBotStatus());
        
        
        System.out.println("ping result = " + karel.ping());
        System.out.println(karel.move(10));
        System.out.println("ping result = " + karel.ping());
        
        karel.turnLeft();
        karel.turnLeft();
        
        System.out.println("Karel has turned around");
        
        System.out.println("ping result = " + karel.ping());
        System.out.println(karel.move(10));
        karel.displayScore();
        
    }
}

