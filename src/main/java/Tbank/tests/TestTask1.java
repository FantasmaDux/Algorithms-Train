//package Tbank.tests;
//
//import static Yandex.Task1.getSubString;
//
//public class TestTask1 {
//    public static void main(String[] args) {
//        String[] tests = {
//                "a", "h", "b", "aaaa", "hhhh",
//                "ah", "ha", "ahah", "hahah",
//                "aah", "hha", "ahahxaha"
//        };
//
//        int[] expected = {
//                1, 0, 0, 1, 0,
//                2, 2, 4, 5,
//                2, 2, 4
//        };
//
//        for (int t = 0; t < tests.length; t++) {
//            int res = (tests[t].length(), tests[t]); // твоя функция
//            if (res == expected[t]) {
//                System.out.println("Pass: " + tests[t] + " -> " + res);
//            } else {
//                System.out.println("Fail: " + tests[t] + " -> " + res + ", expected: " + expected[t]);
//            }
//        }
//    }
//}
