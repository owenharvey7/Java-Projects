import java.util.Scanner;

public class HarveyOwenMemoryCalculator {

    public static void main(String[] args) {                    
        displayMenu();
    }

    @SuppressWarnings("resource")
	public static int displayMenu() {
    	boolean right = false;
    	int i = 0;

        Scanner input = new Scanner(System.in);

    	MemoryCalculator CalcObj = new MemoryCalculator();

        do {

        int selection = MemoryCalculator.displayMenu();

        if(selection == 1) {
        	 System.out.println("Enter the number you'd like to add: ");
             double operand2 = input.nextDouble();
        	CalcObj.add(operand2);


        }else if (selection == 2) {
        	 System.out.println("Enter the number you'd like to subtract: ");
             double operand2 = input.nextDouble();
         	CalcObj.subtract(operand2);

        }else if (selection == 3) {
        	 System.out.println("Enter the number you'd like to multiply: ");
             double operand2 = input.nextDouble();
            CalcObj.multiply(operand2);


        }else if (selection == 4) {
       	 System.out.println("Enter the number you'd like to divide: ");
            double operand2 = input.nextDouble();
            CalcObj.divide(operand2);


        }else if (selection == 5) {
            CalcObj.clear();
            
        }else if (selection == 6) {
        	System.out.println("You have chosen to quit, have a great day!");
            System.exit(0);
        }
        if (selection <= 0 || selection >= 7) {
            System.out.println("Incorrect choice please try again!");
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