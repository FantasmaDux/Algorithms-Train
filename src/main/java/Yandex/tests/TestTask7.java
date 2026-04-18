package Yandex.tests;

import static Yandex.Task7.getVariants;

public class TestTask7 {
    public static void main(String[] args) {
        // Массив строк (ряды учеников)
        String[] tests = {
                "aabbaabb",     // 10
                "ab",           // 1
                "aa",           // 0
                "abab",         // 4
                "aabb",         // 2
                "ba",           // 1
                ""              // 0 (пустая строка)
        };

        // Ожидаемые результаты
        long[] expected = {
                10,
                1,
                0,
                4,
                2,
                1,
                0
        };

        System.out.println("=== Тестирование Task7 ===");
        int passed = 0;
        for (int t = 0; t < tests.length; t++) {
            long res = getVariants(tests[t].length(), tests[t]);
            if (res == expected[t]) {
                System.out.println("✓ PASS: \"" + tests[t] + "\" -> " + res);
                passed++;
            } else {
                System.out.println("✗ FAIL: \"" + tests[t] + "\" -> " + res + ", expected: " + expected[t]);
            }
        }
        System.out.println("=== Результат: " + passed + "/" + tests.length + " тестов пройдено ===");
    }
}