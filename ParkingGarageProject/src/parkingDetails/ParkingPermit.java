package parkingDetails;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;

public class ParkingPermit {

	private int hours;
	private double cost;
	private Date current;
	private long startingTime;
	private Car car;
	private Bus bus;
	private Truck truck;
	private String parkingSpace;
	private static int parkingSpaceNumber = 1;
	private String parkingSpaceType;
	
	public ParkingPermit(){
		
	}
	
	public ParkingPermit(Car car, String parkingSpaceType, int hours) {
		super();
		File carParkingSpaceFile = new File("Parking Space.txt");
		try {
			Scanner input = new Scanner(carParkingSpaceFile);
			parkingSpaceNumber = input.nextInt();
		} catch (FileNotFoundException e1) {

		}

		parkingSpace = String.valueOf(parkingSpaceNumber++);
		startingTime = current.getTime();
		this.car = car;
		this.parkingSpaceType = parkingSpaceType;
		cost = hours * 2.00;
		try {
			PrintWriter pw = new PrintWriter("Parking Space.txt");
			pw.print(parkingSpaceNumber);
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public ParkingPermit(Bus bus, String parkingSpaceType) {
		super();
		File busParkingSpaceFile = new File("Bus Parking Space.txt");
		try {
			Scanner input = new Scanner(busParkingSpaceFile);
			parkingSpaceNumber = input.nextInt();
		} catch (FileNotFoundException e1) {

		}

		parkingSpace = String.valueOf(parkingSpaceNumber++);
		startingTime = current.getTime();
		this.bus = bus;
		this.parkingSpaceType = parkingSpaceType;
		cost = hours * 2.00;
		try {
			PrintWriter pw = new PrintWriter("Bus Parking Space.txt");
			pw.print(parkingSpaceNumber);
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	public ParkingPermit(Truck truck, String parkingSpaceType) {
		super();
		File truckParkingSpaceFile = new File("Truck Parking Space.txt");
		try {
			Scanner input = new Scanner(truckParkingSpaceFile);
			parkingSpaceNumber = input.nextInt();
		} catch (FileNotFoundException e1) {

		}
		startingTime = current.getTime();
		this.truck = truck;
		this.parkingSpaceType = parkingSpaceType;
		cost = hours * 2.00;
		try {
			PrintWriter pw = new PrintWriter("Truck Parking Space.txt");
			pw.print(parkingSpaceNumber);
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Car getCar() {
		return new Car();
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Bus getBus() {
		return new Bus();
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public Truck getTruck() {
		return new Truck();
	}

	public void setTruck(Truck truck) {
		this.truck = truck;
	}
	
	
}
