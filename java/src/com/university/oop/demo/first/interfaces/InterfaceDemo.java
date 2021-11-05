package com.university.oop.demo.first.interfaces;

import com.university.oop.demo.misc.sorting.BubbleSort;
import com.university.oop.demo.misc.sorting.SortingAlgorithm;
import com.university.oop.demo.misc.sorting.SortingAlgorithmFactory;

/**
 * This demo illustrates the importance of depending on
 * interfaces rather than concrete classes and implementation.
 *
 * let's imagine that we imported another code that contains
 * sorting algorithms.
 *
 * The package contains an interface {@link SortingAlgorithm}
 * and various classes that implement it.
 */
public class InterfaceDemo {

    public static void main(String[] args) {
        tightlyCoupledCodeWithConcreteClasses();
        looselyCoupledCodeWithInterfaces();
    }

    /**
     * This function is written with concrete reference to the
     * {@link BubbleSort} class.
     *
     * If the programmers maintaining the package decided to remove
     * that class from the package there will be compilation
     * errors in this code.
     *
     * Try to delete the {@link BubbleSort} class and see what happens.
     */
    private static void tightlyCoupledCodeWithConcreteClasses() {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        printArray(arr);

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);

        System.out.println("\nSorted array");
        printArray(arr);
    }

    /**
     * This function is written with a reference to the
     * {@link SortingAlgorithm} interface.
     *
     * If the programmers maintaining the package decided to remove
     * a class from the package or add a new one this will not
     * affect the compilation of our code
     *
     * Try to delete the {@link BubbleSort} class and see what happens.
     * Try to add a new class and see what happens.
     */
    private static void looselyCoupledCodeWithInterfaces() {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("\nGiven Array");
        printArray(arr);

        SortingAlgorithm sortingAlgorithm
            = SortingAlgorithmFactory.getSortingAlgorithm();
        sortingAlgorithm.sort(arr);

        System.out.println("\nSorted array");
        printArray(arr);
    }

    /* A utility function to print array of size n */
    private static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
