/* A16dot5 Decimal/Binary/Hex converter application
 * This program will launch an application that:
 * -gives the three input options for the user correlated with
	^decimal, binary, and hex labels
 * -Allows the user to input numbers into either of the three text fields
 * -converts the given value into the two data formats not given when the
	^presses "enter" on their keyboard
   -display the converted formats in their corresponding text field
*/

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class A16dot5 extends Application {
	// create the three text fields
	private TextField tfDecimal = new TextField();
	private TextField tfHex = new TextField();
	private TextField tfBinary = new TextField();
		
	public static void main(String[] args) {
		Application.launch(args);
}

	public void start(Stage primaryStage) {
		// create a structure of the application
		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(5);
		gp.setVgap(5);
		
		// set the scene with a title A16dot5
		Scene scene = new Scene(gp, 350,200);
		primaryStage.setTitle("A16dot5");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		// create the Decimal, Hex, and Binary labels
		gp.add(new Label("Decimal"), 0, 0);
		gp.add(tfDecimal, 1, 0);
		
		gp.add(new Label("Hex"), 0, 1);
		gp.add(tfHex, 1, 1);
		
		gp.add(new Label("Binary"), 0, 2);
		gp.add(tfBinary, 1, 2);
		
		// set application to make conversions when keypress action is performed
		tfDecimal.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				// convert the user input into hexadecimal format
				tfHex.setText(Integer.toHexString(Integer.parseInt(tfDecimal.getText())));
				// convert the user input into binary format
				tfBinary.setText(Integer.toBinaryString(Integer.parseInt(tfDecimal.getText())));
			}
		});
		
		tfHex.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				// convert the user input into decimal format
				tfDecimal.setText(String.valueOf(Integer.parseInt(tfHex.getText(), 16)));
				// convert the user input into binary format
				tfBinary.setText(Integer.toBinaryString(Integer.parseInt(tfHex.getText(), 16)));
			}
		});
		
		tfBinary.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				// convert the user input into decimal format
				tfDecimal.setText(String.valueOf(Integer.parseInt(tfBinary.getText(), 2)));
				// convert the user input into hexadecimal format
				tfHex.setText(Integer.toHexString(Integer.parseInt(tfBinary.getText(), 2)));
			}
		});
	}
}