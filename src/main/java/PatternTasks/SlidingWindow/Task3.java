package PatternTasks.SlidingWindow;


import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxSeqLen = 0;
        HashMap<Character, Integer> hashAlphabet = new HashMap<>();

        int leftPointer = 0;

        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++) {
            char c = s.charAt(rightPointer);

            if (hashAlphabet.containsKey(c)) {
                leftPointer = Math.max(leftPointer, hashAlphabet.get(c) + 1); // чтобы leftPointer никогда не сдвигался влево
            }

            hashAlphabet.put(c, rightPointer);

            int currentSeqLen = rightPointer - leftPointer + 1;

            if (currentSeqLen > maxSeqLen) {
                maxSeqLen = currentSeqLen;
            }
        }

        return maxSeqLen;
    }
}
