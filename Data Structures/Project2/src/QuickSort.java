import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        // Quick Sort
        int elements;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter number of elements: ");
            elements = sc.nextInt();

            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < elements; i++) {
                list.add(i);
            }
            Collections.shuffle(list);


            long startTime = System.currentTimeMillis();

            quicksort(list, 0, list.size() - 1);

            long endTime = System.currentTimeMillis();

            System.out.println("Quick Sort took " + (endTime - startTime) / 1000.0 + " seconds to sort " + elements + " elements.");
        } while (elements != 0);


    }

    public static void sort(List<Integer> list) {
        quicksort(list, 0, list.size() - 1);
    }

    public static void quicksort(List<Integer> list, int from, int to) {
        if (from < to) {
            int pivot = from;
            int left = from + 1;
            int right = to;
            int pivotValue = list.get(pivot);
            while (left <= right) {
                // left <= to -> limit protection
                while (left <= to && pivotValue >= list.get(left)) {
                    left++;
                }
                // right > from -> limit protection
                while (right > from && pivotValue < list.get(right)) {
                    right--;
                }
                if (left < right) {
                    Collections.swap(list, left, right);
                }
            }
            Collections.swap(list, pivot, left - 1);
            quicksort(list, from, right - 1); // <-- pivot was wrong!
            quicksort(list, right + 1, to);   // <-- pivot was wrong!
        }
    }
}