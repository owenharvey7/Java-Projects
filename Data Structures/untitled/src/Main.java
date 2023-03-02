import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Find a random name that starts with a letter from a hashset
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String letter = input.next();
        System.out.println("Enter a year: ");
        int year = input.nextInt();

        input.close();

        String path = "C:\\Users\\oharv\\IdeaProjects\\Data Structures\\Project1\\babynamesranking" + year + ".txt";
        input.close();


        input = new Scanner(new File(path));




    }
}