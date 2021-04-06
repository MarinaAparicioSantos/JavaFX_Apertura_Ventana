/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.viewsandcontrollers.main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController implements Initializable {

	@FXML
	AnchorPane ap;
	
	@FXML
	private Label label;

	
	@FXML
	private Button button;


	@FXML
	private TextField textfield;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}

	@FXML
	private void abrirVentanaHija(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("../model/Model.fxml"));
		Parent root = loader.load();
		
		Scene scene = new Scene(root);
		Stage dialog = new Stage();
		Node source =(Node) event.getSource();
		Stage parent = (Stage) source.getScene().getWindow();
		
		dialog.initOwner(parent);
		dialog.initModality(Modality.APPLICATION_MODAL);
	
		
		Label label =(Label)root.getChildrenUnmodifiable().get(0);
		label.setText(textfield.getText());
		dialog.setScene(scene);
		dialog.show();
		
		
		
	}
	

}
