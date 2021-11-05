package com.university.oop.demo.misc.sorting;

public class SortingAlgorithmFactory {
    public static SortingAlgorithm getSortingAlgorithm() {
        return new QuickSort();
    }
}
