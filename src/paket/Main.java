package paket;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Effect;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {			
			MainFrame root = new MainFrame();
			/*
			VideoPlay vp = new VideoPlay();
			vp.getVideoPlay();
			
			VideoTest vt = new VideoTest();
			vt.testVideo();
			 */
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
