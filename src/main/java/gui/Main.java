package gui;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
 
public class Main extends Application {
 

	  @Override
	    public void start(Stage stage) throws IOException {

	    	
	    	  Parent root = FXMLLoader.load(getClass().getResource("viewsandcontrollers/main/Main.fxml"));
	          Scene scene = new Scene(root);
	          stage.setScene(scene);
	          stage.show();
	    }

	    public static void main(String[] args) {
	        launch();
	    }
 
}

//gui.viewsandcontrollers.main --------> primero
//gui.viewsandcontrollers.model----------> segundo