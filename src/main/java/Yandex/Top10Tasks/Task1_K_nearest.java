package Yandex.Top10Tasks;

import java.util.Arrays;

public class Task1_K_nearest {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5, 7, 11};
        int idx = 3;
        int k = 2;

        System.out.println(Arrays.toString(getKnearest(arr, idx, k)));
    }

    private static int[] getKnearest(int[] arr, int idx, int k) {

        int left = idx - 1;
        int right = idx + 1;
        int[] res = new int[k];

        res[0] = arr[idx];

        for (int i = 1; i < k; i++) {

            if (left < 0) {
                res[i] = arr[right];
                right++;
            } else if (right >= arr.length) {
                res[i] = arr[left];
                left--;
            } else {
                int leftRes = Math.abs(arr[idx] - arr[left]);
                int rightRes = Math.abs(arr[idx] - arr[right]);

                if (leftRes < rightRes) {
                    res[i] = arr[left];
                    left--;
                } else {
                    res[i] = arr[right];
                    right++;
                }
            }
        }
        return res;
    }
}
