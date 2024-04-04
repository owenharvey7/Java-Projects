import java.util.Scanner; //Imports the necessary components to run the program
import java.util.Random; 



public class HarveyOwenMenuDrivenCalculator {

	public static void main(String[] args) {
		int num1=0,num2=0,total=0,option,ex = 0; //Creates integer variables
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("\tBasic Math Calculator");//Title
			System.out.println("\t---------------------");
			System.out.println("\tEnter your choice from the following menu:");
			System.out.println("\t------------------------------------------");
			System.out.println("1.\tAddition");//All the menu options 
			System.out.println("2.\tSubtraction");
			System.out.println("3.\tMultiplication");
			System.out.println("4.\tDivision");
			System.out.println("5.\tGenerate Random number");
			System.out.println("6.\tQuit");
			option = sc.nextInt();//Stores the users answers
			if(option>6||option<1) {
				ex=ex+1;
			}
			switch(option)
			{//The math and titles for every option
			case 1:System.out.println("You chose to add two numbers: ");
			System.out.println("Enter your first number:");num1=sc.nextInt();System.out.println("Enter your second number:");num2=sc.nextInt();total=num1+num2;
			System.out.println("The two numbers you chose added together is " +total);
			break;
			case 2:System.out.println("You chose to subtract two numbers: ");
			System.out.println("Enter your first number:");num1=sc.nextInt();System.out.println("Enter your second number:");num2=sc.nextInt();total=num1-num2;
			System.out.println("The two numbers you chose subtracted together is " +total);	
			break;
			case 3:System.out.println("You chose to multiply two numbers: ");
			System.out.println("Enter your first number:");num1=sc.nextInt();System.out.println("Enter your second number:");num2=sc.nextInt();total=num1*num2;
			System.out.println("The two numbers you chose multiplied together is " +total);
			break;
			case 4:System.out.println("You chose to divide two numbers: ");
			System.out.println("Enter your first number:");num1=sc.nextInt();System.out.println("Enter your second number:");num2=sc.nextInt();total=num1/num2;
			if(num2==0) {
				System.out.println("You can't divide by 0");
			}
			else {
				System.out.println("The two numbers you chose divided together is " +total+ "with a quotient of "+(num1%num2));
			}
			break;
			case 5:System.out.println("You chose to get two random numbers: ");
			System.out.println("Enter your lower limit:");num1=sc.nextInt();System.out.println("Enter your upper limit:");num2=sc.nextInt();total=num1+num2;
			Random rand = new Random();
			int rand_int1 = rand.nextInt(num1 + num2); 
			System.out.println("The random intigers is: "+rand_int1); 
			break;
			case 6://If the user wants to quit
			System.out.println("You have chosen to quit");
			System.out.println("-----------------------------------------");
			System.out.println("Thank you for using the basic calculator!");
			System.exit(1);
			break;
			default://Tells their option was incorrect
				 ex=ex+1;
				System.out.println("Invalid choice, choice "+option+ " was not an option");

			}
			System.out.println("Do you want to continue?1.Yes 2.No");
			//Asks the user if they want to proceed
			ex=sc.nextInt();	//A thank you message for the user for running the program
		}while(ex<4);
		System.out.println("-----------------------------------------");
		System.out.println("Thank you for using the basic calculator!");
	}
	}