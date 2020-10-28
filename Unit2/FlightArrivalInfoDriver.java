import java.util.*; //this imports everything from util due to the *
import java.io.File;
public class FlightArrivalInfoDriver
{      
   public static void main(String[] args) throws Exception //telling java that our code might crash
   {      
      File f = new File("FlightArrivalInfo.txt");
      Scanner sc = new Scanner(f);
      Scanner sc2 = new Scanner(System.in);
      
      int numTrips = sc.nextInt();
      FlightArrivalInfo[] traveling = new FlightArrivalInfo[numTrips];
      
      for(int k = 0; k < numTrips; k++)
      {
         Boolean status = sc.nextBoolean();
         String flightNum = sc.next();
         int terminal = sc.nextInt();
         String origin = sc.next();
         int hrs = sc.nextInt();
         int min = sc.nextInt();
         double distance = sc.nextDouble();
            
         FlightArrivalInfo trip = new FlightArrivalInfo(status, flightNum, terminal, origin, hrs, min, distance);
         traveling[k] = trip;
      }
      
      for(int a = 0; a < traveling.length; a++)
      {
         System.out.println("Delayed? "+traveling[a].isDelayed());
         System.out.println("Flight number: "+traveling[a].getFlightNumber());
         System.out.println("Terminal: "+traveling[a].getTerminal());
         System.out.println("Origin: "+traveling[a].getOrigin());
         System.out.println("Hours: "+traveling[a].getHours());
         System.out.println("Minutes: "+traveling[a].getMinutes());
         System.out.println("Distance: "+traveling[a].getDistance());
         System.out.println("_____________________________________");
      }
      
      //query change data
      System.out.println("Looking at the information printed above, which flight do you want to change? (between 0 and 4)");
      int b = sc2.nextInt();
      System.out.println("What is the new distance of your flight? ");
      double newDistance = sc2.nextDouble();
      System.out.println("What is the new origin of your flight? ");
      String newOrigin = sc2.next();
      traveling[b].setDistance(newDistance);
      traveling[b].setOrigin(newOrigin);
      
      //print out updated flight info
      System.out.println("_____________________________________");
      System.out.println("Delayed? "+traveling[b].isDelayed());
      System.out.println("Flight number: "+traveling[b].getFlightNumber());
      System.out.println("Terminal: "+traveling[b].getTerminal());
      System.out.println("Origin: "+newOrigin);
      System.out.println("Hours: "+traveling[b].getHours());
      System.out.println("Minutes: "+traveling[b].getMinutes());
      System.out.println("Distance: "+newDistance);
   }
}