import java.util.*;
import java.io.*;

public class AmericanRoadTrip
{
   public static void main(String[] args) throws Exception //telling java that our code might crash
   {
      //create scanner
      File f = new File("myFunRoadTrip.txt");
      Scanner sc = new Scanner(f);
      Scanner sc2 = new Scanner(System.in); //calling scanner's (one-arg: input stream) constructor

      //instantiate our array
      int numTrips = sc.nextInt();
      CarTrip[] summerVacay = new CarTrip[numTrips];
      
      //read in our trips
      for(int k = 0; k < numTrips; k++)
      {
         //read in data
         String dest = sc.next();
         int distance = sc.nextInt();
         int pass = sc.nextInt();
         double distKM = distance * 1.61;
         //instantiate object
         CarTrip myTrip = new CarTrip(dest, distKM, pass);
         //add object to our array
         summerVacay[k] = myTrip;
      }
      //print the distance of the 4th leg of our trip
      System.out.println(summerVacay[3].getDistanceInKm() + " kilometers");
      //prompt the user for an index, an print that distance in KM and Miles
      System.out.println("Enter an index: ");
      int user = sc2.nextInt();
      System.out.println(summerVacay[user].getDistanceInKm() + " kilometers");
      System.out.println(summerVacay[user].getDistanceInMiles() + " miles");
   }
}