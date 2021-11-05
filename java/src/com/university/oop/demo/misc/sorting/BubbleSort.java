package com.university.oop.demo.misc.sorting;

/**
 * This code is copied from https://www.geeksforgeeks.org/bubble-sort/
 */
public class BubbleSort implements SortingAlgorithm {
    @Override
    public void sort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (nums[j] > nums[j+1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
    }
}
