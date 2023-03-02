/*
Write a program that prompts the user to enter one of the filenames, gender, and string and
find a random name and its ranking in the file that begins with specific letter or substring.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.*;

public class Task4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        String gender, letter;
        int year;

        System.out.print("Choose an year (2001-2010): ");
        year = input.nextInt();
        System.out.print("Choose a gender (M/F): ");
        gender = input.next();
        System.out.print("Choose a letter or substring: ");
        letter = input.next();

        String path = "C:\\Users\\oharv\\IdeaProjects\\Data Structures\\Project1\\babynamesranking" + year + ".txt";
        input.close();


        input = new Scanner(new File(path));


        Set<String> boyNames = new HashSet<>();
        Set<Integer> boyRanks = new HashSet<>();
        Set<String> girlNames = new HashSet<>();
        Set<Integer> girlRanks = new HashSet<>();


        while (input.hasNext()) {
            input.nextInt();
            boyNames.add(input.next());
            input.nextInt();
            girlNames.add(input.next());
            input.nextInt();
        }

        System.out.println(boyNames);
        boyNames.retainAll(Collections.singleton("O"));
        System.out.println(boyNames);



    }
}
