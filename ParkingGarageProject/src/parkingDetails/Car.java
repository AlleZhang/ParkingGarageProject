package parkingDetails;

import java.io.File;
import java.util.Scanner;

public class Car extends Vehicle{
	private String licensePlate;
	private String make;
	private String model;
	private String type;
	
	public Car() {
		
	}
	
	

	public Car(String licensePlate, String make, String model, String type) {
		super();
		this.licensePlate = licensePlate;
		this.make = make;
		this.model = model;
		this.type = type;
	}

	

}
