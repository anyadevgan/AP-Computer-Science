public class FlightArrivalInfo
{
   //fields -- should always private -- permission > type > name
   private boolean status;
   private String flightNumber;
   private int terminal;
   private String origin;
   private int hours;
   private int minutes;
   private double distance;
   
   //constructors -- used to create a new object
   public FlightArrivalInfo(boolean stat, String fnum, int term, String orig, int hrs, int min, double dist)
   {
      status = stat;
      flightNumber = fnum;
      terminal = term;
      origin = orig;
      hours = hrs;
      minutes = min;
      distance = dist;
   }
   
   //methods
   public boolean isDelayed()
   {
      return true;
   }
   public String getFlightNumber()
   {
      return flightNumber;
   }
   public int getTerminal()
   {
      return terminal;
   }
   public String getOrigin()
   {
      return origin;
   }
   public int getHours()
   {
      return hours;
   }
   public int getMinutes()
   {
      return minutes;
   }
   public double getDistance()
   {
      return distance;
   }
   public void setDistance(double newDistance)
   {
      distance = newDistance;
   }
   public void setOrigin(String newOrigin)
   {
      origin = newOrigin;
   }
}