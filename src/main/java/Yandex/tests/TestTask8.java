//package Yandex.tests;
//
//import static Yandex.Task7.getVariants;
//import static Yandex.Task8.getSquads;
//
//public class TestTask8 {
//    public static void main(String[] args) {
//        // Массив строк (ряды учеников)
//        String[] tests = {
//                "ULDR",
//                "ULRD"
//        };
//
//        // Ожидаемые результаты
//        long[] expected = {
//                1,
//                2
//        };
//
//        System.out.println("=== Тестирование Task8 ===");
//        int passed = 0;
//        for (int t = 0; t < tests.length; t++) {
//            long res = getSquads(tests[t]);
//            if (res == expected[t]) {
//                System.out.println("✓ PASS: \"" + tests[t] + "\" -> " + res);
//                passed++;
//            } else {
//                System.out.println("✗ FAIL: \"" + tests[t] + "\" -> " + res + ", expected: " + expected[t]);
//            }
//        }
//        System.out.println("=== Результат: " + passed + "/" + tests.length + " тестов пройдено ===");
//    }
//}