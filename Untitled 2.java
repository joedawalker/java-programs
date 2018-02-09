import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.text.html.*;



public class javaFXBlank extends Application {
	public static void main(String[] args) {
		Application.Launch(args);
	}
	
	public void start(Stage primaryStage) {
		
		Image im = new Image("");
		ImageView iv = new ImageView(im);
		
		Pane pane = new Pane();
		pane.getChildren().add(iv);
		
		Scene scene = new Scene(pane, im.getWidth(), im.getHeight());
		primaryStage.setTitle("Show Photo");
		primaryStage.setScene(scene);
		primaryStage
	}
}