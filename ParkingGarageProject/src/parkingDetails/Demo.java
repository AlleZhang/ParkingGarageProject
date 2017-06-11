package parkingDetails;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Demo extends Application{

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane parkingGaragePane = new BorderPane();
		CarPane carPane = new CarPane();
		BusPane busPane = new BusPane();
		TruckPane truckPane = new TruckPane();
		ButtonsPane buttonsPane = new ButtonsPane();
		ParkingPane parkingPane = new ParkingPane();
		ParkingPermit permit = new ParkingPermit();
		Set<Vehicle> publicParkingSpots = new HashSet<Vehicle>();
		Set<Vehicle> privateParkingSpots = new HashSet<Vehicle>();
		Set<Vehicle> parkingLots = new HashSet<Vehicle>();
		Date current = new Date();
		int parkingSpotNumber = 1;
		String parkingNumber;
		ObservableList<String> parkingTypes =
				FXCollections.observableArrayList (
			    " ", "Public", "Private");
		ObservableList<String> parkingTimes =
				FXCollections.observableArrayList (
			    " ", "Weekday", "Weekend");
		
		
		// set up CarPane
		carPane.setAlignment(Pos.CENTER);
		carPane.add(carPane.getMakeLabel(), 0, 0);
		carPane.add(carPane.getMakeField(), 1, 0);
		carPane.add(carPane.getModelLabel(), 0, 1);
		carPane.add(carPane.getModelField(), 1, 1);
		carPane.add(carPane.getTypeLabel(), 0, 2);
		carPane.add(carPane.getTypeField(), 1, 2);
		carPane.add(carPane.getLicensePlateLabel(), 0, 3);
		carPane.add(carPane.getLicensePlateField(), 1, 3);
		
		// set up BusPane
		busPane.setAlignment(Pos.CENTER);
		busPane.add(busPane.getMakeLabel(), 0, 0);
		busPane.add(busPane.getMakeField(), 1, 0);
		busPane.add(busPane.getModelLabel(), 0, 1);
		busPane.add(busPane.getModelField(), 1, 1);
		busPane.add(busPane.getTypeLabel(), 0, 2);
		busPane.add(busPane.getTypeField(), 1, 2);
		busPane.add(busPane.getLicensePlateLabel(), 0, 3);
		busPane.add(busPane.getLicensePlateField(), 1, 3);
		
		// set up TruckPane
		truckPane.setAlignment(Pos.CENTER);
		truckPane.add(truckPane.getMakeLabel(), 0, 0);
		truckPane.add(truckPane.getMakeField(), 1, 0);
		truckPane.add(truckPane.getModelLabel(), 0, 1);
		truckPane.add(truckPane.getModelField(), 1, 1);
		truckPane.add(truckPane.getTypeLabel(), 0, 2);
		truckPane.add(truckPane.getTypeField(), 1, 2);
		truckPane.add(truckPane.getLicensePlateLabel(), 0, 3);
		truckPane.add(truckPane.getLicensePlateField(), 1, 3);
		
		
		
		// set up Parking Pane
		parkingPane.add(carPane, 0, 0);
		parkingPane.add(busPane, 0, 1);
		parkingPane.add(truckPane, 0, 2);
		parkingPane.add(parkingPane.getParkingSpaceTypeLabel(), 0, 3);
		parkingPane.add(parkingPane.getParkingSpaceTypeField(),1, 3);
		parkingPane.add(parkingPane.getHoursLabel(), 0, 4);
		parkingPane.add(parkingPane.getHoursField(), 1, 4);
		parkingPane.add(parkingPane.getPaymentTypeLabel(), 0, 5);
		parkingPane.add(parkingPane.getPaymentField(), 0, 4);
		
		
		// set up ButtonsPane
				buttonsPane.setAlignment(Pos.CENTER);
				buttonsPane.getChildren().addAll(buttonsPane.getSubmitButton(), 
						buttonsPane.getCancelButton());
				buttonsPane.getSubmitButton().setOnAction(event -> {
					
						while(!parkingPane.getParkingSpaceNumberField().getText().equals(null) && 
									!parkingPane.getParkingSpaceTypeField().getText().equals("private") &&
									!parkingPane.getPaymentField().getText().equals(null)) {
							if(!carPane.getMakeField().getText().equals(null) && 
									!carPane.getModelField().getText().equals(null)
									&& !carPane.getTypeField().getText().equals(null) && 
									!carPane.getLicensePlateField().getText().equals(null)) {
								String make = carPane.getMakeField().getText();
								String model = carPane.getModelField().getText();
								String type = carPane.getTypeField().getText();
								String licensePlate = carPane.getLicensePlateField().getText();
								int hours = Integer.parseInt(parkingPane.getHoursField().getText());
							publicParkingSpots.add(new Car(licensePlate, make, model, type));
							permit.setCar(new Car(licensePlate, make, model, type));
							
						} else if (!busPane.getMakeField().getText().equals(null) && 
								!busPane.getModelField().getText().equals(null)
								&& !busPane.getTypeField().getText().equals(null) && 
								!busPane.getLicensePlateField().getText().equals(null)) {
							String make = busPane.getMakeField().getText();
							String model = busPane.getModelField().getText();
							String type = busPane.getTypeField().getText();
							String licensePlate = busPane.getLicensePlateField().getText();
							publicParkingSpots.add(new Bus(licensePlate, make, model, type));
							permit.setBus(new Bus(licensePlate, make, model, type));
							
						} else if(!truckPane.getMakeField().getText().equals(null) && 
								!truckPane.getModelField().getText().equals(null)
								&& !truckPane.getTypeField().getText().equals(null) && 
								!truckPane.getLicensePlateField().getText().equals(null)) {
							String make = truckPane.getMakeField().getText();
							String model = truckPane.getModelField().getText();
							String type = truckPane.getTypeField().getText();
							String licensePlate = truckPane.getLicensePlateField().getText();
							publicParkingSpots.add(new Truck(licensePlate, make, model, type));
							permit.setBus(new Bus(licensePlate, make, model, type));
							
						} else {
							while(parkingPane.getParkingSpaceTypeField().getText().equals("private")) {
								if(!carPane.getMakeField().getText().equals(null) && 
										!carPane.getModelField().getText().equals(null)
										&& !carPane.getTypeField().getText().equals(null) && 
										!carPane.getLicensePlateField().getText().equals(null)) {
									String make = carPane.getMakeField().getText();
									String model = carPane.getModelField().getText();
									String type = carPane.getTypeField().getText();
									String licensePlate = carPane.getLicensePlateField().getText();
								privateParkingSpots.add(new Car(licensePlate, make, model, type));
							} else if (!busPane.getMakeField().getText().equals(null) && 
									!busPane.getModelField().getText().equals(null)
									&& !busPane.getTypeField().getText().equals(null) && 
									!busPane.getLicensePlateField().getText().equals(null)) {
								String make = busPane.getMakeField().getText();
								String model = busPane.getModelField().getText();
								String type = busPane.getTypeField().getText();
								String licensePlate = busPane.getLicensePlateField().getText();
								privateParkingSpots.add(new Bus(licensePlate, make, model, type));
								
							} else if(!truckPane.getMakeField().getText().equals(null) && 
									!truckPane.getModelField().getText().equals(null)
									&& !truckPane.getTypeField().getText().equals(null) && 
									!truckPane.getLicensePlateField().getText().equals(null)) {
								String make = truckPane.getMakeField().getText();
								String model = truckPane.getModelField().getText();
								String type = truckPane.getTypeField().getText();
								String licensePlate = truckPane.getLicensePlateField().getText();
								privateParkingSpots.add(new Truck(licensePlate, make, model, type)); 
								}
							}
							double cost = Double.parseDouble(parkingPane.getPaymentField().getText());
							ParkingStructure parkingGarage = new ParkingStructure(publicParkingSpots);
							
							parkingLots.addAll(privateParkingSpots);
							parkingLots.addAll(publicParkingSpots);
								
						}
						
					}
					
				});
		
		buttonsPane.getCancelButton().setOnAction(event -> {
			Platform.exit();
		});
		
		MenuBar menuBar = new MenuBar();
		Menu menuFile = new Menu("File");

        // --- Menu View
        Menu menuView = new Menu("View");

        // --- Menu Insert
        Menu menuInsert = new Menu("Insert");
        
        MenuItem insertCar = new MenuItem();
        insertCar.setOnAction(event -> {
        	parkingGaragePane.setCenter(carPane);
        	parkingGaragePane.setBottom(buttonsPane);
        	primaryStage.setScene(new Scene(parkingGaragePane));
            primaryStage.show();
        	
        });
        
        MenuItem insertBus = new MenuItem();
        insertBus.setOnAction(event -> {
        	parkingGaragePane.setCenter(busPane);
        	parkingGaragePane.setBottom(buttonsPane);
        	primaryStage.setScene(new Scene(parkingGaragePane));
            primaryStage.show();
        	
        });
        
        MenuItem insertTruck = new MenuItem();
        insertTruck.setOnAction(event -> {
        	parkingGaragePane.setCenter(truckPane);
        	parkingGaragePane.setBottom(buttonsPane);
        	primaryStage.setScene(new Scene(parkingGaragePane));
            primaryStage.show();
        	
        });
        
        MenuItem viewCar = new MenuItem();
        viewCar.setOnAction(event -> {
        	parkingGaragePane.setCenter(carPane);
        	parkingGaragePane.setBottom(buttonsPane);
        	primaryStage.setScene(new Scene(parkingGaragePane));
            primaryStage.show();
        });
        
        MenuItem viewBus = new MenuItem();
        viewBus.setOnAction(event -> {
        	parkingGaragePane.setCenter(busPane);
        	parkingGaragePane.setBottom(buttonsPane);
        	primaryStage.setScene(new Scene(parkingGaragePane));
            primaryStage.show();
        });
        
        MenuItem viewTruck = new MenuItem();
        viewTruck.setOnAction(event -> {
        	parkingGaragePane.setCenter(truckPane);
        	parkingGaragePane.setBottom(buttonsPane);
        	primaryStage.setScene(new Scene(parkingGaragePane));
            primaryStage.show();
        	
        });
        
        menuView.getItems().addAll(viewCar, viewBus, viewTruck);
        
       menuInsert.getItems().addAll(insertCar, insertBus, insertTruck);
        

       
        menuBar.getMenus().addAll(menuFile, menuView, menuInsert);
		
		// set up ParkingGaragePane
        parkingGaragePane.setTop(menuBar);
		parkingGaragePane.setCenter(parkingPane);
		parkingGaragePane.setBottom(buttonsPane);
		
		 primaryStage.setScene(new Scene(parkingGaragePane));
         primaryStage.show();
		
		
		
		
	}

}
