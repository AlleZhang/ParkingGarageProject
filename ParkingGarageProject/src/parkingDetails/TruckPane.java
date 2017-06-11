package parkingDetails;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class TruckPane extends GridPane{
	
	private Label makeLabel;
	private Label modelLabel;
	private Label typeLabel;
	private Label licensePlateLabel;
	private TextField makeField;
	private TextField modelField;
	private TextField typeField;
	private TextField licensePlateField;
	private GridPane truckPane;

	
	public TruckPane() {
		super();
		this.makeLabel = getMakeLabel();
		this.modelLabel = getModelLabel();
		this.typeLabel = getTypeLabel();
		this.licensePlateLabel = getLicensePlateLabel();
		this.makeField = getMakeField();
		this.modelField = getModelField();
		this.typeField = getTypeField();
		this.truckPane = getTruckPane();
	}

	public Label getMakeLabel() {
		return new Label("Truck Make: ");
	}

	public void setMakeLabel(Label makeLabel) {
		this.makeLabel = makeLabel;
	}

	public Label getModelLabel() {
		return new Label("Truck Model: ");
	}

	public void setModelLabel(Label modelLabel) {
		this.modelLabel = modelLabel;
	}

	public Label getTypeLabel() {
		return new Label("Truck Type: ");
	}

	public void setTypeLabel(Label typeLabel) {
		this.typeLabel = typeLabel;
	}

	public Label getLicensePlateLabel() {
		return new Label("Truck License Plate: ");
	}

	public void setLicensePlateLabel(Label licensePlateLabel) {
		this.licensePlateLabel = licensePlateLabel;
	}

	public TextField getMakeField() {
		return new TextField();
	}

	public void setMakeField(TextField makeField) {
		this.makeField = makeField;
	}

	public TextField getModelField() {
		return new TextField();
	}

	public void setModelField(TextField modelField) {
		this.modelField = modelField;
	}

	public TextField getTypeField() {
		return new TextField();
	}

	public void setTypeField(TextField typeField) {
		this.typeField = typeField;
	}

	public TextField getLicensePlateField() {
		return new TextField();
	}

	public void setLicensePlateField(TextField licensePlateField) {
		this.licensePlateField = licensePlateField;
	}

	public GridPane getTruckPane() {
		return new GridPane();
	}

	public void setCarPane(GridPane truckPane) {
		this.truckPane = truckPane;
	}
	

}
