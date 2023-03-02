import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PerformanceTest {

    public static void main(String[] args) {
        int elements;
        Scanner input = new Scanner(System.in);
        boolean continueTest = true;

        //Title for the program
        System.out.println("Sorting Algorithm Performance Test");
        System.out.println("==================================");



        do {
            //Ask for number of elements for Array List
            System.out.print("Enter the number of Elements: ");
            elements = input.nextInt();

            List<Integer> list = new ArrayList<>(elements);
            //add random numbers to arraylist
            for (int i = 0; i < elements; i++) {
                list.add((int)(Math.random() * elements));
            }
            //convert arraylist to array

            elements = 0;



            //Radix Sort

            //add random numbers to arraylist
            for (int i = 0; i < elements; i++) {
                list.add((int)(Math.random() * elements));
            }
            //convert arraylist to array
            int[] arrayr = list.stream().mapToInt(i -> i).toArray();

            long radixStartTime = System.currentTimeMillis();
            radixSort(arrayr, arrayr.length);
            System.out.println("The execution time to Radix sort " + arrayr.length + " elements is " + (System.currentTimeMillis() - radixStartTime) / 1000.0 + " seconds.");




            //Quick Sort
            //add random numbers to arraylist
            for (int i = 0; i < elements; i++) {
                list.add((int)(Math.random() * elements));
            }
            //convert arraylist to array
            int[] arrayq = list.stream().mapToInt(i -> i).toArray();

            long quickSortStartTime = System.currentTimeMillis();
            quickSort(arrayq, 0, arrayq.length - 1);
            System.out.println("The execution time to Quick Sort " + arrayq.length + " elements is " + (System.currentTimeMillis() - quickSortStartTime) / 1000.0 + " seconds.");



            //Merge Sort

            //add random numbers to arraylist
            for (int i = 0; i < elements; i++) {
                list.add((int)(Math.random() * elements));
            }
            //convert arraylist to array
            int[] arraym = list.stream().mapToInt(i -> i).toArray();

            long mergeStartTime = System.currentTimeMillis();
            mergeSort(arraym, 0, arraym.length - 1);
            System.out.println("The execution time to Merge sort " + arraym.length + " elements is " + (System.currentTimeMillis() - mergeStartTime) / 1000.0 + " seconds.");



            //Insertion Sort
            //add random numbers to arraylist
            for (int i = 0; i < elements; i++) {
                list.add((int)(Math.random() * elements));
            }
            //convert arraylist to array
            int[] arrayi = list.stream().mapToInt(i -> i).toArray();

            long insertionSortstartTime = System.currentTimeMillis();
            insertionSort(arrayi);
            System.out.println("The execution time to Insertion sort " + arrayi.length + " elements is " + (System.currentTimeMillis() - insertionSortstartTime) / 1000.0 + " seconds.");



            //Bubble Sort

            //add random numbers to arraylist
            for (int i = 0; i < elements; i++) {
                list.add((int)(Math.random() * elements));
            }
            //convert arraylist to array
            int[] arrayb = list.stream().mapToInt(i -> i).toArray();

            long bubbleStartTime = System.currentTimeMillis();
            bubbleSort(arrayb);
            long bubbleEndTime = System.currentTimeMillis();
            System.out.println("The execution time to Bubble sort " + arrayb.length + " elements is " + (bubbleEndTime - bubbleStartTime) / 1000.0 + " seconds.");




            System.out.print("Continue? (y/n): ");
            String answer = input.next();
            if (answer.equalsIgnoreCase("n")) {
                continueTest = false;
            }
        } while (continueTest);
        //Goodbye message
        System.out.println("\nGoodbye!");
    }

    /**
     * Insertion Sort
     */
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


    /**
     * Buuble Sort
     */
    public static void bubbleSort(int[] list) {
        boolean nextpassflag = true;
        for (int j = 1; j < list.length && nextpassflag; j++) {
            nextpassflag = false;
            for (int i = 0; i < list.length - j; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    nextpassflag = true;
                }
            }
        }
    }

    /**
     * Merge Sort
     */
    public static void merge(int[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int[] L = new int [n1];
        int[] R = new int [n2];

        /*Copy data to temp arrays*/
        System.arraycopy(arr, l, L, 0, n1);
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] arr, int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr , m+1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }


    /**
     * Quick Sort
     */
    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


    public static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }



    /**
     * Radix Sort
     */
    static int getMax(int[] arr, int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

    static void countSort(int[] arr, int n, int exp)
    {
        int[] output = new int[n];
        int i;
        int[] count = new int[10];
        Arrays.fill(count,0);

        for (i = 0; i < n; i++)
            count[ (arr[i]/exp)%10 ]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = n - 1; i >= 0; i--)
        {
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
            count[ (arr[i]/exp)%10 ]--;
        }
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    public static void radixSort(int[] arr, int n)
    {
        int m = getMax(arr, n);

        for (int exp = 1; m/exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }


}
