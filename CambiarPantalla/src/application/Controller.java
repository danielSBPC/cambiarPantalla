package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {
	
	AnchorPane mypane; 
	
	@FXML
	private void openStage() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("forest2.fxml"));
			mypane = (AnchorPane) loader.load();
			Scene scene = new Scene(mypane);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
		
		} catch (Exception e) {
			
		}
	}
}
