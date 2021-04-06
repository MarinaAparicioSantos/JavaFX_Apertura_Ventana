
package gui.viewsandcontrollers.model;

import java.net.URL;
import java.util.ResourceBundle;

import gui.viewsandcontrollers.main.MainController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class ModelController implements Initializable {

    @FXML
    private Button btnVolver;
    private Label label;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void volver(ActionEvent event) {

    	Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();
    }
   
    

}
