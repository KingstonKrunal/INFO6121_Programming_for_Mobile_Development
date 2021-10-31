// Program Name: ArraySorterTest
// Author: Krunal Shah
// Date: 2021/10/25
// Purpose: The program is used to invoke five sorting algorithms in ArraySorter program. Also used to calculate swap counts and time to sort arrays using differnet types of inputs.

public class ArraySorterTest {

    // used to generate an array by filling it with random values using random function
    static int[] genArray(int size, int maxElement) {
        int[] array = new int[size]; //initialization of an aaray

        // loop to insert random elements into an array
        for (int i = 0; i < size; i++) {
            array[i] = (int)(maxElement * Math.random());
        }

        return array;
    }

    public static void main(String[] args) {
        int noOfArrays = 1000; 
        int sizeOfArray = 50;
        int maxElement = 500;

        // display current settings
        System.out.println("Array Size: " + sizeOfArray);
        System.out.println("Generate numbers from 0 to: " + maxElement);
        System.out.println("Number of arrays sorted: " + noOfArrays);

        ArraySorter as = new ArraySorter(); // object of ArraySorter

        long start = System.nanoTime();
        long swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.bubbleSort(array); 
        }

        // display time and swap count
        System.out.println("\nBubble Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);


        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.enhancedBubbleSort(array); 
        }

        System.out.println("\nEnhanced Bubble Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.selectionSort(array); 
        }

        System.out.println("\nSelection Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.mergeSort(array, 0, sizeOfArray-1); 
        }

        System.out.println("\nMerge Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.quickSort(array, 0, sizeOfArray-1); 
        }

        System.out.println("\nQuick Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);


        System.out.println("\n-----------------------------------------------------------");


        noOfArrays = 1000;
        sizeOfArray = 1000;
        maxElement = 500;

        System.out.println("\nArray Size: " + sizeOfArray);
        System.out.println("Generate numbers from 0 to: " + maxElement);
        System.out.println("Number of arrays sorted: " + noOfArrays);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.bubbleSort(array); 
        }

        System.out.println("\nBubble Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);


        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.enhancedBubbleSort(array); 
        }

        System.out.println("\nEnhanced Bubble Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.selectionSort(array); 
        }

        System.out.println("\nSelection Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.mergeSort(array, 0, sizeOfArray-1); 
        }

        System.out.println("\nMerge Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.quickSort(array, 0, sizeOfArray-1); 
        }

        System.out.println("\nQuick Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);


        System.out.println("\n-----------------------------------------------------------");


        noOfArrays = 1000000;
        sizeOfArray = 50;
        maxElement = 500;

        System.out.println("\nArray Size: " + sizeOfArray);
        System.out.println("Generate numbers from 0 to: " + maxElement);
        System.out.println("Number of arrays sorted: " + noOfArrays);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.bubbleSort(array); 
        }

        System.out.println("\nBubble Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);


        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.enhancedBubbleSort(array); 
        }

        System.out.println("\nEnhanced Bubble Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.selectionSort(array); 
        }

        System.out.println("\nSelection Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.mergeSort(array, 0, sizeOfArray-1); 
        }

        System.out.println("\nMerge Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.quickSort(array, 0, sizeOfArray-1); 
        }

        System.out.println("\nQuick Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);


        System.out.println("\n-----------------------------------------------------------");


        noOfArrays = 1;
        sizeOfArray = 100000;
        maxElement = 500;

        System.out.println("\nArray Size: " + sizeOfArray);
        System.out.println("Generate numbers from 0 to: " + maxElement);
        System.out.println("Number of arrays sorted: " + noOfArrays);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.bubbleSort(array); 
        }

        System.out.println("\nBubble Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);


        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.enhancedBubbleSort(array); 
        }

        System.out.println("\nEnhanced Bubble Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.selectionSort(array); 
        }

        System.out.println("\nSelection Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.mergeSort(array, 0, sizeOfArray-1); 
        }

        System.out.println("\nMerge Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.quickSort(array, 0, sizeOfArray-1); 
        }

        System.out.println("\nQuick Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);


        System.out.println("\n-----------------------------------------------------------");


        noOfArrays = 10000;
        sizeOfArray = 200;
        maxElement = 5000;

        System.out.println("\nArray Size: " + sizeOfArray);
        System.out.println("Generate numbers from 0 to: " + maxElement);
        System.out.println("Number of arrays sorted: " + noOfArrays);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.bubbleSort(array); 
        }

        System.out.println("\nBubble Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);


        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.enhancedBubbleSort(array); 
        }

        System.out.println("\nEnhanced Bubble Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.selectionSort(array); 
        }

        System.out.println("\nSelection Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.mergeSort(array, 0, sizeOfArray-1); 
        }

        System.out.println("\nMerge Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.quickSort(array, 0, sizeOfArray-1); 
        }

        System.out.println("\nQuick Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);


        System.out.println("\n-----------------------------------------------------------");


        noOfArrays = 10000;
        sizeOfArray = 500;
        maxElement = 10000;

        System.out.println("\nArray Size: " + sizeOfArray);
        System.out.println("Generate numbers from 0 to: " + maxElement);
        System.out.println("Number of arrays sorted: " + noOfArrays);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.bubbleSort(array); 
        }

        System.out.println("\nBubble Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);


        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.enhancedBubbleSort(array); 
        }

        System.out.println("\nEnhanced Bubble Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.selectionSort(array); 
        }

        System.out.println("\nSelection Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.mergeSort(array, 0, sizeOfArray-1); 
        }

        System.out.println("\nMerge Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.quickSort(array, 0, sizeOfArray-1); 
        }

        System.out.println("\nQuick Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);


        System.out.println("\n-----------------------------------------------------------");


        noOfArrays = 1;
        sizeOfArray = 1000000;
        maxElement = 500;

        System.out.println("\nArray Size: " + sizeOfArray);
        System.out.println("Generate numbers from 0 to: " + maxElement);
        System.out.println("Number of arrays sorted: " + noOfArrays);

    
        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.quickSort(array, 0, sizeOfArray-1); 
        }

        System.out.println("\nQuick Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.mergeSort(array, 0, sizeOfArray-1); 
        }

        System.out.println("\nMerge Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);


        System.out.println("\n-----------------------------------------------------------");


        noOfArrays = 1;
        sizeOfArray = 1000000;
        maxElement = 50000;

        System.out.println("\nArray Size: " + sizeOfArray);
        System.out.println("Generate numbers from 0 to: " + maxElement);
        System.out.println("Number of arrays sorted: " + noOfArrays);

    
        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.quickSort(array, 0, sizeOfArray-1); 
        }

        System.out.println("\nQuick Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);

        start = System.nanoTime();
        swaps = 0;

        // loop to generate an arrays and calculate swaps
        for (int i = 0; i < noOfArrays; i++) {
            int[] array = genArray(sizeOfArray, maxElement);
            swaps += as.mergeSort(array, 0, sizeOfArray-1); 
        }

        System.out.println("\nMerge Sort");
        System.out.println("Time: " + (System.nanoTime() - start) + "ns");
        System.out.println("Swaps: " + swaps);
    }
}
