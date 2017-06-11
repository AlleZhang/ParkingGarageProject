package parkingDetails;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CarPane extends GridPane{
	private Label makeLabel;
	private Label modelLabel;
	private Label typeLabel;
	private Label licensePlateLabel;
	private TextField makeField;
	private TextField modelField;
	private TextField typeField;
	private TextField licensePlateField;
	private GridPane carPane;

	

	public CarPane() {
		super();
		this.makeLabel = getMakeLabel();
		this.modelLabel = getModelLabel();
		this.typeLabel = getTypeLabel();
		this.licensePlateLabel = getLicensePlateLabel();
		this.makeField = getMakeField();
		this.modelField = getModelField();
		this.typeField = getTypeField();
		this.licensePlateField = getLicensePlateField();
		this.carPane = getCarPane();
	}

	public Label getMakeLabel() {
		return new Label("Car Make: ");
	}

	public void setMakeLabel(Label makeLabel) {
		this.makeLabel = makeLabel;
	}

	public Label getModelLabel() {
		return new Label("Car Model: ");
	}

	public void setModelLabel(Label modelLabel) {
		this.modelLabel = modelLabel;
	}

	public Label getTypeLabel() {
		return new Label("Car Type: ");
	}

	public void setTypeLabel(Label typeLabel) {
		this.typeLabel = typeLabel;
	}

	public Label getLicensePlateLabel() {
		return new Label("Car License Plate: ");
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

	public GridPane getCarPane() {
		return new GridPane();
	}

	public void setCarPane(GridPane carPane) {
		this.carPane = carPane;
	}
	
	

}
