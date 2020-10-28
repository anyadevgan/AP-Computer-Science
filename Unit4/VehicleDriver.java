import java.util.*;
public class VehicleDriver{
   public static void main(String[] args)
   {
      List<Vehicle> vArr = new ArrayList<Vehicle>();
      vArr.add(new Bus());   //This is just my example. I used maxSpeed of 40
      vArr.add(new Scooter());
      int[] speeds = {30, 50, 100, 90, 160, 80, 50, 15};
      int[] distances = {5, 1, 13, 7, 12, 5, 2, 2};
   	
      for(Vehicle v:vArr)//for each loop over vArr
      {
         System.out.println(v.getVehicleType());
         for(int k=0; k<speeds.length; k++)
         {
            v.followSpeedLimit(speeds[k], distances[k]);
         }
         System.out.println(v.getTotalTime() + "hours");
         v.refuel();
      }
   }
}

/*
Bike
1.3 hours
Sleep!!!
Tesla
0.7052777777777778 hours
Recharge at charging station.
*/