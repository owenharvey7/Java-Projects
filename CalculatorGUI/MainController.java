package application;
	
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class MainController {
	@FXML
	private Label result;
	private double number1 = 0;
	private double number2 = 0;
	private String operator = "";
	private boolean start = true;
	private Model model = new Model();
	
	
	@FXML
	public void processNumbers(ActionEvent event) {
		if(start) {
			result.setText("");//Starts with nothing
			start = false;
		}
		String value = ((Button)event.getSource()).getText();//Gets the users choices for numbers
		
		result.setText(result.getText()+ value);//Adds the numbers
	}
	
	@FXML
	public void processOperators(ActionEvent event) {
		String value = ((Button)event.getSource()).getText();//Gets operator buttons
		
		if(!value.equals("=")) {
			if(!operator.isEmpty())
				
			switch(value) {
				case"C":result.setText("0.0");//If user chooses to clear from the calculator
				this.number1 = 0.0;
				this.number2 = 0.0;//Makes numbers 0
				result.setText("0.0");
				break;
				default:
				break;
				
			}
			
			operator = value;
			number1 = Double.parseDouble(result.getText());
			result.setText("");
		}else {
			if(operator.isEmpty())
				return;
			number2 = Double.parseDouble(result.getText());
			double output = model.calculate(number1, number2, operator);
			result.setText(String.valueOf(output));
			operator = "";
			start = true;
			
		}
	}

}