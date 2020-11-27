package paket;

import java.io.File;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class VideoPlay extends Stage{
	
	private MediaView mv = new MediaView();
	final String path = new File("src/media/sladja.mp4").getAbsolutePath();
//	final String path = new File("src/sticky.mp4").getAbsolutePath();
	private Media media = new Media(new File(path).toURI().toString());
	
	private final MediaPlayer player = new MediaPlayer(media);
	
	private Button btnPause = new Button("Pause");
	
	public void getVideoPlay() {
		//	Setujemo plejer
		mv.setMediaPlayer(player);
		player.setAutoPlay(true);
		
//		DoubleProperty width = mv.fitWidthProperty();
//		DoubleProperty height = mv.fitHeightProperty();
//		width.bind(Bindings.selectDouble(mv.sceneProperty(), "width"));
//		height.bind(Bindings.selectDouble(mv.sceneProperty(), "height"));
		
		System.out.println("Dodajemo video...");
		
		VBox root = new VBox();
		
//		BorderPane box = new BorderPane();
		btnPause.setPadding(new Insets(10, 50, 10, 50));
//		box.setCenter(btnPause);
//		box.getChildren().add(btnPause);
		
		root.getChildren().addAll(new Group(new MediaView(player)), btnPause);
		
		this.setScene(new Scene(root, 480, 400));		//	width, height
		this.setTitle("7 sprat");
		this.setResizable(false);
		this.show();

		System.out.println("Pustamo video...");
		player.play();
		akcije();
	}
	
	private void akcije() {
		btnPause.setOnAction(e -> {
			if(btnPause.getText() != "Pause") {
				btnPause.setText("Pause");
				player.play();
			} else {
//				System.out.println("Pauziramo");
				player.pause();
				btnPause.setText("Continue");
			}
		});
	}
	
}
