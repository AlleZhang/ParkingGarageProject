package parkingDetails;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;

public class ParkingStructure {
	private Set<Vehicle> parkingSpaces;
	private Set<Vehicle> parkingGarage;

	public ParkingStructure(Set<Vehicle> parkingGarage) {
		super();
		this.parkingGarage = parkingGarage;
		parkingGarage.addAll(parkingSpaces);
	}

	public Set<Vehicle> getParkingSpaces() {
		return parkingSpaces;
	}

	public void setParkingSpaces(Set<Vehicle> parkingSpaces) {
		this.parkingSpaces = parkingSpaces;
	}

	public Set<Vehicle> getParkingGarage() {
		return parkingGarage;
	}

	public void setParkingGarage(Set<Vehicle> parkingGarage) {
		this.parkingGarage = parkingGarage;
	}
	
	public void load() {
		try {
			FileInputStream fis = new FileInputStream("ParkingSpaces.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			parkingSpaces = (Set<Vehicle>)ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void save() {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("ParkingSpaces.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(parkingSpaces);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	
	
	

}
