public class CarTrip
{
   //fields -- should always private -- permission > type > name
   private String destination;
   private int passengers;
   private double distance;
   
   //constructors -- used to create a new object
   public CarTrip(String dest, double dist, int pass)
   {
      destination = dest;
      distance = dist;
      passengers = pass;
   }
   
   //methods
   public String getDestination() //acessor method or a getter
   {
      return destination;
   }
   public double getDistanceInKm()
   {
      return distance;  
   }
   public int getPassengers()
   {
      return passengers;
   }
   public double getDistanceInMiles()
   {
      return distance*.62;
   }
   /**publicvoid setPassengers(int numPassengers)
   {
      passengers = numPassengers;
   }
   */
  
}