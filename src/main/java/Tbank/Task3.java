package Tbank;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int row = 0; row < t; row++) {
            String s = sc.nextLine();
            int n = s.length();

            int maxLen = 0;
            int curLen = 0;

            String doubled = s + s;

            for (int i = 0; i < doubled.length(); i++) {
                if (doubled.charAt(i) == '1') {
                    curLen++;
                    if (curLen > maxLen) {
                        maxLen = curLen;
                    }
                } else {
                    curLen = 0;
                }
                if (maxLen > n) {
                    maxLen = n;
                }
            }
            int result;
            if (maxLen == 0) {
                result = 0;
            } else if (maxLen == n) {
                result = n * n;
            } else if (maxLen % 2 == 0) {
                result = (maxLen / 2) * (maxLen / 2 + 1);
            } else {
                result = ((maxLen + 1) / 2) * ((maxLen + 1) / 2);
            }
            System.out.println(result);

        }

    }


}
