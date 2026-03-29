package Tbank;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int wordLen = 5;

        int[] minReplacementsForStudyOnLeft = new int[n];
        int[] minReplacementsForStudyOnRight = new int[n];

        for (int i = wordLen - 1; i < n; i++) {
            String temp = s.substring(i - wordLen + 1, i + 1);
            int count = countReplacementsForStudy(temp);
            if (i == wordLen - 1) {
                minReplacementsForStudyOnLeft[i] = count;
            } else {
                minReplacementsForStudyOnLeft[i] = Math.min(count, minReplacementsForStudyOnLeft[i - 1]);
            }
        }

        for (int i = n - wordLen; i >= 0; i--) {
            String temp = s.substring(i, i + wordLen);
            int count = countReplacementsForStudy(temp);
            if (i == n - wordLen) {
                minReplacementsForStudyOnRight[i] = count;
            } else {
                minReplacementsForStudyOnRight[i] = Math.min(count, minReplacementsForStudyOnRight[i + 1]);
            }
        }

        int res = 10;

        for (int i = 0; i <= n - wordLen; i++) {
            String temp = s.substring(i, i + wordLen);
            int tbankSymReplacements = countReplacementsForTbank(temp);

            if (i >= wordLen) {
                res = Math.min(res, tbankSymReplacements + minReplacementsForStudyOnLeft[i - 1]);
            }
            if (i + wordLen <= n - wordLen) {
                res = Math.min(res, tbankSymReplacements + minReplacementsForStudyOnRight[i + wordLen]);
            }
        }

        System.out.println(res);
    }

    private static int countReplacementsForTbank(String temp) {
        int cnt = 0;
        String tbank = "tbank";
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) != tbank.charAt(i)) {
                cnt++;
            }
        }
        return cnt;
    }

    private static int countReplacementsForStudy(String temp) {
        int cnt = 0;
        String study = "study";
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) != study.charAt(i)) {
                cnt++;
            }
        }
        return cnt;
    }
}