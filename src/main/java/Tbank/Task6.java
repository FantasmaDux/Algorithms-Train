package Tbank;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int getCharCommand = 2;

        StringBuilder sb = new StringBuilder(sc.next());

        for (int i = 0; i < q; i++) {
            int command = sc.nextInt();
            if (command == getCharCommand) {
                System.out.println(sb.charAt(sc.nextInt() - 1));
            } else {
                int l = sc.nextInt();
                int r = sc.nextInt();
                sb = doubleSyms(sb, l - 1, r - 1);
            }
        }

    }

    private static StringBuilder doubleSyms(StringBuilder sb, int l, int r) {
        StringBuilder res = new StringBuilder(sb.substring(0, l));

        for (int i = l; i <= r; i++) {
            res.append(sb.charAt(i));
            res.append(sb.charAt(i));
        }
        res.append(sb.substring(r + 1));
        return res;
    }


}
