package EasySorting;

public class ValidAnagram {

  public static boolean isAnagram(String s, String t) {
    // sort o(nlogn), can i find o(n) solution, hash will use o(n) space?
    if (s.length() != t.length()) {
      return false;
    }

    int[] counter = new int[26];
    for(int i=0; i<s.length(); i++) {
      counter[s.charAt(i) - 'a']++;
      counter[t.charAt(i) - 'a']--;
    }

    for(int c : counter) {
      if (c != 0) {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    String s = "anafram";
    String t = "nagaram";
    System.out.println(isAnagram(s, t));
  }

}
