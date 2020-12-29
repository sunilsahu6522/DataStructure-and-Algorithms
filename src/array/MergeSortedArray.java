package array;

import java.util.Arrays;

/**
 * This program will take 2 sorted array as input
 * output : merge of 2 sorted array , in a sorted way.
 * If arrayA = {-7, 12, 17, 29, 41, 56, 79} and arrayB = {-9, -3, 0, 5, 19} are two sorted integer arrays
 * then mergedArray must be {-9, -7, -3, 0, 5, 12, 17, 19, 29, 41, 56, 79}
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        // 2 Sorted Array as input
        int[] arrayA = {-7, 12, 17, 29, 41, 56, 79};
        int[] arrayB = {-9, -3, 0, 5, 19};

        int[] mergedArray = mergeArray(arrayA, arrayB);

        System.out.println("Array A : "+ Arrays.toString(arrayA));

        System.out.println("Array B : "+Arrays.toString(arrayB));

        System.out.println("Merged Array : "+Arrays.toString(mergedArray));

    }

    private static int[] mergeArray(int[] arrayA, int[] arrayB) {

        int[] mergedArray = new int[arrayA.length + arrayB.length];

        //i for arrayA, j for arrayB and k for mergedArray
        int i = 0, j = 0, k = 0;

        while (i < arrayA.length && j < arrayB.length) {
            //compare 2 array value and put the smallest value on merged array
            if (arrayA[i] < arrayB[j]) {
                mergedArray[k] = arrayA[i];
                i++;
            }
            else {
                mergedArray[k] = arrayB[j];
                j++;
            }
            k++;
        }

        //if any item left inside arrayA then that also will put inside mergeArray
        while (i < arrayA.length) {
            mergedArray[k] = arrayA[i];
            i++;
            k++;
        }
        //if any item left inside arrayB then that also will put inside mergeArray
        while (j < arrayB.length) {
            mergedArray[k] = arrayB[j];
            j++;
            k++;
        }
        return mergedArray;
    }
}
