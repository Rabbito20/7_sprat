package paket;

import java.net.URL;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Stop;
import javafx.stage.Stage;

public class MainFrame extends Stage{
	
	/*
	 * Ovde ce da ide ceo GUI.
	 * Mozda i logika.
	 * */
	
	//	Main frame
//	MainFrame stage1 = new MainFrame();
	BorderPane root = new BorderPane();
	Button btn = new Button("Pritisni me!");
	Label lbl = new Label("Pritisni dugme!");
	
	//	Otvoreni prozor
//	String link = "https://www.youtube.com/watch?v=9Iq6CtpYQS0";
	VideoPlay video = new VideoPlay();
	
	Label lbl2 = new Label("7 SPRAT!");
//	Label lbl3 = new Label(link);
	
	public MainFrame() {
		Scene scene = new Scene(root, 300, 200);
//		root.setPadding(new Insets(5, 5, 5, 5));

//		btn.setPadding(new Insets(1, 3, 3, 3));
		root.setCenter(btn);
		
//		Padding su razmaci (top, right, bottom, left) 
//		izmedju komponenti ili komponentne od ivice prozora
		lbl.setPadding(new Insets(80, 5, 5, 150));
		root.setTop(lbl);
		
//		Pritiskom na dugme otvaramo novi prozor
		btn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					try {
						BorderPane secRoot = new BorderPane();

//						System.out.println("Sladjaaaaa");
						video.getVideoPlay();
						System.out.println("Pusta video");
						
						close();	//	Zatvaramo prvi prozor
						
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			});

		//	Definisali smo scenu
		this.setScene(scene);
		this.setResizable(false);
		this.setMinWidth(400);
		this.setMinHeight(150);
		this.setTitle("Click it!");
		this.show();	
	}
	
}
