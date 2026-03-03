package ArrayTasks;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};

        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    //    public static int[] twoSum(int[] nums, int target) {
//        int[] res = {0, 0};
//        for (int i = 0; i < nums.length-1; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    res[0] = i;
//                    res[1] = j;
//                    return res;
//                }
//            }
//        }
//        return res;
//    }
    /*
    Считает дополнения.
    Само число и его индекс в мапу.
    Если нужное для дополнения число есть в мапе, выводим нашу пару.
     */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapa = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int complement = target - nums[i];
            if (mapa.containsKey(complement)) {
                return new int[]{mapa.get(complement), i};
            } else {
                mapa.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
