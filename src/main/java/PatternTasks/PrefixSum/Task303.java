package PatternTasks.PrefixSum;

public class Task303 {

    public class NumArray {
        private int[] prefixSumNum;

        public NumArray(int[] nums) {
            prefixSumNum = new int[nums.length + 1];
            prefixSumNum[0] = 0;
            for (int i = 1; i < prefixSumNum.length; i++) {
                prefixSumNum[i] = prefixSumNum[i - 1] + nums[i - 1];
            }
        }

        public int sumRange(int left, int right) {
            return prefixSumNum[right + 1] - prefixSumNum[left];
        }

    }
}
