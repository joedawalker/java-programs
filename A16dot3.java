import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class A16dot3 extends Application {
	
	Circle circleRed = new Circle(150, 50, 20);
	Circle circleYellow = new Circle(150, 100, 20);
	Circle circleGreen = new Circle(150, 150, 20);
	
	RadioButton rbRed = new RadioButton("Red");
	RadioButton rbYellow = new RadioButton("Yellow");
	RadioButton rbGreen = new RadioButton("Green");
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void start(Stage primaryStage) {
		Pane p = new Pane();
		
		Rectangle r = new Rectangle(120, 20, 60, 160);
		r.setFill(Color.LIGHTGRAY);
		r.setStroke(Color.GRAY);
		
		p.getChildren().addAll(r, circleRed, circleYellow, circleGreen);
		resetLights();
		
		ToggleGroup tg = new ToggleGroup();
		rbRed.setToggleGroup(tg);
		rbYellow.setToggleGroup(tg);
		rbGreen.setToggleGroup(tg);
		
		circleRed.setOnMousePressed(e -> setRed());
		circleYellow.setOnMousePressed(e -> setYellow());
		circleGreen.setOnMousePressed(e -> setGreen());
		
		rbRed.setOnAction(e -> setRed());
		rbYellow.setOnAction(e -> setYellow());
		rbGreen.setOnAction(e -> setGreen());
		
		HBox hb = new HBox(50);
		hb.setPrefHeight(50);
		hb.getChildren().addAll(rbRed, rbYellow, rbGreen);
		hb.setAlignment(Pos.CENTER);
		
		BorderPane bp = new BorderPane();
		bp.setCenter(p);
		bp.setBottom(hb);
		
		
		Scene scene = new Scene(bp, 300, 250);
		primaryStage.setTitle("Traffic Light");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private void resetLights() {
		circleRed.setFill(Color.GRAY);
		circleYellow.setFill(Color.GRAY);
		circleGreen.setFill(Color.GRAY);
	}
	
	private void setRed() {
		resetLights();
		circleRed.setFill(Color.RED);
		rbRed.setSelected(true);
	}
	
	private void setYellow() {
		resetLights();
		circleYellow.setFill(Color.YELLOW);
		rbYellow.setSelected(true);
	}
	
	private void setGreen() {
		resetLights();
		circleGreen.setFill(Color.LIMEGREEN);
		rbGreen.setSelected(true);
	}
}