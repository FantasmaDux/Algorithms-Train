package Yandex.Top10Tasks;

public class Task2_subarrayWithMaxOnes {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 1, 0, 1};
        System.out.println(getMaxSubarrayLen(arr));
    }

    private static int getMaxSubarrayLen(int[] arr) {

        int maxLen = 0;

        int left = 0;
        int right = 0;
        int zeroCount = 0;

        while (right < arr.length) {

            if (arr[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (arr[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            right++;
            int currentLen = right - left + 1 - 1;
            maxLen = Math.max(maxLen, currentLen);
        }

        return maxLen;
    }
}
