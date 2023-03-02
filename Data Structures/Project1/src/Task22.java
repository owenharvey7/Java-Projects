import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.print("Choose an year to see its baby name rankings (2001-2010): ");
        String file = input.next();
        input.close();


        input = new Scanner(new File(file + ".txt"));


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