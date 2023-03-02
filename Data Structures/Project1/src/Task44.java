import java.io.FileNotFoundException;
import java.util.*;

public class Task44
{
    public static void main(String[] args) throws FileNotFoundException {
        String another = "Y";

        do
        {
            int year;
            String gender;
            String substring;
            TreeMap<Integer, String> temp = new TreeMap<>();

            Scanner inputYear = new Scanner(System.in);
            System.out.println("Enter the year: ");
            year = inputYear.nextInt();

            Scanner inputGender = new Scanner(System.in);
            System.out.println("Enter the gender: ");
            gender = inputGender.nextLine().toUpperCase();

            Scanner inputName = new Scanner(System.in);
            System.out.println("Enter the a letter or letters to search for: ");
            substring = inputName.nextLine();
            substring = substring.substring(0,1).toUpperCase() + substring.substring(1);

            if (year > 2000 && year < 2011)
            {
                if (Objects.equals(gender, "M"))
                {
                    temp = Main.matches(year, gender, substring);
                    System.out.println("Boy names that start with " + substring + " and their rank in the year " + year + " are ");

                    //Turn treemap to an arraylist

                    for(Map.Entry e: temp.entrySet())
                    {
                        System.out.println(e.getKey() + " " + e.getValue());


                    }


                }
                else if (Objects.equals(gender, "F"))
                {
                    temp = Main.matches(year, gender, substring);
                    System.out.println("Girl names that start with " + substring + "and their rank in the year " + year + " are ");
                    for(Map.Entry e: temp.entrySet())
                    {
                        System.out.println(e.getKey() + " " + e.getValue());
                    }
                }

                else
                    System.out.println("Unrecognized Gender");
            }
            else
                System.out.println("This is not a valid year");

            Scanner inputAnother = new Scanner(System.in);
            System.out.println("Enter another inquiry? Please enter Y for another inquiry.");
            another = inputAnother.nextLine().toUpperCase();
        }
        while (another.equals("Y"));

    }
}
