package Tbank;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int black = n/2;
        int white = n/2-1;

        System.out.println((black+white)*2);
    }


}
