public class Bus extends Vehicle
{
   public Bus()
   {
      super(75);
   }
   
   public void refuel()
   {
      System.out.println("Refuel with gas");
   }
   
   public String getVehicleType()
   {
      return "Bus";
   }
}