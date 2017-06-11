package parkingDetails;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class ParkingPane extends GridPane{
	private Label parkingSpaceNumber;
	private TextField parkingSpaceNumberField;
	private Label parkingSpaceTypeLabel;
	private TextField parkingSpaceTypeField;
	private Label hoursLabel;
	private TextField hoursField;
	private Label paymentTypeLabel;
	private TextField paymentField;
	
	
	public ParkingPane() {
		super();
		this.parkingSpaceTypeLabel = getParkingSpaceTypeLabel();
		this.parkingSpaceTypeField = getParkingSpaceTypeField();
		this.paymentTypeLabel = getPaymentTypeLabel();
		this.paymentField = getPaymentField();
		this.hoursLabel = getHoursLabel();
		this.hoursField = getHoursField();
	}
	
	public Label getHoursLabel() {
		return new Label("Hours: ");
	}

	public void setHoursLabel(Label hoursLabel) {
		this.hoursLabel = hoursLabel;
	}

	public TextField getHoursField() {
		return new TextField();
	}

	public void setHoursField(TextField hoursField) {
		this.hoursField = hoursField;
	}

	public Label getParkingSpaceNumber() {
		return new Label("Parking Space Number");
	}

	public void setParkingSpaceNumber(Label parkingSpaceNumber) {
		this.parkingSpaceNumber = parkingSpaceNumber;
	}

	public TextField getParkingSpaceNumberField() {
		return parkingSpaceNumberField;
	}

	public void setParkingSpaceNumberField(TextField parkingSpaceNumberField) {
		this.parkingSpaceNumberField = parkingSpaceNumberField;
	}

	public Label getParkingSpaceTypeLabel() {
		return new Label("Parking Space Type: ");
	}
	public void setParkingSpaceTypeLabel(Label parkingSpaceTypeLabel) {
		this.parkingSpaceTypeLabel = parkingSpaceTypeLabel;
	}
	public TextField getParkingSpaceTypeField() {
		return new TextField();
	}
	public void setParkingSpaceTypeField(TextField parkingSpaceTypeField) {
		this.parkingSpaceTypeField = parkingSpaceTypeField;
	}
	public Label getPaymentTypeLabel() {
		return new Label("Payment Type: ");
	}
	public void setPaymentTypeLabel(Label paymentTypeLabel) {
		this.paymentTypeLabel = paymentTypeLabel;
	}
	public TextField getPaymentField() {
		return new TextField();
	}
	public void setPaymentField(TextField paymentField) {
		this.paymentField = paymentField;
	}
	
	

}
