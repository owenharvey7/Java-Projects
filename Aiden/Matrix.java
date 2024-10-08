import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part A: Prompt for n and draw the square
        System.out.print("What is the value of n? ");
        int n = scanner.nextInt();

        // Part B: Error checking for negative n
        if (n < 0) {
            System.out.println("Error: n cannot be negative");
            return;
        }

        // Part B: Prompt for the X coordinates
        System.out.print("Where do you want to put the X? (enter in format X Y): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // Part A & B: Draw the square with * on the perimeter and the X inside
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print * on the perimeter
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                }
                // Print X at the specified coordinates inside
                else if (i == x && j == y) {
                    System.out.print("X ");
                }
                // Print space inside the square
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();  // Move to the next line after printing each row
        }

        scanner.close();
    }
}
