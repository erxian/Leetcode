package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class SortByBits {

  public static int[] sortByBits(int[] arr) {
    int[][] arrs =  new int[arr.length][];
    for (int i=0; i<arr.length; i++) {
      int countOfOnes = Integer.bitCount(arr[i]);
      arrs[i] = new int[] {arr[i], countOfOnes};
    }

    // Sort the 2D array based on values and then keys, a = [1, 1], b = [8, 3]
    Arrays.sort(arrs, (a, b) -> {
      if (a[1] == b[1]) {
        return Integer.compare(a[0], b[0]);
      } else {
        return Integer.compare(a[1], b[1]);
      }
    });

    int numberOfRows = arrs.length;
    int[] firstColumn = new int[numberOfRows];

    for (int i = 0; i < numberOfRows; i++) {
      firstColumn[i] = arrs[i][0];
    }
    return firstColumn;
  }
  public static void main(String[] args) {
    int[] nums1 = {0,1,2,3,4,5,6,7,8};
    sortByBits(nums1);
  }

}
