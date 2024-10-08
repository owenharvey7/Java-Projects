import java.util.Scanner;

public class TriviaChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int totalQuestions = 5;

        // First question
        System.out.println("Who was the first president of the United States?");
        String answer1 = scanner.nextLine();
        if (answer1.equalsIgnoreCase("George Washington")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect!");
        }

        // Second question
        System.out.println("How many states are in the United States?");
        int answer2 = scanner.nextInt();
        if (answer2 == 50) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect!");
        }

        scanner.nextLine(); // Consume the newline

        // Third question (True/False)
        System.out.println("True or False: The sun is a star");
        String answer3 = scanner.nextLine();
        if (answer3.equalsIgnoreCase("True")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect!");
        }

        // Fourth question (Pi value)
        System.out.println("What is the value of Pi up to the 2nd decimal place?");
        double answer4 = scanner.nextDouble();
        if (Math.abs(answer4 - 3.14) < 0.001) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect!");
        }

        scanner.nextLine(); // Consume the newline

        // Fifth question (Alphabet)
        System.out.println("What is the first letter of the English alphabet?");
        String answer5 = scanner.nextLine();
        if (answer5.equalsIgnoreCase("A")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect!");
        }

        // Final score
        int percentage = (score * 100) / totalQuestions;
        System.out.println("You got " + score + " out of " + totalQuestions + " right, for a score of " + percentage + "%");

        scanner.close();
    }
}
