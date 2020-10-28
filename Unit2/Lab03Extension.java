import java.util.*;

public class Lab03Extension
{
   public static void main(String[] args) 
   {      
      Walker[] walkingGroup = new Walker[3];
      double[] distAlex = new double[3];
      double[] distSue = new double[3];
      double[] distJoe = new double[3];
      
      Walker alex = new Walker();
      Walker sue = new Walker();
      Walker joe = new Walker();
    
      walkingGroup[0] = alex;
      walkingGroup[1] = sue;
      walkingGroup[2] = joe;
      
      //go on group walks
      for(int k = 0; k < 3; k++)
      {
         alex.walk(Math.random()*25);
         double x = alex.getX();
         distAlex[k] = x;
         
         sue.walk(Math.random()*25);
         double y = sue.getX();
         distSue[k] = y;
         
         joe.walk(Math.random()*25);
         double z = joe.getX();
         distJoe[k] = z;
      }
      
      //determine the best walker
      double loc1 = alex.getX();
      double loc2 = sue.getX();
      double loc3 = joe.getX();
      
      if((loc1 > loc2) && (loc1 > loc3))
      {
         System.out.println("The best walker is alex; he walked " + loc1 + " km");
      }
      
      if((loc2 > loc1) && (loc2 > loc3))
      {
         System.out.println("The best walker is sue; she walked " + loc2 + "km");
      }
      
      if((loc3 > loc1) && (loc3 > loc2))
      {
         System.out.println("The best walker is joe; he walked " + loc3 + "km");
      }
      
      //alex average distance
      double avgAlex = (distAlex[0] + distAlex[1] + distAlex[2])/3.0;
      System.out.println("Alex's average distance: " + avgAlex);
      
      //sue average distance
      double avgSue = (distSue[0] + distSue[1] + distSue[2])/3.0;
      System.out.println("Sue's average distance: " + avgSue);
      
      //joe average distance
      double avgJoe = (distJoe[0] + distJoe[1] + distJoe[2])/3.0;
      System.out.println("Joe's average distance: " + avgJoe);
   }

}