	//Name______________________________ Date_____________
public class Salesperson 
{
   	//data fields
   private String myName;
   private int myCars, myTrucks;

   public Salesperson()
   {
      myName = "";
      myCars = 0;
      myTrucks = 0;
   }
   public Salesperson(String name, int cars, int trucks)
   {
      myName = name;
      myCars = cars;
      myTrucks = trucks;
   }	
   public void setName(String name)
   {
      myName = name;
   }	
   public void setCars(int cars)
   {  
      myCars = cars;
   }	
   public void setTrucks(int trucks)
   {
      myTrucks = trucks;
   }
   public String getName(){return myName;}
   public int getCars(){return myCars;}
   public int getTrucks(){return myTrucks;}
   public int getTotal(){return myTrucks+myCars;}
   public String toString()
   {
      return myName + "\t\t"+myCars+"\t\t"+myTrucks+"\t\t"+getTotal();
   }

}