package parkingDetails;

public class Bus extends Vehicle{
	
	private String licensePlate;
	private String make;
	private String model;
	private String type;
	
	public Bus() {
		
	}
	

	public Bus(String licensePlate, String make, String model, String type) {
		super();
		this.licensePlate = licensePlate;
		this.make = make;
		this.model = model;
		this.type = type;
	}



}
