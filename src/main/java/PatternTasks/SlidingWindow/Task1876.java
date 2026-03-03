package PatternTasks.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Task1876 {
    public static int countGoodSubstrings(String s) {
        Map<Character, Integer> memory = new HashMap<>();
        int left = 0;
        int res = 0;
        for (int right = 0; right < s.length(); right++) {
            char curChar = s.charAt(right);
            memory.put(curChar, memory.getOrDefault(curChar, 0)+1);

            if (right - left + 1 > 3) {
                char leftChar = s.charAt(left);
                memory.put(leftChar, memory.get(leftChar)-1);
                if (memory.get(leftChar) == 0) {
                    memory.remove(leftChar);
                }
                left++;
            }
            if (right - left + 1 == 3 && memory.size() == 3) {
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "abbacbaa";
        System.out.println(countGoodSubstrings(s));
    }
}
