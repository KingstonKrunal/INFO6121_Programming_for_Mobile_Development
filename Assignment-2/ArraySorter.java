// Program Name: ArraySorter
// Author: Krunal Shah
// Date: 2021/10/25
// Purpose: The program is having five types of sorting algorithms and is invoked by the ArraySorterTest program with inputs.

public class ArraySorter {

    // The Bubble Sort
    long bubbleSort(int[] arrayForBS) {
        int size = arrayForBS.length; //store size of an array
        long swapCountForBS = 0; //for swap count

        // loop to access each array element
        for (int i = 0; i < (size - 1); i++) {

            // loop to compare array elements
            for (int j = 0; j < (size - i - 1); j++) {

                // compare two adjacent elements
                if (arrayForBS[j] > arrayForBS[j + 1]) {

                    // swapping occurs if elements are not sorted
                    int temp = arrayForBS[j];
                    arrayForBS[j] = arrayForBS[j + 1];
                    arrayForBS[j + 1] = temp;

                    swapCountForBS++; //increase swap count by 1
                }
            }
        }

        return swapCountForBS; // return swap count value
    }

    // The Enhanced Bubble Sort
    long enhancedBubbleSort(int[] arrayForEBS) {
        int size = arrayForEBS.length;
        long swapCountForEBS = 0;

        // loop to access each array element
        for (int i = 0; i < (size - 1); i++) {

            // check if swapping occurs
            boolean swapped = false; // swap flag for track changes

            // loop to compare adjacent elements
            for (int j = 0; j < (size - i - 1); j++) {

                // compare two array elements
                if (arrayForEBS[j] > arrayForEBS[j + 1]) {

                    // swapping occurs if elements are not in the sorted order
                    int temp = arrayForEBS[j];
                    arrayForEBS[j] = arrayForEBS[j + 1];
                    arrayForEBS[j + 1] = temp;

                    swapped = true; 
                    swapCountForEBS++; //increase swap count by 1
                }
            }

            // no swapping means the array is already sorted so no need for further comparison
            if (!swapped) {
                return swapCountForEBS;
            }
        }

        return swapCountForEBS;
    }

    // The Selection Sort
    int selectionSort(int[] arrayForSS) {
        int size = arrayForSS.length;
        int swapCountForSS = 0;

        for (int step = 0; step < size - 1; step++) {
            int minIndex = step; // point to 1st index 0

            for (int i = step + 1; i < size; i++) {

                // Select the minimum element in each loop.
                if (arrayForSS[i] < arrayForSS[minIndex]) {
                    minIndex = i;
                }
            }

            // put min at the correct position
            int temp = arrayForSS[step];
            arrayForSS[step] = arrayForSS[minIndex];
            arrayForSS[minIndex] = temp;

            // do not increase swap count if element is in the same position
            if (minIndex != step) {
                swapCountForSS++; //increase swap count by 1
            }
        }

        return swapCountForSS;
    }

    // Merge two subarrays L and M into one array
    int merge(int[] arrayForMS, int p, int q, int r) {
        int swapCountMerge = 0;

        // L ← A[p..q] and M ← A[q+1..r]
        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int[n1];
        int M[] = new int[n2];

        // put all left subarray values in left array
        for (int i = 0; i < n1; i++) {
            L[i] = arrayForMS[p + i];
        }

        // put all right subarray values in one array
        for (int j = 0; j < n2; j++) {
            M[j] = arrayForMS[q + 1 + j];
        }

        // Maintain current index of sub-arrays and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = p;

        // Until we reach either end of either L or M, pick larger among
        // elements L and M and place them in the correct position at A[p..r]
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                arrayForMS[k] = L[i];
                i++;
                swapCountMerge++; //increase swap count by 1
            } else {
                arrayForMS[k] = M[j];
                j++;
                swapCountMerge++; //increase swap count by 1
            }
            k++;
        }

        // When we run out of elements in either L or M, pick up the remaining elements and put in A[p..r]
        while (i < n1) {
            arrayForMS[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arrayForMS[k] = M[j];
            j++;
            k++;
        }

        return swapCountMerge;
    }

    // Divide the array into two subarrays, sort them and merge them
    int mergeSort(int[] arrayForMS, int l, int r) {     
        int swapCountForMS = 0;

        if (l < r) {

            // m is the point where the array is divided into two subarrays
            int m = (l + r) / 2;

            // recursive call mergesort to divide elements into a subarray
            swapCountForMS += mergeSort(arrayForMS, l, m); //increase swap count by 1
            swapCountForMS += mergeSort(arrayForMS, m + 1, r); //increase swap count by 1

            // Merge the sorted subarrays
            swapCountForMS += merge(arrayForMS, l, m, r); //increase swap count by 1
        }

        return swapCountForMS;
    }

    // method to find the partition position
    static Tuple partition(int[] arrayForQS, int low, int high) {

        int pivot = arrayForQS[high]; // choose the rightmost element as pivot
        int swaps = 0;

        // pointer for greater element
        int i = (low - 1);

        // traverse through all elements compare each element with pivot
        for (int j = low; j < high; j++) {
            if (arrayForQS[j] <= pivot) {

                // if element smaller than pivot is found swap it with the greatr element pointed by i
                i++;

                if (i != j) {
                    // swapping element at i with element at j
                    int temp = arrayForQS[i];
                    arrayForQS[i] = arrayForQS[j];
                    arrayForQS[j] = temp;

                    swaps++; //increase swap count by 1
                }
            }
        }

        // swapt the pivot element with the greater element specified by i
        int temp = arrayForQS[i + 1];
        arrayForQS[i + 1] = arrayForQS[high];
        arrayForQS[high] = temp;

        if ((i+1) != high) {
            swaps++; //increase swap count by 1
        }

        // return the position from where partition is done and current swap count
        return new Tuple(i + 1, swaps);
    }

    int quickSort(int[] arrayForQS, int low, int high) {
        int swapCountQuick = 0;

        if (low < high) {
            // find pivot element such that elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            Tuple tp = partition(arrayForQS, low, high);

            int pi = tp.p; //store current pivot element 
            swapCountQuick = tp.swapCountForQS; // store current swap count value

            // recursive call on the left of pivot
            swapCountQuick += quickSort(arrayForQS, low, pi - 1);

            // recursive call on the right of pivot
            swapCountQuick += quickSort(arrayForQS, pi + 1, high);
        }

        return swapCountQuick;
    }
}

// class Tuple is used to take 2 return values from partition method
class Tuple {
    int p; 
    int swapCountForQS = 0;

    // counstructor
    public Tuple(int p, int swapCountForQS) {
        this.p = p;
        this.swapCountForQS = swapCountForQS;
    }
}