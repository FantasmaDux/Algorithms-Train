package KontestTink;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long mod = (long) Math.pow(10,9)+7;

        Map<Long, Integer> numFreq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            numFreq.put(num, numFreq.getOrDefault(num, 0) + 1);
        }

        long res = 1;

        for (int freq : numFreq.values()) {
            res = (res * (freq + 1)) % mod; // with empty
        }

        System.out.println((res-1 + mod) % mod); // without one all empty seq
    }
}
