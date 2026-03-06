package PatternTasks.SlidingWindow;

public class Task1004 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }

    public static int longestOnes(int[] nums, int k) {
        int maxSeqLen = 0;
        int leftPointer = 0;
        int zeroCount = 0;

        for (int rightPointer = 0; rightPointer < nums.length; rightPointer++) {
            if (nums[rightPointer] == 0) {
                zeroCount++;
            }

            if (zeroCount > k) {
                if (nums[leftPointer] == 0) {
                    zeroCount--;
                }
                leftPointer++;

            }

            maxSeqLen = Math.max(maxSeqLen, rightPointer - leftPointer + 1);
        }

        return maxSeqLen;
    }
}
