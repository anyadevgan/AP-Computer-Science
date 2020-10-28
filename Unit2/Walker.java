public class Walker
{
   //fields
   private double distance;
   
   //constructors
   public Walker()
   {
      distance = 0;
   }
   
   //methods
   public void walk(double move)
   {
      distance = distance + ((Math.random() * (move - 1)) + 1);
   }
   
   public double getX()
   {
      return distance;
   }
   
}