public class Fruit implements Product
{
   private double cost;
   private String name;
   
   public Fruit(String n, double c)
   {
      cost=c;
      name=n;
   }
   
   public boolean equals(Object obj) //take in an object
   {
      if(obj instanceof Fruit == false) //if not a fruit, can't be equal
         return false;
      Fruit objFruit = (Fruit) obj; //cast an obj to a Fruit object
      if(objFruit.cost==cost && objFruit.name.equals(name))
         return true;
      return false;
   }
   public String toString()
   {
      return cost + " " + name;
   }
   public double getPrice()
   {
      return cost;
   }
   public void setPrice(double x)
   {
      cost = x;
   }
}