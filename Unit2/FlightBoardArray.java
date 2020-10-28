import java.util.*;
import java.io.*;

public class FlightBoardArray
{
   public static void main(String[] args) throws Exception //telling java that our code might crash
   {
      //create scanner
      File f = new File("FlightArrivalInfo.txt");
      Scanner sc = new Scanner(f);
      Scanner sc2 = new Scanner(System.in); //calling scanner's (one-arg: input stream) constructor

      //instantiate our array
      int numTrips = sc.nextInt();
      FlightArrivalInfo[] traveling = new FlightArrivalInfo[numTrips];
      
      for(int k = 0; k < numTrips; k++)
      {
         //read in data
         Boolean status = sc.nextBoolean();
         String flightNum = sc.next();
         int terminal = sc.nextInt();
         String origin = sc.next();
         int hrs = sc.nextInt();
         int min = sc.nextInt();
         double distance = sc.nextDouble();
      
         //instantiate object
         FlightArrivalInfo trip = new FlightArrivalInfo(status, flightNum, terminal, origin, hrs, min, distance);
         
         //add object to our array
         traveling[k] = trip;
      }
         
      //print the information for each trip
      for(int a = 0; a < traveling.length; a++)
      {
         System.out.println("Flight "+a);
         System.out.println("Delayed? "+traveling[a].isDelayed());
         System.out.println("Flight number: "+traveling[a].getFlightNumber());
         System.out.println("Terminal: "+traveling[a].getTerminal());
         System.out.println("Origin: "+traveling[a].getOrigin());
         System.out.println("Hours: "+traveling[a].getHours());
         System.out.println("Minutes: "+traveling[a].getMinutes());
         System.out.println("Distance: "+traveling[a].getDistance());
         System.out.println("_____________________________________");
      }
   }
}