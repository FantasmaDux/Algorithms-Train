package PatternTasks.PrefixSum;

class NumArray {
    private int[] n;
    public NumArray(int[] nums) {
        n = new int[nums.length];
        n[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            n[i] = nums[i] + n[i-1];
        }
    }

    public int sumRange(int left, int right) {
        if (n.length == 1) {
            return n[right];
        }
        return n[right] - n[left-1];
    }

    public static void main(String[] args) {
        int[] arr = {1};
        NumArray numArray = new NumArray(arr);
        System.out.println(numArray.sumRange(0, 0));
    }
}