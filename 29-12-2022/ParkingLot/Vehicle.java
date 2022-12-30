public class Vehicle
{
	private String vehicleType;
	private String vehicleNumber;
	private String vehicleColor;
	private String parkingId;
	
	public Vehicle(String vehicleType,String vehicleNumber,String vehicleColor,String parkingId)
	{
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;	
		this.vehicleColor = vehicleColor;
		this.parkingId = parkingId;
	}

	public void setVehicleNumber(String vehicleNumber)
	{
		this.vehicleNumber = vehicleNumber;		
	}

	public String getVehicleNumber()
	{	
		return vehicleNumber;
	}
		
	public void setVehicleType(String vehicleType)
	{
		this.vehicleType = vehicleType;		
	}

	public String getVehicleType()
	{	
		return vehicleType;
	}

	public void setVehicleColor(String vehicleColor)
	{
		this.vehicleColor = vehicleColor;	
	}

	public String getVehicleColor()
	{	
		return vehicleColor;
	}

	public void setParkingId(String parkingId)
	{
		this.parkingId = parkingId;		
	}

	public String getParkingId()
	{	
		return parkingId;
	}
	
}