//Corradina Dinatale
//100645103

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void showMainMenu()
    {
        System.out.println("\nPlease choose the size of the data set for which you wish to view the sorting times:\n");
        System.out.println("1: Size 50   \n2: Size 1000\n" +
                "3: Size 10,000 \n4: Size 100,000 \n5. Size 1,000,000 \n6. Exit");
    }

    public static long selectionTimer(UnorderedArray a) {
        long start = System.nanoTime();
        a.selectionSort();
        long end = System.nanoTime();
        return end - start;
    }
    public static long insertionTimer(UnorderedArray a) {
        long start = System.nanoTime();
        a.insertionSort();
        long end = System.nanoTime();
        return end - start;
    }
    public static long mergeTimer(UnorderedArray a) {
        long start = System.nanoTime();
        a.mergeSort(a.getArr(), a.getNumElements());
        long end = System.nanoTime();
        return end - start;
    }
    public static long quickTimer(UnorderedArray a) {
        long start = System.nanoTime();
        a.quickSort(a.getArr(), 0, a.getNumElements()-1);
        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args) {

        //create core data array with 1000000 random values from 1-3000000
        UnorderedArray coreData = new UnorderedArray(1000000);
        Random rand = new Random();
        for (int x = 0; x < 1000000; x++) {
            int val = rand.nextInt(3000000) + 1;
            coreData.addLast(val);
        }

        //selection sort array copies
        UnorderedArray selection50 = new UnorderedArray(50);
        coreData.copyArray(selection50, 50);

        UnorderedArray selection1K = new UnorderedArray(1000);
        coreData.copyArray(selection1K, 1000);

        UnorderedArray selection10K = new UnorderedArray(10000);
        coreData.copyArray(selection10K, 10000);

        UnorderedArray selection100K = new UnorderedArray(100000);
        coreData.copyArray(selection100K, 100000);

        UnorderedArray selection1Mil = new UnorderedArray(1000000);
        coreData.copyArray(selection1Mil, 1000000);

        //insertion sort array copies
        UnorderedArray insertion50 = new UnorderedArray(50);
        coreData.copyArray(insertion50, 50);

        UnorderedArray insertion1K = new UnorderedArray(1000);
        coreData.copyArray(insertion1K, 1000);

        UnorderedArray insertion10K = new UnorderedArray(10000);
        coreData.copyArray(insertion10K, 10000);

        UnorderedArray insertion100K = new UnorderedArray(100000);
        coreData.copyArray(insertion100K, 100000);

        UnorderedArray insertion1Mil = new UnorderedArray(1000000);
        coreData.copyArray(insertion1Mil, 1000000);

        //merge sort array copies
        UnorderedArray merge50 = new UnorderedArray(50);
        coreData.copyArray(merge50, 50);

        UnorderedArray merge1K = new UnorderedArray(1000);
        coreData.copyArray(merge1K, 1000);

        UnorderedArray merge10K = new UnorderedArray(10000);
        coreData.copyArray(merge10K, 10000);

        UnorderedArray merge100K = new UnorderedArray(100000);
        coreData.copyArray(merge100K, 100000);

        UnorderedArray merge1Mil = new UnorderedArray(1000000);
        coreData.copyArray(merge1Mil, 1000000);

        //quick sort array copies
        UnorderedArray quick50 = new UnorderedArray(50);
        coreData.copyArray(quick50, 50);

        UnorderedArray quick1K = new UnorderedArray(1000);
        coreData.copyArray(quick1K, 1000);

        UnorderedArray quick10K = new UnorderedArray(10000);
        coreData.copyArray(quick10K, 10000);

        UnorderedArray quick100K = new UnorderedArray(100000);
        coreData.copyArray(quick100K, 100000);

        UnorderedArray quick1Mil = new UnorderedArray(1000000);
        coreData.copyArray(quick1Mil, 1000000);

        Scanner keyboard = new Scanner(System.in);
        boolean loop = true;

        do{
            showMainMenu();
            int menuChoice = keyboard.nextInt();
            switch (menuChoice) {
                case 1:
                    System.out.println("-------------Size 50--------------");
                    //selection
                    System.out.println("Selection sort: " + selectionTimer(selection50) + " nano seconds");
                    //insertion
                    System.out.println("Insertion sort: " + insertionTimer(insertion50) + " nano seconds");
                    //merge
                    System.out.println("Merge sort: " + mergeTimer(merge50) + " nano seconds");
                    //quick
                    System.out.println("Quick sort: " + quickTimer(quick50) + " nano seconds");
                    System.out.println("----------------------------------");
                    break;

                case 2:
                    System.out.println("-------------Size 1000--------------");
                    //selection
                    System.out.println("Selection sort: " + selectionTimer(selection1K) + " nano seconds");
                    //insertion
                    System.out.println("Insertion sort: " + insertionTimer(insertion1K) + " nano seconds");
                    //merge
                    System.out.println("Merge sort: " + mergeTimer(merge1K) + " nano seconds");
                    //quick
                    System.out.println("Quick sort: " + quickTimer(quick1K) + " nano seconds");
                    System.out.println("------------------------------------");
                    break;

                case 3:
                    System.out.println("-------------Size 10,000-------------");
                    //selection
                    System.out.println("Selection sort: " + selectionTimer(selection10K) + " nano seconds");
                    //insertion
                    System.out.println("Insertion sort: " + insertionTimer(insertion10K) + " nano seconds");
                    //merge
                    System.out.println("Merge sort: " + mergeTimer(merge10K) + " nano seconds");
                    //quick
                    System.out.println("Quick sort: " + quickTimer(quick10K) + " nano seconds");
                    System.out.println("-------------------------------------");
                    break;

                case 4:
                    System.out.println("-------------Size 100,000--------------");
                    //selection
                    System.out.println("Selection sort: " + selectionTimer(selection100K) + " nano seconds");
                    //insertion
                    System.out.println("Insertion sort: " + insertionTimer(insertion100K) + " nano seconds");
                    //merge
                    System.out.println("Merge sort: " + mergeTimer(merge100K) + " nano seconds");
                    //quick
                    System.out.println("Quick sort: " + quickTimer(quick100K) + " nano seconds");
                    System.out.println("---------------------------------------");
                    break;

                case 5:
                    System.out.println("--------Size 1,000,000---------");
                    //selection
                    double timeTaken = ((double)selectionTimer(selection1Mil)) / 1000000;
                    System.out.println("Selection sort: " + timeTaken + " milli seconds");
                    //insertion
                    double timeTaken2 = ((double)insertionTimer(insertion1Mil)) / 1000000;
                    System.out.println("Insertion sort: " + timeTaken2 + " milli seconds");
                    //merge
                    double timeTaken3 = ((double)mergeTimer(merge1Mil)) / 1000000;
                    System.out.println("Merge sort: " + timeTaken3 + " milli seconds");
                    //quick
                    double timeTaken4 = ((double)quickTimer(quick1Mil)) / 1000000;
                    System.out.println("Quick sort: " + timeTaken4 + " milli seconds");
                    System.out.println("-------------------------------");
                    break;

                case 6:
                    loop = false;
                    break;
                default:
                    System.err.println("The choice entered is invalid.");
                    break;
            }
        }
        while(loop);
    }
}
