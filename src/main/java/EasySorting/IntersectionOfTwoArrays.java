package EasySorting;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
  public static int[] intersection(int[] nums1, int[] nums2) {
    // brute force, 2 for loop, o(n^2)
    // hash, require extra o(n) space
    // any o(n), o(1) solution?
    // first is to get unique element of array list 1
    // iterate elements in array list 2
    // if set1 contains that element, then add to output[]
    // and remove it from set1 in case duplicate add
    // need an index to track the number of element added to output

    HashSet<Integer> set1 = new HashSet<>();
    for (int i=0; i<nums1.length; i++) {
      set1.add(nums1[i]);
    }

    int[] output = new int[set1.size()];
    int idx = 0;
    for (int j=0; j<nums2.length; j++) {
      if (set1.contains(nums2[j])) {
        output[idx++] = nums2[j];
        set1.remove(nums2[j]);
      }
    }

    return Arrays.copyOf(output, idx);
  }

  public static void main(String[] args) {
    int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
    intersection(nums1, nums2);
  }
}
