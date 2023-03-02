import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//I fixed the main method a bit so the tasks 1 and 3 should run more
//smoothly when displaying data now. The treemaps are now <Integer, String>
//rather than <String, String>. This allows them to print out names and
//their associated rank in the correct numerical order instead of alphbetical

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {

    }
    public static TreeMap splittingBoys(int y, String g, String n) throws FileNotFoundException
    {
        int year = y;
        String gender = g;
        String name = n;

        String fileName = "babynamesranking" + year + ".txt";

        File file = new File(fileName);
        Scanner scannedFile = new Scanner(file);
        ArrayList<String> names = new ArrayList<>(1000);
        ArrayList<String> namesSplit = new ArrayList<>();
        TreeMap<Integer, String> boys = new TreeMap<Integer, String>();

        while (scannedFile.hasNextLine())
        {
            String nextLine = scannedFile.nextLine();
            String nextLineFixed = nextLine.replaceAll("\\s+", " ");
            names.add(nextLineFixed);
        }


        for(int i = 0; i <names.size(); i++)
        {
            String[] temp = names.get(i).split(" ");

            for(int k = 0; k < temp.length; k++)
            {
                namesSplit.add(temp[k]);
            }
        }

        for(int i = 0; i < namesSplit.size(); i+=5)
        {
            boys.put(Integer.valueOf((namesSplit.get(i))), ((namesSplit.get(i+1))));
        }

        return boys;
    }

    public static TreeMap splittingGirls(int y, String g, String n) throws FileNotFoundException
    {
        int year = y;
        String gender = g;
        String name = n;

        String fileName = "babynamesranking" + year + ".txt";

        File file = new File(fileName);
        Scanner scannedFile = new Scanner(file);
        ArrayList<String> names = new ArrayList<>(1000);
        ArrayList<String> namesSplit = new ArrayList<>();
        TreeMap<Integer, String> girls = new TreeMap<Integer, String>();

        while (scannedFile.hasNextLine())
        {
            String nextLine = scannedFile.nextLine();
            String nextLineFixed = nextLine.replaceAll("\\s+", " ");
            names.add(nextLineFixed);
        }

        for(int i = 0; i <names.size(); i++)
        {
            String[] temp = names.get(i).split(" ");

            for(int k = 0; k < temp.length; k++)
            {
                namesSplit.add(temp[k]);
            }
        }

        for(int i = 0; i < namesSplit.size(); i+=5)
        {
            girls.put(Integer.valueOf((namesSplit.get(i))), ((namesSplit.get(i+3))));
        }


        return girls;
    }

    public static Integer ranking(int y, String g, String n) throws FileNotFoundException
    {
        int year = y;
        int index = -1;
        String gender = g;
        String name = n;
        Boolean hasName = false;
        TreeMap<Integer, String> temp = new TreeMap<>();

        if(Objects.equals(gender, "M"))
        {
            temp = Main.splittingBoys(year, gender, name);
        }
        else if (Objects.equals(gender, "F"))
        {
            temp = Main.splittingGirls(year, gender, name);
        }

        for(Map.Entry e: temp.entrySet())
        {
            if (e.getValue().equals(name))
            {
                hasName = true;
                index = (int) e.getKey();
            }
        }

        if(hasName != true)
        {
            System.out.println("Name not found in this list.");
        }

        return index;
    }

    public static TreeMap matches(int y, String g, String s) throws FileNotFoundException
    {
        int year = y;
        String gender = g;
        String substring = s;
        Boolean hasName = false;
        TreeMap<Integer, String> temp = new TreeMap<>();
        TreeMap<Integer, String> matches = new TreeMap();
        ArrayList<String> names = new ArrayList<>();

        if(Objects.equals(gender, "M"))
        {

            temp = Main.splittingBoys(year, gender, substring);

        }
        else if (Objects.equals(gender, "F"))
        {
            temp = Main.splittingGirls(year, gender, substring);
        }

        ArrayList<String> valueName = new ArrayList<String>(temp.values());

        System.out.println(valueName);
        for(Map.Entry e: temp.entrySet())
        {
            if (e.getValue().toString().startsWith(substring))
            {
                hasName = true;

                matches.put((Integer) e.getKey(), (String) e.getValue());

            }
        }

        if(hasName == false)
            System.out.println("No names like this are in this list");

        return matches;

    }
}