package PatternTasks.PrefixSum;

public class Task209 {
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target, arr));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int[] prefixSumNum = new int[nums.length + 1];
        prefixSumNum[0] = 0;

        for (int i = 1; i < prefixSumNum.length; i++) {
            prefixSumNum[i] = nums[i-1] + prefixSumNum[i-1];
        }

        int minLen = Integer.MAX_VALUE;

        for (int r = 1; r <= nums.length; r++) {
            int needed = prefixSumNum[r] - target;
            int l = binarySearch(prefixSumNum, 0, r, needed);
            if (l != -1) {
                minLen = Math.min(minLen, r-l);
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    private static int binarySearch(int[] prefixSumNum, int left, int right, int needed) {
        int res = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (prefixSumNum[mid] <= needed) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return res;
    }
}
