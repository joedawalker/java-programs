import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JavaFXBlank extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}

	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("Draw Something");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
