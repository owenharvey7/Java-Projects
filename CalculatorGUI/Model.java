package application;

public class Model {
	
	public double calculate(double number1, double number2, String operator) {
		switch(operator) {
		case"+": return number1 + number2;//Processes addition
		
		case"-": return number1 - number2;//Processes subtraction
		
		case"*": return number1 * number2;//Processes multiplication
		
		case"/": if(number2 == 0) {//If user divides by 0
			return 0;
		}	return number1 / number2;//Processes division
			
		default:
			return 0;
			
		}
		
		
		
		
	}

}
