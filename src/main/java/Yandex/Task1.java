package Yandex;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        int n = 3;
        String s = "bbbb";
        int n2 = 1;
        String s2 = "a";
        int n3 = 3;
        String s3 = "hah";
        int n4 = 4;
        String s4 = "hbah";
        int n5 = 2;
        String s5 = "hh";
        int n6 = 3;
        String s6 = "ahha";
        System.out.println(getSubString(n, s));
        System.out.println(getSubString(n2, s2));
        System.out.println(getSubString(n3, s3));
        System.out.println(getSubString(n4, s4));
        System.out.println(getSubString(n5, s5));
        System.out.println(getSubString(n6, s6));
    }

    public static int getSubString(int n, String s) {

        if (s.length() == 1 && s.charAt(0) != 'a') {
            return 1;
        }

        if (!s.contains("a")) {
            return 0;
        }

//        int result = (s.charAt(0) == 'a' || s.charAt(0) == 'h') ? 1 : 0;
//
//        int leftPointer = 0;
//
//        for (int rightPointer = 1; rightPointer < n; rightPointer++) {
//            char c = s.charAt(rightPointer);
//            char prevC = s.charAt(rightPointer - 1);
//
//            if (c != 'a' && c != 'h') {
//                leftPointer = rightPointer;
//                continue;
//            }
//
//            if (!((c == 'a' && prevC == 'h') || (c == 'h' && prevC == 'a'))) {
//
//                leftPointer = rightPointer;
//            }
//
//            result = Math.max(result, rightPointer - leftPointer + 1);
//        }
//
//        if (s.length() == 1 && s.charAt(0) != 'a') {
//            result = 0;
//        }

        int maxLen = 0;
        int currLen = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c != 'a' && c != 'h') {
                currLen = 0;
                continue;
            }

            if (i == 0 || s.charAt(i - 1) == c || (s.charAt(i - 1) != 'a' && s.charAt(i - 1) != 'h')) {
                currLen = 1;
            } else {
                currLen++;
            }

            maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }
}
