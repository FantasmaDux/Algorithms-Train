package Tbank.tests;

import static Yandex.Task3.getRebus;

public class TestTask3 {
    public static void main(String[] args) {
        String[] tests = {
                "yandex'''' 'algo''' trainings''''",
                "cat''",
                "''hello'' ''world'''",
                "'''python'' java'",
                "a' 'b c'"
        };

        String[] expected = {
                "yatrain",
                "c",
                "l",
                "hjav",
                ""
        };

        for (int t = 0; t < tests.length; t++) {
            String res = getRebus(tests[t]); // твоя функция
            if (res.equals(expected[t])) {
                System.out.println("Pass: " + tests[t] + " -> " + res);
            } else {
                System.out.println("Fail: " + tests[t] + " -> " + res + ", expected: " + expected[t]);
            }
        }
    }
}
