package ArrayTasks;

public class RemoveDuplicatesfromSortedArray26 {
    private static int removeDuplicates(int[] nums) {
        int i = 0;
        int unique = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
