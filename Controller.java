package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Controller extends Application{
	
	@FXML
	private Button button;
	
	@FXML
	private ImageView imgview;
	
	public void initialize() {
		Image image = new Image(getClass().getResourceAsStream("/images/smileyface.png")); 
		imgview.setImage(image);
		System.out.println("run");
	}
	
	public void click (ActionEvent e) throws InterruptedException {
		Image image = new Image(getClass().getResourceAsStream("/images/shockface.png"));
		imgview.setImage(image);
		System.out.println("set");
	}

	@Override
	public void start(Stage arg0) throws Exception {
		
	}
	
}
