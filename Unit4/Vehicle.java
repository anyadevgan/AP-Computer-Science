public abstract class Vehicle
{
	private int maxSpeed;
	private double totalTime;
	//precondition: maxSpeed > 0;
	public Vehicle(int maxSpeed)
	{
		this.maxSpeed = maxSpeed;
		totalTime = 0;
	}
	
	//what does abstract mean?
	//This method should print a message about refueling
	public abstract void refuel();
	
	//Should return a String of the vehicle
	public abstract String getVehicleType();
	
  /**
   * This method should update totalTime.
	* The vehicle should travel as fast as possible.
   * Note that a vehicle can only travel up to maxSpeed
   */

	public void followSpeedLimit(int speedLimit, int distance)
	{
      if(maxSpeed < speedLimit)
         totalTime += (distance * 1.0) / (maxSpeed * 1.0);
      else
         totalTime += (distance * 1.0) / (speedLimit * 1.0);
	}
   
	public double getTotalTime()
	{
		return totalTime;
	}
}