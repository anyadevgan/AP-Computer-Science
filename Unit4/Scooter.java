public class Scooter extends Vehicle
{
   public Scooter()
   {
      super(200);
   }
   
   public void refuel()
   {
      System.out.println("Rest leg");
   }
   
   public String getVehicleType()
   {
      return "Scooter";
   }
}