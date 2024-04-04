import java.util.Scanner;

public class HarveyOwenMethodCalculator {
	
public static int getMenuOption(int choice, int i, int num1, int num2) {
    Scanner input = new Scanner(System.in);
    while (true) {
        System.out.println("\tMethod Calculator Menu:");
        System.out.println("\t----------------------");
        System.out.println("1.\tAdd");
        System.out.println("2.\tSubtract");
        System.out.println("3.\tMultiply");
        System.out.println("4.\tDivide");
        System.out.println("5.\tGenerate a Random Number");
        System.out.println("6.\tExit the Program");
        System.out.print("What is your choice? : ");
        choice = input.nextInt();
        if (choice == 1) {
            add(num1, num2);
        } // end of if statement
        if (choice == 2) {
            subtract(num1, num2);
        } // end of if statement
        if (choice == 3) {
            multiply(num1, num2);
        } // end of if statement
        if (choice == 4) {
            divide(num1, num2);
        } // end of if statement
        if (choice == 5) {
            random(num1, num2);
        } // end of if statement
        if (choice == 6) {
        	System.out.println("You have chosen to quit, have a great day!");
            System.exit(0);
        } // end of if statement
        if (choice <= 0 || choice >= 7) {
            System.out.println("Incorrect choice please try again!");
            i--;
            int tries = i;
            System.out.println( 3 + tries + " tries left before restart");//Tells the user how many tries they have left before they must restart
            if (tries == -3) {//The tries become negative as you get them wrong, so if there are 3 wrong in a row(-3) it will exit
                System.out.println("Sorry, you have chosen 3 incoreect choices in a row you must restart this program.");
                System.exit(0);
            } // end of of tries statement

        } // end of if choice statement
        if (choice == 1 || choice <= 6) {
            i = 3;
        } // end of if choice statement
    }
}

public static void main(String[] args) {
    int choice = 0;
    int i = 0;
    int num1 = 0;
    int num2 = 0;
    getMenuOption(choice, i, num1, num2);
}

public static double getOperand(String prompt) { // Used for giving inputs
                                                    // and returns value to
                                                    // method/
    Scanner input = new Scanner(System.in);
    System.out.print(prompt);

    double value = input.nextDouble();

    return value;
}

public static int getOperand1(String prompt, int size) {
	Scanner input = new Scanner(System.in);
    System.out.println("How many values in array?");
    size = input.nextInt();
    System.out.println("You have made " + size + " values with arrays.");
    return size;
}
public static double add(double operand1, double operand2) { // adds the two
    
    double answer = 0;
    operand1 = getOperand("Please enter the first number: ");
    operand2 = getOperand("Please enter second number: ");
    answer = operand1 + operand2;
    System.out.println("Your answer is: " + answer);

    return 0;
}

public static double subtract(double operand1, double operand2) { // subtracts
    int answer = 0;
    operand1 = getOperand("Please enter the first number: ");
    operand2 = getOperand("Please enter the second number: ");
    answer = (int) (operand1 - operand2);
    System.out.println("Your answer is: " + answer);
    return 0;
}

public static double multiply(double operand1, double operand2) { // Multiples
    int answer = 0;
    operand1 = getOperand("Please enter the first number: ");
    operand2 = getOperand("Please enter the second number: ");
    answer = (int) (operand1 * operand2);
    System.out.println("Your answer is: " + answer);
    return answer;
}

public static double divide(double operand1, double operand2) { // Gets a
    int answer = 0;
    operand1 = getOperand("Please enter the first number: ");
    operand2 = getOperand("Please enter the second number: ");
    answer = (int) (operand1 / operand2);
    if (operand2 == 0) {
        operand1=getOperand("Your input is 0, please enter a number other than 0");
        
    } else
        System.out.println("Your answer is: " + answer);
    return Double.NaN;
}

public static double random(double lowerLimit, double upperLimit) { // Gets
   upperLimit = getOperand("Please enter the Maximum Number : ");
   lowerLimit = getOperand("Please enter the Minimum Number : ");
    double answer = (double) (Math.ceil(Math.random()
	* (lowerLimit - upperLimit)) + upperLimit);//Code for a random integer
    System.out.println("Your random number is: " + answer);
    return 0;
}
}
