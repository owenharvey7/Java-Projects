import java.util.Scanner;

public class HarveyOwenArrayCalculator {

	static Scanner in = new Scanner(System.in);



	public static int getMenuOption() {//Menu with all of the options
		System.out.println("\tArray Calculator Menu");
		System.out.println("\t--------------------");
		System.out.println("1.\tAdd");
		System.out.println("2.\tSubtract");
		System.out.println("3.\tMultiply");
		System.out.println("4.\tDivide");
		System.out.println("5.\tDot Product");
		System.out.println("6.\tGenerate Random array");
		System.out.println("7.\tExit");
		System.out.println("What is your choice?");
		return 0;
	}

	public static double[] getOperand(String prompt, int size) {//Get numbers for array
		System.out
				.println("Enter the numbers in the array, seperated by spaces:");
		double[] operand1 = new double[size];
		for (int i = 0; i < operand1.length; i++) {
			operand1[i] = in.nextInt();
		}
		return operand1;
	}

	public static void printArray(double[] arrayOutput) {//Shows array
		for (double d : arrayOutput) {
			System.out.print(d + ", ");
		}

	}

	public static double[] add(double[] operand1, double[] operand2) {//Adds array
		double[] results = new double[operand1.length];
		for (int i = 0; i < operand1.length; i++) {
			int a = 0;
			results[i] = operand1[i] + operand2[i];
		}
		return results;
	}

	public static double[] subtract(double[] operand1, double[] operand2) {//Subtracts array
		double[] results = new double[operand1.length];
		for (int i = 0; i < operand1.length; i++) {
			int a = 0;
			results[i] = operand1[i] - operand2[i];
		}
		return results;
	}

	public static double[] multiply(double[] operand1, double[] operand2) {//Multiplies array
		double[] results = new double[operand1.length];
		for (int i = 0; i < operand1.length; i++) {
			int a = 0;
			results[i] = operand1[i] * operand2[i];
		}
		return results;
	}

	public static double[] divide(double[] operand1, double[] operand2) {//Divides array
		double[] results = new double[operand1.length];
		for (int i = 0; i < operand1.length; i++) {
			int a = 0;
			results[i] = operand1[i] / operand2[i];
		}
		return results;
	}

	public static double[] dotProduct(double[] operand1, double[] operand2) {//Produces dot plot
		double[] results = new double[operand1.length];
		for (int i = 0; i < operand1.length; i++) {
			results[i] += operand1[i] * operand2[i];
		}
		return results;

	}

	public static double[] random(double lowerLimit, double upperLimit, int size) {//Generates random array
		double[] chance = new double[size];

		for (int i = 0; i < size; i++) {
			// chance[i] = randNumGenerator.nextDouble((upperLimit - lowerLimit)
			// +1);
			chance[i] = (lowerLimit + (int) (Math.random() * ((upperLimit - lowerLimit) + 1)));
		}
		return chance;
	}

	// Main Method
	public static void main(String[] args) {//Stores the users choice answers

		Scanner keyboard = new Scanner(System.in);
		String choice = null;
		boolean right = false;

		do {
			getMenuOption();
			choice = keyboard.next();
			System.out.println("How many values are in the arrays?");
			int value = in.nextInt();

			if (choice.equals("1")) {
				double[] entry = getOperand("", value);
				double[] entry2 = getOperand("", value);
				double[] result = add(entry, entry2);
				System.out.println("Your addition result is ");
				printArray(result);
				System.out.println("\n");
			}

			else if (choice.equals("2")) {
				double[] entry = getOperand("", value);
				double[] entry2 = getOperand("", value);
				double[] result = subtract(entry, entry2);
				System.out.println("Your subtraction result is ");
				printArray(result);
				System.out.println("\n");

			}

			else if (choice.equals("3")) {
				double[] entry = getOperand("", value);
				double[] entry2 = getOperand("", value);
				double[] result = multiply(entry, entry2);
				System.out.println("Your multipication result is ");
				printArray(result);
				System.out.println("\n");

			}

			else if (choice.equals("4")) {
				double[] entry = getOperand("", value);
				double[] entry2 = getOperand("", value);
				for (Double x : entry2) {
					if (x == 0.0) {
						System.out
								.println("You can not divide by zero, try again.");
						entry2 = getOperand("", value);
					}
				}
				double[] result = null;
				try {
					result = divide(entry, entry2);

				} catch (Exception e) {
					System.out
							.println("There was a division error. try again.");
				}
				System.out.println("Your division result is ");
				printArray(result);
				System.out.println("\n");

			}

			else if (choice.equals("5")) {
				double[] entry = getOperand("", value);
				double[] entry2 = getOperand("", value);
				double[] result = dotProduct(entry, entry2);
				System.out.println("Your dot product result is ");
				printArray(result);
				System.out.println("\n");

			}

			else if (choice.equals("6")) {
				System.out.println("What is your lower limit array?");
				double lower = in.nextDouble();
				System.out.println("What is your upper limit?");
				double upper = in.nextDouble();
				double[] result = random(lower, upper, value);
				System.out.println("Your random number is ");
				printArray(result);
				System.out.println("\n");

			}

			else if (choice.equals("7")) {
				right = true;
				System.out.println("You have chosen to exit, have a great day!");

			}

		} while (!right);

	}
}