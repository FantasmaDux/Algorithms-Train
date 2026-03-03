package KontestTink;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n + 1];
        int[] r = new int[n + 1];
        int[] a = new int[n + 1];
        int res = 0;

//        int[] fromLeft = new int[n+2];
//        int[] fromRight = new int[n+2];
        int[] waterInTank = new int[n + 2];

        for (int i = 1; i <= n; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
            a[i] = sc.nextInt();
        }

        for (int tank = 1; tank <= n; tank++) {

            // from right
            int rightSum = 0;
            for (int i = tank; i >= 1; i--) {
                if (i == tank) {
                    rightSum = a[i];
                } else {
                    int fromRight = rightSum;
                    if (l[i + 1] < rightSum) {
                        fromRight = l[i + 1];
                    }
                    if (a[i] < fromRight) {
                        rightSum += a[i];
                    } else {
                        rightSum += fromRight;
                    }
                }
            }

            // from left
            int leftSum = 0;
            for (int i = tank; i <= n; i++) {
                if (i == tank) {
                    leftSum = a[i];
                } else {
                    int fromLeft = leftSum;
                    if (r[i - 1] < leftSum) {
                        fromLeft = r[i - 1];
                    }
                    if (a[i] < fromLeft) {
                        leftSum += a[i];
                    } else {
                        leftSum += fromLeft;
                    }
                }
            }

            // in current
            waterInTank[tank] = rightSum + leftSum - a[tank];
            if (res < waterInTank[tank]) {
                res = waterInTank[tank];
            }
        }

        System.out.println(res);
    }
}
