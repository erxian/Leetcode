package EasySorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
  public List<List<Integer>> minimumAbsDifference(int[] arr) {
    Arrays.sort(arr);
    // {1,3,6,10,15}
    // {1, 3}:2
    // {3,6}:3
    // {6,10}:4
    // {10,15}:5
    // only need to consider two adjective elements
    // iterate all pairs from left to right

    int minimum = Integer.MAX_VALUE;
    List<List<Integer>> answer = new ArrayList();

    for (int i=0; i<arr.length-1; i++) {
      if (arr[i+1] - arr[i] < minimum) {
        answer.clear();
        answer.add(Arrays.asList(arr[i], arr[i+1]));
      } else if (arr[i+1] - arr[i] == minimum) {
        answer.add(Arrays.asList(arr[i], arr[i+1]));
      }
    }
    return answer;
  }

}
