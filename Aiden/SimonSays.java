import java.util.Scanner;
import java.util.Random;

public class SimonSays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String difficulty = setDifficulty(scanner);
        int score = 0;

        while (true) {
            boolean isCorrect = playRound(difficulty, score, scanner);
            if (isCorrect) {
                score++;
                System.out.println("Correct! Your score: " + score);
            } else {
                System.out.println("Incorrect! Your score: " + score);
                System.out.println("The correct sequence was: " + lastGeneratedSequence);

                // Offer option to change difficulty
                System.out.println("Would you like to change the difficulty? (yes/no)");
                String changeDifficulty = scanner.nextLine();
                if (changeDifficulty.equalsIgnoreCase("yes")) {
                    difficulty = setDifficulty(scanner);
                }

                // Ask if the player wants to play another round
                System.out.println("Would you like to play another round? (yes/no)");
                String playAgain = scanner.nextLine();
                if (playAgain.equalsIgnoreCase("no")) {
                    System.out.println("Thanks for playing! Final score: " + score);
                    break;
                }
                score = 0; // Reset score after incorrect guess and round ends
            }
        }

        scanner.close();
    }

    public static String setDifficulty(Scanner scanner) {
        String difficulty;
        do {
            System.out.println("Select difficulty (easy / hard): ");
            difficulty = scanner.nextLine(); // Fix input buffer
        } while (!difficulty.equalsIgnoreCase("easy") && !difficulty.equalsIgnoreCase("hard"));
        return difficulty;
    }

    // Track the last generated sequence globally so it can be displayed if the player is wrong
    public static String lastGeneratedSequence = "";

    public static boolean playRound(String difficulty, int score, Scanner scanner) {
        //clearScreen();
        String sequence = showSequence(difficulty, score);  // Generates and displays the sequence

        waitFor(3000);  // Wait for 3 seconds before clearing the screen
        clearScreen();  // Clear the screen after showing the sequence

        System.out.println("Enter the sequence you saw:");

        String playerInput = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();  // Remove spaces and ignore case

        return playerInput.equals(sequence);  // Return whether the guess is correct
    }

    public static String showSequence(String difficulty, int score) {
        Random random = new Random();
        StringBuilder sequence = new StringBuilder();
        int length = Math.min(1 + score / 2, 8);  // Increase sequence length as score goes up, max length is 5

        System.out.println("Memorize this sequence:");

        if (difficulty.equalsIgnoreCase("easy")) {
            // Simple color guessing, but adds more colors as the score increases
            String[] colors = {"red", "green", "blue", "yellow", "purple", "orange"};
            for (int i = 0; i < length; i++) {
                String color = colors[random.nextInt(colors.length)];
                System.out.print(color + " ");
                sequence.append(color);
            }
        } else {
            // Number guessing, but adds more numbers as the score increases
            for (int i = 0; i < length; i++) {
                int number = random.nextInt(10) + 1;
                System.out.print(number + " ");
                sequence.append(number);
            }
        }

        System.out.println();
        lastGeneratedSequence = sequence.toString().replaceAll("\\s+", "").toLowerCase();  // Store for comparison
        return lastGeneratedSequence;
    }

    public static void clearScreen() {
        //Clearn the screen
        System.out.println("\033(H\033[2J");
        System.out.flush();
    }

    public static void waitFor(int milliseconds) {
        try {
            Thread.sleep(milliseconds);  // Pause for the given number of milliseconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
