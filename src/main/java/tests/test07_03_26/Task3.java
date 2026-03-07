package tests.test07_03_26;


import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        String s = "bbbbb";
        String s1 = "pwwkew";
        String s2 = "aab";
        String s3 = " ";
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));
    }

    // sliding window
    public static int lengthOfLongestSubstring(String s) {
        int leftPointer = 0;
        int maxLength = 0;
        int currentLength;

        HashMap<Character, Integer> map = new HashMap();

        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++) {
            char c = s.charAt(rightPointer);

            if (map.containsKey(c)) {
                leftPointer = Math.max(leftPointer, map.get(c)+1);
            }

            map.put(c, rightPointer);
            currentLength = rightPointer - leftPointer + 1;
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }
}
