package parkingDetails;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ButtonsPane extends HBox{
	HBox buttonsPane;
	Button submitButton;
	Button cancelButton;
	
	public ButtonsPane() {
		super();
		this.buttonsPane = getButtonsPane();
		this.submitButton = getSubmitButton();
		this.cancelButton = getCancelButton();
	}
	public HBox getButtonsPane() {
		return new HBox();
	}
	public void setButtonsPane(HBox buttonsPane) {
		this.buttonsPane = buttonsPane;
	}
	public Button getSubmitButton() {
		return new Button("Submit");
	}
	public void setSubmitButton(Button submitButton) {
		this.submitButton = submitButton;
	}
	public Button getCancelButton() {
		return new Button("Cancel");
	}
	public void setCancelButton(Button cancelButton) {
		this.cancelButton = cancelButton;
	}
	
	
	

}
