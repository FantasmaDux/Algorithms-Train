package PatternTasks.PrefixSum;

public class Task724 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int[] prefNums = new int[nums.length + 1];
        prefNums[0] = 0;

        for (int i = 1; i < prefNums.length; i++) {
            prefNums[i] = prefNums[i - 1] + nums[i - 1];
        }


        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (prefNums[i] == prefNums[n] - prefNums[i + 1]) { // условие берется из rightSum == leftSum
                                                // leftSum = nums[0..i-1] rightSum = nums[i+1..n], где i - опорный
                                                // prefNums - уже посчитал суммы. поэтому для каждого левого эл-та
                                                //  смотрим последний элемент вычесть следующий после левого
                                                // помним, что левый элемент - сумма всех элементов слева от i
                                                // prefNums - сумма всех элементов
                                                // prefNums[i + 1] - все элементы слева, плюс текущий, тогда
                                                // разность даст все элементы справа
                return i;
            }
        }
        return -1;
    }
}
