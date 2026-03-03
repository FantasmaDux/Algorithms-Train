package KontestTink;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minNum = sc.nextInt();
        int digitCount = 4;

        int[] numArr = new int[digitCount];

        for (int i = digitCount - 1; i >= 0; i--) {
            numArr[i] = minNum % 10;
            minNum /= 10;
        }

        for (int i = 0; i < digitCount; i++) {
            for (int j = 0; j < digitCount - 1 - i; j++) {
                if (numArr[j] > numArr[j + 1]) {
                    int tempDigit = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = tempDigit;
                }
            }
        }

        if (numArr[0] == 0) {
            for (int i = 1; i < digitCount; i++) {
                if (numArr[i] != 0) {
                    numArr[0] = numArr[i];
                    numArr[i] = 0;
                    break;
                }
            }
        }

        for (int i = 0; i < digitCount; i++) {
            minNum = minNum * 10 + numArr[i];
        }

        System.out.println(minNum);
    }
}
