package PatternTasks.PrefixSum;

import java.util.Arrays;

public class Task238 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        int[] nums1 = new int[]{-1,1,0,-3,3};
        System.out.println(Arrays.toString(getMultipledNumsArr(nums)));
        System.out.println(Arrays.toString(getMultipledNumsArr(nums1)));
        System.out.println(Arrays.toString(getMultipledNumsArrByPrefixSum(nums1)));
    }

    private static int[] getMultipledNumsArr(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    res[i] *= nums[j];
                }
            }
        }
        return res;
    }

    private static int[] getMultipledNumsArrByPrefixSum(int[] nums) {
        int[] res = new int[nums.length];
        int pre = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = pre;
            pre *= nums[i];
        }

        int suf  = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            res[i] *= suf;
            suf *= nums[i];
        }
        return res;
    }


}
