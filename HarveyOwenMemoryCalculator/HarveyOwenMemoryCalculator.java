import java.util.Scanner;

public class HarveyOwenMemoryCalculator {

    public static void main(String[] args) {                    
        displayMenu();//Displays the menu for the user
    }

    @SuppressWarnings("resource")
	public static int displayMenu() {
    	boolean right = false;//Creaters boolean to allow for the program repeat
    	int i = 0;

        Scanner input = new Scanner(System.in);

    	MemoryCalculator CalcObj = new MemoryCalculator();//Calls the memory calculator

        do {

        int selection = MemoryCalculator.displayMenu();//Selection comes from display menu method in the memory calculator class

        if(selection == 1) {
        	 System.out.println("Enter the number you'd like to add: ");//Requests operand 2 to add
             double operand2 = input.nextDouble();//Adds number from memory calculator, calls add function in memory calculator
        	CalcObj.add(operand2);


        }else if (selection == 2) {
        	 System.out.println("Enter the number you'd like to subtract: ");//Requests operand 2 to subtract
             double operand2 = input.nextDouble();//Subtracts number from memory calculator, calls subtract function in memory calculator
         	CalcObj.subtract(operand2);

        }else if (selection == 3) {
        	 System.out.println("Enter the number you'd like to multiply: ");//Requests operand 2 to multiply
             double operand2 = input.nextDouble();//Multiplies number from memory calculator, calls multiply functin in memory calculator
            CalcObj.multiply(operand2);


        }else if (selection == 4) {
       	 System.out.println("Enter the number you'd like to divide: ");//Requests operand 2 to divide
            double operand2 = input.nextDouble();//Divides number from memory calculator, calls division function in memory calculator
            CalcObj.divide(operand2);


        }else if (selection == 5) {
            CalcObj.clear();//Clears number from calculator, calls clear function in memory calculator
            
        }else if (selection == 6) {
        	System.out.println("You have chosen to quit, have a great day!");
            System.exit(0);//Ends program per user request
        }
        if (selection <= 0 || selection >= 7) {
            System.out.println("Incorrect choice please try again!");//Lets user know they chose a wrong choice
            i--;
            int tries = i;
            System.out.println( 3 + tries + " tries left before restart");//Tells the user how many tries they have left before they must restart
            if (tries == -3) {//The tries become negative as you get them wrong, so if there are 3 wrong in a row(-3) it will exit
                System.out.println("Sorry, you have chosen 3 incoreect choices in a row you must restart this program.");
                System.exit(0);
            } // end of of tries statement

        } // end of if choice statement
        if (selection == 1 || selection <= 6) {
            i = 3;
        } // end of if choice statement


    }while(!right);

        return displayMenu();
    }

    public static double getOperand(String prompt) {
    	
        return 0;
    }

}