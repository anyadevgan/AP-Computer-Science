import java.util.*;
public class CarTripDriver
{
   public static void main(String[] args)
   {  
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter a destination:");
      String destination = sc.next();
      System.out.print("Enter the distance (km):");
      double distanceInKm = sc.nextDouble();
      System.out.print("How many passangers?");
      int passangers = sc.nextInt();
      
      CarTrip toSchool = new CarTrip(destination, distanceInKm, passangers);
      
      System.out.println("___________________________");
      System.out.println("Destination:"+toSchool.getDestination());
      System.out.println(toSchool.getDistanceInKm()+"km");
      System.out.println(toSchool.getPassangers()+" passangers");
      System.out.println("Distance in miles::"+toSchool.getDistanceInMiles());
      
      
   }
}