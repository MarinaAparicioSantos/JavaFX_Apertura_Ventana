package gui.viewsandcontrollers.model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ModelController {

	@FXML
	private Label label;

	public void initialize() {
		// TODO
	}

	@FXML
	private void volver(ActionEvent event) {
		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();
	}

}
