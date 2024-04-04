import java.util.Scanner;

public class HarveyOwenBMICalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //prompts user input
		
		System.out.println("You are using BMI calculator! ");//A welcome message
		System.out.println("----------------------------- ");//For some visual appeal
		
		System.out.println("Enter your height in inches: "); //Asks for the users height in inches and stores it as float variable h
		double h = scan.nextFloat();
		
		System.out.println("Enter your weight in pounds: ");//Asks for the users weight in inches and stores it as float variable w
		double w = scan.nextFloat();
		
		double BMI = (w/(h*h))*703; //Does the calculation for the BMI, and stores it in value BMI. 
		
		System.out.println("Your bmi is " + BMI); // Tells the user what their BMI is

		//Tells the user where their BMI puts them in the BMI index. 
		if(BMI<19) {
			System.out.println("Your bmi is under 19, this puts you in the underweight range.");
		}else if(BMI>=19 && BMI < 25) {
			System.out.println("Your bmi is in between 19 and 24.This puts you in the normal weight range.");
		}else if(BMI>=25 && BMI <29){
			System.out.println("Your bmi is in between 25 and 29. This puts you in the overweight range.");
		}else if(BMI>=30 && BMI< 39) {
			System.out.println("Your bmi is in between 30 and 39. This puts you in the obese range.");
		}else if(BMI>40) {
			System.out.println("Your bmi is over 40. This puts you in the extremely obese range.");
		}
		System.out.println("What would your ideal BMI be? "); //Asks for the users ideal BMI and stores it in the float variable i.
		double i = scan.nextFloat();
		double n = ((i/703)*(h*h)); // Does the math to get the weight needed for idea BMI and stores it in float variable n
		System.out.println("To get to your ideal BMI your weight needs to be " + n + " pounds.");//Tells the user what weight they need to be to reach there ideal BMI
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");//Some more decoration for fun
		System.out.println("Thank you for using our BMI calculator! Good luck on your fitness journy! :)");//A thank you message to the user

		
		
	}

}
