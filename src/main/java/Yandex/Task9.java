//package Yandex;
//
//import java.util.HashMap;
//
//public class Task9 {
//    public static char getMark(String s) {
//
//        int worstMark = 0;
//        for (int i = 0; i < s.length(); i++) {
//            int mark = s.charAt(i) - 'A';
//            if (mark > worstMark) {
//                worstMark = mark;
//            }
//        }
//
//        int sum = 0;
//        for (int i = 0; i < s.length(); i++) {
//            sum += s.charAt(i) - 'A';
//        }
//
//        double avg = (double) sum / s.length();
//        int roundedMark;
//
//        if (Math.abs(avg - Math.floor(avg) - 0.5) < 1e-9) {
//            roundedMark = (int) Math.floor(avg);
//        } else {
//            roundedMark = (int) Math.round(avg);
//        }
//
//        if (roundedMark < worstMark - 1) {
//            roundedMark = worstMark - 1;
//        }
//
//        char res = (char) ('A' + roundedMark);
//
//        return res;
//    }
//
//
//}
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String s = reader.readLine();
//
//        int worstMark = 0;
//        for (int i = 0; i < s.length(); i++) {
//            int mark = s.charAt(i) - 'A';
//            if (mark > worstMark) {
//                worstMark = mark;
//            }
//        }
//
//        int sum = 0;
//        for (int i = 0; i < s.length(); i++) {
//            sum += s.charAt(i) - 'A';
//        }
//
//        double avg = (double) sum / s.length();
//        int roundedMark;
//
//        if (Math.abs(avg - Math.floor(avg) - 0.5) < 1e-9) {
//            roundedMark = (int) Math.floor(avg);
//        } else {
//            roundedMark = (int) Math.round(avg);
//        }
//
//        if (roundedMark < worstMark - 1) {
//            roundedMark = worstMark - 1;
//        }
//
//        char res = (char) ('A' + roundedMark);
//
//
//        writer.write(String.valueOf(res));
//
//        reader.close();
//        writer.close();
//    }
//}