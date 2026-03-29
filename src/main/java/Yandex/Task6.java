package Yandex;//package Yandex;
//
//public class Task6 {
//    public static String getNum3Most(String s) {
//
//        int[] freq = new int[10];
//
//        int sumOfDigits = 0;
//        for (int i = 0; i < s.length(); i++) {
//            int digit = s.charAt(i) - '0';
//            freq[digit]++;
//            sumOfDigits += digit;
//        }
//
//
//        int remainder = sumOfDigits % 3;
//
//        if (remainder != 0) {
//            boolean removed = false;
//            for (int i = remainder; i <= 9; i += 3) {
//                if (freq[i] > 0) {
//                    freq[i]--;
//                    removed = true;
//                    break;
//                }
//            }
//
//            if (!removed) {
//                int target = 3 - remainder;
//                int count = 0;
//                for (int i = target; i <= 9; i += 3) {
//                    while (freq[i] > 0 && count < 2) {
//                        freq[i]--;
//                        count++;
//                    }
//                }
//            }
//        }
//
//        StringBuilder res = new StringBuilder();
//        for (int digit = 9; digit >= 0; digit--) {
//            for (int i = 0; i < freq[digit]; i++) {
//                res.append(digit);
//            }
//        }
//
//        return res.toString();
//
//    }
//}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = reader.readLine();

        int[] freq = new int[10];

        int sumOfDigits = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            freq[digit]++;
            sumOfDigits += digit;
        }

        int remainder = sumOfDigits % 3;

        if (remainder != 0) {
            boolean removed = false;
            for (int i = remainder; i <= 9; i += 3) {
                if (freq[i] > 0) {
                    freq[i]--;
                    removed = true;
                    break;
                }
            }

            if (!removed) {
                int target = 3 - remainder;
                int count = 0;
                for (int i = target; i <= 9; i += 3) {
                    while (freq[i] > 0 && count < 2) {
                        freq[i]--;
                        count++;
                    }
                }
            }
        }

        StringBuilder res = new StringBuilder();
        for (int digit = 9; digit >= 0; digit--) {
            for (int i = 0; i < freq[digit]; i++) {
                res.append(digit);
            }
        }

        String result = res.toString();

        writer.write(result);

        reader.close();
        writer.close();
    }
}