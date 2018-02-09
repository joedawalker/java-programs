/* A15dot4
 * This program will create an application that will emulate a calculator
 * prompt the user for two numbers
 * add, subtract, multiply, or divide number2 with number1 depending on the user choice
 * display the result of the operation-^
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class A15dot4 extends Application {
	//set text fields for the numbers and result
	private TextField tfNumber1 = new TextField();
	private TextField tfNumber2 = new TextField();
	private TextField tfResult = new TextField();
	
	public static void main(String[] args) {
		Application.launch(args);

	}
	
	public void start(Stage primaryStage) {
		//create the boarder pane for the layout
		BorderPane bpLayout = new BorderPane();
		//set the scene to display the border pane
		Scene scene = new Scene(bpLayout, 400, 75);
		primaryStage.setTitle("A15dot4");
		primaryStage.setScene(scene);
		primaryStage.show();
		HBox hbText = new HBox(5);		
		tfNumber1.setPrefWidth(50);
		tfNumber2.setPrefWidth(50);
		tfResult.setPrefWidth(50);
		
		hbText.getChildren().addAll(new Label("Number 1: "), tfNumber1,
		new Label("Number 2: "), tfNumber2, new Label("Result: "), tfResult);
		
		// create a box to hold all of the buttons
		HBox hbButton = new HBox(5);
		// create the add, subtract, multiply, and divide buttons
		Button btnAdd = new Button("Add");
		btnAdd.setMinWidth(75);
		Button btnSubtract = new Button("Subtract");
		btnSubtract.setMinWidth(75);
		Button btnMultiply = new Button("Multiply");
		btnMultiply.setMinWidth(75);
		Button btnDivide = new Button("Divide");
		btnDivide.setMinWidth(75);
		
		btnAdd.setPrefWidth(50);
		btnSubtract.setPrefWidth(50);
		btnMultiply.setPrefWidth(50);
		btnDivide.setPrefWidth(50);
		
		// set the buttons to perform their corresponding opperations
		btnAdd.setOnAction (e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) +
			Double.parseDouble(tfNumber2.getText()) + "");
		});
		btnSubtract.setOnAction (e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) - Double.parseDouble(tfNumber2.getText()) + "");
		});
		btnMultiply.setOnAction (e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) * Double.parseDouble(tfNumber2.getText()) + "");
		});
		btnDivide.setOnAction (e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) / Double.parseDouble(tfNumber2.getText()) + "");
		});
		
		// display all of the components
		hbButton.getChildren().addAll(btnAdd, btnSubtract, btnMultiply, btnDivide);
		hbButton.setAlignment(Pos.CENTER);
		bpLayout.setCenter(hbText);
		bpLayout.setBottom(hbButton);
	}
}
