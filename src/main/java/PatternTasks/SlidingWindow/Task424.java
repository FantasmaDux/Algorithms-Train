package PatternTasks.SlidingWindow;

import java.util.HashMap;

public class Task424 {
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(characterReplacement(s, k));
    }

    public static int characterReplacement(String s, int k) {
        int leftPointer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int maxFreqSym = 0;
        int windowLen = 0;
        int maxWindowLen = 0;

        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++) {
            char c = s.charAt(rightPointer);
            map.put(c, map.getOrDefault(c, 0) + 1);

            if (map.getOrDefault(c, 0) > maxFreqSym) {
                maxFreqSym = map.getOrDefault(c, 0);
            }

            windowLen = rightPointer - leftPointer + 1;
            if (windowLen - maxFreqSym > k) {
                map.put(s.charAt(leftPointer), map.get(s.charAt(leftPointer)) - 1);
                leftPointer++;
            }

            maxWindowLen = Math.max(maxWindowLen, rightPointer - leftPointer + 1);
        }

        return maxWindowLen;
    }
}
