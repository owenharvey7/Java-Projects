/*
Write a program that prompts the user to enter one of the filenames, gender, and string and
find a random name and its ranking in the file that begins with specific letter or substring.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Task444 {
        public static void main(String[] args) throws FileNotFoundException {
            Scanner input = new Scanner(System.in);

            System.out.print("Choose an year to see its baby name rankings (2001-2010): ");
            String year = input.next();
            System.out.print("Choose a gender (M/F): ");
            String gender = input.next();
            System.out.print("Choose a letter or substring: ");
            String letter = input.next();

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

            ArrayList<String> bnames = new ArrayList<>((boyNames));
            ArrayList<String> gnames = new ArrayList<>((girlNames));
            ArrayList<String> goodNames = new ArrayList<>();

            //if gender = m

            if(gender.equalsIgnoreCase("m")){
                for(int i = 0; i < bnames.size(); i++){
                    if(bnames.get(i).startsWith(letter)){
                        goodNames.add(bnames.get(i));
                    }
                }
                double i = (Math.random() * goodNames.size());
                int n = (int) i;
                System.out.println("Random Male Name that starts with " + letter + " is " + goodNames.get(n));
            }
            else if (gender.equalsIgnoreCase("f")) {
                for(int i = 0; i < gnames.size(); i++){
                    if(gnames.get(i).startsWith(letter)){
                        goodNames.add(gnames.get(i));
                    }
                }
                double i = (Math.random() * goodNames.size());
                int n = (int) i;
                System.out.println("Random Female Name that starts with " + letter + " is " + goodNames.get(n));
                }
            else{
                System.out.println("Invalid Input");

            }


        }
}
