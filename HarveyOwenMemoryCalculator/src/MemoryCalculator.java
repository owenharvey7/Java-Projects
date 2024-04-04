import java.util.Scanner;

public class MemoryCalculator {

    private double currentValue;

    public double getCurrentValue() {
        System.out.println("The current value is " + currentValue);
        return 0;
    }

    public void add(double operand2) {
        currentValue += operand2;
        getCurrentValue();
    }

    public void subtract(double operand2) {
        currentValue -= operand2;
        getCurrentValue();
    }

    public void multiply(double operand2) {
        currentValue *= operand2;
        getCurrentValue();
    }

    public void divide(double operand2) {
        if (operand2 == 0) {
            System.out.println("Sorry, you can not divide by 0");
        }
        currentValue /= operand2;
        getCurrentValue();

    }

    public void clear() {
        currentValue = 0;
        getCurrentValue();
    }
    public static int displayMenu() {
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

        System.out.println("\tMenu");
        System.out.println("1.\tAdd ");
        System.out.println("2.\tSubtract ");
        System.out.println("3.\tMultiply ");
        System.out.println("4.\tDivide ");
        System.out.println("5.\tClear ");
        System.out.println("6.\tEnd");
        System.out.println("Please select which math operation to perform, or press 6 to quit.");

        int selection = input.nextInt();

        return selection;

    }

}
