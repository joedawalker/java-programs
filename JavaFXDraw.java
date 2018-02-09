import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class JavaFXDraw extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}

	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 550, 550);
		primaryStage.setTitle("Draw Stuff");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Line l = new Line(100, 100, 200, 100);
		l.setStroke(Color.RED);
		
		Text t = new Text(100, 200, "Hello");
		t.setStroke(Color.BLUE);
		Font f = new Font("Times New Roman", 30);
		t.setFont(f);
		
		Circle c = new Circle(125, 300, 25);
		c.setFill(Color.PURPLE);
		c.setStroke(Color.PURPLE);
		
		Rectangle r = new Rectangle(100, 400, 100, 50);
		r.setFill(Color.GREEN);
		r.setStroke(Color.GREEN);
		r.setArcWidth(10);
		r.setArcHeight(10);
		
		Ellipse e = new Ellipse(325, 100, 50, 25);
		e.setFill(Color.CYAN);
		e.setStroke(Color.CYAN);
		
		Arc a = new Arc(325, 200, 50, 50, 0, 90);
		a.setFill(Color.DARKGOLDENROD);
		a.setStroke(Color.DARKGOLDENROD);
		a.setType(ArcType.ROUND);
		
		Polygon p = new Polygon(300, 300, 400, 300, 400, 350, 350, 325, 300, 350);
		p.setFill(Color.ORANGE);
		p.setStroke(Color.ORANGE);
		
		pane.getChildren().addAll(l, t, c, r, e, a, p);
	}
}
