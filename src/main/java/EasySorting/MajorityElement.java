package EasySorting;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 */
public class MajorityElement {
  // brute force
//  public static int majorityElement(int[] nums) {
//    int majority = nums.length/2;
//    for (int num : nums) {
//      int count = 0;
//      for (int value : nums) {
//        if (value == num) {
//          count += 1;
//        }
//      }
//      if (count > majority) {
//        System.out.println("majority num: " + num);
//        return num;
//      }
//    }
//    return -1;
//  }

  // hash
    public static int majorityElement(int[] nums) {
      HashMap<Integer, Integer> hashMap = new HashMap<>();
      for (int num : nums) {
        if (hashMap.containsKey(num)) {
          hashMap.put(num, hashMap.get(num) + 1);
        } else {
          hashMap.put(num, 1);
        }
      }

      int majority = nums.length/2;

      for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
        if (entry.getValue() > majority) {
          System.out.println("majority num: " + entry.getKey());
          return entry.getKey();
        }
      }
      return -1;
    }

  public static void main(String[] args) {
    int[] nums1 = {1,2,0, 3,0,0,0};
    majorityElement(nums1);
  }
}
