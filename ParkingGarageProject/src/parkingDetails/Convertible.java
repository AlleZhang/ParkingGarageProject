package parkingDetails;

public class Convertible extends Car{
	private String licensePlate;
	private String make;
	private String model;
	private String type;
	
	public Convertible(String licensePlate, String make, String model, String type, String licensePlate2, String make2,
			String model2, String type2) {
		super(licensePlate, make, model, type);
		licensePlate = licensePlate2;
		make = make2;
		model = model2;
		type = type2;
	}

	public void openTop() {
		
	}

}
