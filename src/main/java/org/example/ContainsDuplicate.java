package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
  public static boolean containsDuplicate(int[] nums) {
    // what does it mean by every element is distinct
//    if (nums.length <= 1) {
//      return false;
//    }

    Arrays.sort(nums);
    for (int i=0; i<nums.length; i++) {
      if(nums[i] == nums[i+1]) {
        return true;
      }
    }
    return false;

//    int starter = nums[0];
//    for (int i=1; i<nums.length; i++) {
//      if (nums[i] == starter) {
//        return true;
//      } else {
//        starter = nums[i];
//      }
//    }
//    return false;
  }

  public static boolean containsDuplicateHashSet(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      if (set.contains(num)) {
        return true;
      }
      set.add(num);
    }
    return false;
  }

  public static void main(String[] args) {
    int[] nums1 = {1,2,3,0,0,0};
    containsDuplicate(nums1);
  }

}
