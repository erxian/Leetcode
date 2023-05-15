package EasySorting;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {
  public static int[] answerQueries(int[] nums, int[] queries) {
    Arrays.sort(nums);
    int[] answer = new int[queries.length];
    for (int i=0; i<queries.length; i++) {
      int size = 1;
      int sum = nums[0];
      while (sum < queries[i] && size < nums.length) {
        sum += nums[size];
        size++;
      }

      if (sum > queries[i]) {
        size--;
      }

      answer[i] = size;

    }

    for (int an : answer) {
      System.out.println(an);
    }
    return answer;
  }

  public static void main(String[] args) {
    int[] nums1 = {4,5,2,1};
    int[] nums2 = {3,10,21};
    answerQueries(nums1, nums2);
  }

}
