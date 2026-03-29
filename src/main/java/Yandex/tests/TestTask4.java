package Yandex.tests;

import static Yandex.Task3.getRebus;
import static Yandex.Task4.getRowsTask4;

public class TestTask4 {
    public static void main(String[] args) {
        long[] tests = {
               1, 2, 3, 50
        };

        long[] expected = {
               0, 1, 0, 3
        };

        for (int t = 0; t < tests.length; t++) {
            long res = getRowsTask4(tests[t]); // твоя функция
            if (res == (expected[t])) {
                System.out.println("Pass: " + tests[t] + " -> " + res);
            } else {
                System.out.println("Fail: " + tests[t] + " -> " + res + ", expected: " + expected[t]);
            }
        }
    }
}
