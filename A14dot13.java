/* A14dot13
 * This Program will create an Application to display
 * 4 different coler arcs making a pie chart
 * The application will also show the category and
 * percentage of each arc.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Polygon;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class A14dot13 extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}

	public void start(Stage primaryStage) {
		
		//create new pane
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 550, 550);
		primaryStage.setTitle("A14dot13");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		// create text and arc for Project
		Text t = new Text(250, 195, "Project - 20%");
		Arc a = new Arc(200, 200, 50, 50, 0, 72);
		a.setFill(Color.RED);
		a.setStroke(Color.RED);
		a.setType(ArcType.ROUND);
		
		//create text and arc for Quiz
		Text t1 = new Text(200, 140, "Quiz - 10%");
		Arc a1 = new Arc(200, 200, 50, 50, 72, 36);
		a1.setFill(Color.BLUE);
		a1.setStroke(Color.BLUE);
		a1.setType(ArcType.ROUND);
		
		// create text and arc for Midterm
		Text t2 = new Text(60, 200, "Midterm - 30%");
		Arc a2 = new Arc(200, 200, 50, 50, 108, 108);
		a2.setFill(Color.GREEN);
		a2.setStroke(Color.GREEN);
		a2.setType(ArcType.ROUND);
		
		// creat text and arc for Final
		Text t3 = new Text(200, 270, "Final - 40%");
		Arc a3 = new Arc(200, 200, 50, 50, 216, 144);
		a3.setFill(Color.ORANGE);
		a3.setStroke(Color.ORANGE);
		a3.setType(ArcType.ROUND);
		
		// send all of the objects to the pane.
		pane.getChildren().addAll(a, a1, a2, a3, t, t1, t2, t3);
	}
}
