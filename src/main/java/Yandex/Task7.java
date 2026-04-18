package Yandex;

import java.io.*;
import java.util.HashMap;

public class Task7 {
    public static int getVariants(int n, String s) {

        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1);

        int currentSum = 0;
        int res = 0;

        for (int i = 0; i < n; i++) {
            currentSum += (s.charAt(i) == 'a') ? 1 : -1;
            res += prefixMap.getOrDefault(currentSum, 0);
            prefixMap.put(currentSum, prefixMap.getOrDefault(currentSum, 0) + 1);
        }

        return res;

//        import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.HashMap;
//
//        public class Main {
//            public static void main(String[] args) throws IOException {
//                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
//
//                int n = Integer.parseInt(reader.readLine());
//                String s = reader.readLine();
//
//                HashMap<Integer, Integer> prefixMap = new HashMap<>();
//                prefixMap.put(0, 1);
//
//                int currentSum = 0;
//                long res = 0;
//
//                for (int i = 0; i < n; i++) {
//                    currentSum += (s.charAt(i) == 'a') ? 1 : -1;
//                    res += prefixMap.getOrDefault(currentSum, 0);
//                    prefixMap.put(currentSum, prefixMap.getOrDefault(currentSum, 0) + 1);
//                }
//
//                writer.write(String.valueOf(res));
//
//                reader.close();
//                writer.close();
//            }
//        }

    }
}
