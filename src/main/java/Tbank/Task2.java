package Tbank;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] prefix = new int[s.length()];

        String word = "tbank";

        for (int i = 4; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) != s.charAt(i - 4 + j)) {
                    count++;
                }
            }

            prefix[i] = i == 4 ? count : Math.min(count, prefix[i - 1]);
        }

        int[] suffix = new int[s.length()];
        for (int i = s.length() - 1 - 4; i >= 0; i--) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) != s.charAt(i + j)) {
                    count++;
                }
            }

            suffix[i] = i == s.length() - 1 - 4 ? count : Math.min(count, suffix[i + 1]);
        }


        word = "study";

        int res = 10;

        for (int i = 0; i <= s.length() - 1 - 4; i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) != s.charAt(i + j)) {
                    count++;
                }
            }

            if (i >= 5 && i + 5 <= s.length() - 1 - 4) {
                res = Math.min(res, count + Math.min(prefix[i - 1], suffix[i + 5]));
            } else if (i >= 5) {
                res = Math.min(res, count + prefix[i - 1]);
            } else if (i + 5 <= s.length() - 1 - 4) {
                res = Math.min(res, count + suffix[i + 5]);
            }
        }

        System.out.println(res);

    }
}