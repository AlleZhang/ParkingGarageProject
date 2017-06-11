package parkingDetails;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ParkingSpace {
	private ParkingPermit permit;
	private String availableSpace;
	private static int availableParkingSpaceNumber = 1;
	private String parkingSpaceType;
	
	public ParkingSpace(ParkingPermit permit, String parkingSpaceType) {
		File availableCarParkingSpaceFile = new File("Available Parking Space.txt");
		try {
			Scanner input = new Scanner(availableCarParkingSpaceFile);
			availableParkingSpaceNumber = input.nextInt();
		} catch (FileNotFoundException e1) {

		}
		availableSpace = String.valueOf(availableParkingSpaceNumber++);
		this.permit = permit;
		this.parkingSpaceType = parkingSpaceType;
		try {
			PrintWriter pw = new PrintWriter("Available Car Parking Space.txt");
			pw.print(availableParkingSpaceNumber);
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public ParkingPermit getPermit() {
		return permit;
	}

	public void setPermit(ParkingPermit permit) {
		this.permit = permit;
	}

	public String getAvailableSpace() {
		return availableSpace;
	}

	public void setAvailableSpace(String availableSpace) {
		this.availableSpace = availableSpace;
	}

	public String getParkingSpaceType() {
		return parkingSpaceType;
	}

	public void setParkingSpaceType(String parkingSpaceType) {
		this.parkingSpaceType = parkingSpaceType;
	}

	public static int getAvailableParkingSpaceNumber() {
		return availableParkingSpaceNumber;
	}
	
	
	
	
	

}
