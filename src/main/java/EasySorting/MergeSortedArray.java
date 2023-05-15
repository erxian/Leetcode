package EasySorting;

public class MergeSortedArray {

//  public void merge(int[] nums1, int m, int[] nums2, int n) {
//    int len = m+n;
//    while(len>0 && m>0 && n>0) {
//      if(nums2[n-1] > nums1[m-1]) {
//        nums1[len-1] = nums2[n-1];
//        n--;
//      } else {
//        nums1[len-1] = nums1[m-1];
//        m--;
//      }
//      len--;
//    }
//
//    while(len>0) {
//      if (n>0) {
//        nums1[len-1] = nums2[n-1];
//        n--;
//        len--;
//      } else if (m>0) {
//        nums1[len-1] = nums1[m-1];
//        m--;
//        len--;
//      }
//    }
//  }
  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    // initialize 3 pointers, copy nums1 first m elements to nums1_copy
    // pointer p1 points to the first element in nums1_copy,
    // pointer p2 points to the first element in nums2
    // pointer p points to the first element in nums1

    int[] nums1_copy = new int[m];
    System.arraycopy(nums1, 0, nums1_copy, 0, m);
    int p1 = 0, p2 = 0, p = 0;

    // edge case1: n = 0, then all nums1_copy should be put into nums1
    // case2: m = 0, then all nums2 should be put into nums1

    while(p < m+n) {
      // only when p1 < m, there is a comparison between nums1 and nums2
      // if p2 >= n, means nums2 has no element add to nums1
      if((p1 < m && nums1_copy[p1] < nums2[p2])) {
        nums1[p] = nums1_copy[p1++];
      } else if (p2 >= n) {
        nums1[p] = nums1_copy[p1++];
      } else { // p2 < n && nums1_copy[p1] >= nums2[p2])
        nums1[p] = nums2[p2++];
      }
      p++;
    }

    // Print the elements of nums1_copy to verify the copying
    for (int num : nums1) {
      System.out.print(num + " ");
    }
  }

  public static void main(String[] args) {
    int[] nums1 = {1,2,3,0,0,0}, nums2 = {2, 5, 6};
    int m = 3, n = 3;
    merge(nums1, m, nums2, n);
  }
}
