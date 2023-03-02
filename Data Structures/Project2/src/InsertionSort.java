import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSort {
    //Insertion Sort
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements:");
        int elements = sc.nextInt();

        //create arraylist with size 500000
        List<Integer> list = new ArrayList<>(elements);
        //add random numbers to arraylist
        for (int i = 0; i < elements; i++) {
            list.add((int)(Math.random() * elements));
        }
        //convert arraylist to array
        int[] array = list.stream().mapToInt(i -> i).toArray();

        //timer
        long startTime = System.currentTimeMillis();

        insertionSort(array);

        System.out.println("Time: " + (System.currentTimeMillis() - startTime) /1000.0 + " seconds");
    }
}