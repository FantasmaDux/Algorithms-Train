package tests.test14_03_26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task438 {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
    }

    public static List<Integer> findAnagrams(String s, String p) {

        HashMap<Character, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (char c : p.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;

        while (right < s.length()) {
            char c = s.charAt(right);

            if (!map.containsKey(c)) {
                while (left < right) {
                    char leftChar = s.charAt(left);
                    if (map.containsKey(leftChar)) {
                        map.put(leftChar, map.get(leftChar) + 1);
                    }
                    left++;
                }
                left = right + 1;
            } else {
                map.put(c, map.get(c) - 1);

                while (map.containsKey(c) && map.get(c) < 0) {
                    char leftChar = s.charAt(left);
                    if (map.containsKey(leftChar)) {
                        map.put(leftChar, map.get(leftChar) + 1);
                    }
                    left++;
                }

                if (((right) - (left)) + 1 == p.length()) {
                    ans.add(left);
                }
            }

            right++;


        }
        return ans;

    }
}
