/*
Write a program that prompts the user to enter one of the filenames and displays the names
that are used for both genders in the file. Use sets to store names and find common names in
two sets.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.print("Choose an year to see its baby name rankings (2001-2010): ");
        String year = input.next();

        String path = "babynamesranking" + year + ".txt";

        File file = new File(path);

        input.close();


        input = new Scanner(new File(path));


        HashSet<String> boyNames = new HashSet<>();
        HashSet<String> girlNames = new HashSet<>();

        while (input.hasNext()) {
            input.nextInt();
            boyNames.add(input.next());
            input.nextInt();
            girlNames.add(input.next());
            input.nextInt();
        }

        boyNames.retainAll(girlNames);
        System.out.println(boyNames.size() + " names used for both genders.");
        System.out.print("They are ");
        System.out.println(boyNames);

    }
}