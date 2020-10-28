import java.util.*; //this imports everything from util due to the *
public class CarTripDriver
{
   public static void main(String[] args) //every program needs a main method
   {  
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter a destination:");
      String destination = sc.next();
      System.out.print("Enter the distance (km):");
      double distanceInKm = sc.nextDouble();
      System.out.print("How many passengers?");
      int passengers = sc.nextInt();
      
      CarTrip toSchool = new CarTrip(destination, distanceInKm, passengers);
      
      System.out.println("___________________________");
      System.out.println("Destination: "+toSchool.getDestination());
      System.out.println(toSchool.getDistanceInKm()+"km");
      System.out.println(toSchool.getPassengers()+" passengers");
      System.out.println("Distance in miles: "+toSchool.getDistanceInMiles());    
   }
}