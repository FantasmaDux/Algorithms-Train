//package Yandex.tests;
//
//import static Yandex.Task9.getMark;
//
//public class TestTask9 {
//    public static void main(String[] args) {
//        // Массив строк (ряды учеников)
//        String[] tests = {
//                "ABACABA",
//                "AZAA",
//                "ABABAB"
//        };
//
//        // Ожидаемые результаты
//        String[] expected = {
//                "B",
//                "Y",
//                "A"
//        };
//
//        System.out.println("=== Тестирование Task8 ===");
//        int passed = 0;
//        for (int t = 0; t < tests.length; t++) {
//            char res = getMark(tests[t]);
//            if (res == expected[t].charAt(0)) {
//                System.out.println("✓ PASS: \"" + tests[t] + "\" -> " + res);
//                passed++;
//            } else {
//                System.out.println("✗ FAIL: \"" + tests[t] + "\" -> " + res + ", expected: " + expected[t]);
//            }
//        }
//        System.out.println("=== Результат: " + passed + "/" + tests.length + " тестов пройдено ===");
//    }
//}