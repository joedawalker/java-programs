import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class A15dot5 extends Application {

	private TextField tfInvestmentAmount = new TextField();
	private TextField tfNumberOfYears = new TextField();
	private TextField tfAnnualInterestRate = new TextField();
	private TextField tfFutureValue = new TextField();
	
	public static void main(String[] args) {
		Application.launch(args);

	}

	public void start(Stage primaryStage) {
		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(5);
		gp.setVgap(5);
		
		Scene scene = new Scene(gp, 350,200);
		primaryStage.setTitle("Investment Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		gp.add(new Label("Investment Amount:"), 0, 0);
		gp.add(tfInvestmentAmount, 1, 0);
		
		gp.add(new Label("Number of Years:"), 0, 1);
		gp.add(tfNumberOfYears, 1, 1);
		
		gp.add(new Label("Annual Interest Rate:"), 0, 2);
		gp.add(tfAnnualInterestRate, 1, 2);
		
		gp.add(new Label("Future Value:"), 0, 3);
		tfFutureValue.setEditable(false);
		gp.add(tfFutureValue, 1, 3);
		
		Button bCalc = new Button("Calculate");
		bCalc.setMinWidth(165);
		bCalc.setOnAction(e -> CalculateValue());
		gp.add(bCalc, 1, 4);
		
		Button bReset = new Button("Reset");
		bReset.setMinWidth(165);
		bReset.setOnAction(e -> resetForm());
		gp.add(bReset, 0, 4);
		
		gp.getStyleClass().add("grid-pane");
		//gp.getStyleSheets().add("InvestmentCalculator.css");
		
		
	}
	
	private void resetForm() {
		tfAnnualInterestRate.clear();
		tfInvestmentAmount.clear();
		tfNumberOfYears.clear();
		tfFutureValue.clear();
		
	}

	private void CalculateValue() {
		try{
			double investmentAmount = Double.parseDouble(tfInvestmentAmount.getText());
			double numberOfYears = Double.parseDouble(tfNumberOfYears.getText());
			double annualInterestRate = Double.parseDouble(tfAnnualInterestRate.getText());
			double monthlyInterestRate = annualInterestRate / 1200.0;
			double futureValue = investmentAmount * Math.pow(1.0 + monthlyInterestRate, numberOfYears * 12.0);
			tfFutureValue.setText(String.format("%.2f", futureValue));
			
			
		} catch (Exception e) {
			tfFutureValue.setText("Enter numeric values");
		} 
	}
}


