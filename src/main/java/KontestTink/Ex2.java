package KontestTink;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfInputs = sc.nextInt();

        for (int i = 0; i < numOfInputs; i++) {
            int n = sc.nextInt();
            int[] nums = new int[n];

            for (int j = 0; j < n; j++) {
                nums[j] = sc.nextInt();
            }

            Arrays.sort(nums);

            boolean isCorrectP = true;
            int sum = 0;
            for (int k = 0; k < n; k++) {
                if (nums[k] > k + 1) {
                    isCorrectP = false;
                    break;
                }

                sum += nums[k];
            }

            if (!isCorrectP) {
                System.out.println("Second");
                continue;
            }

            int maxSum = n * (n + 1) / 2;
            int moves = maxSum - sum;

            if (moves % 2 == 1) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }

    }
}
