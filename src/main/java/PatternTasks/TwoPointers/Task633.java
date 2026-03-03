package PatternTasks.TwoPointers;

public class Task633 {
    public static void main(String[] args) {
        int c = 2147483600;
        System.out.println(judgeSquareSum(c));
    }

    public static boolean judgeSquareSum(int c) {

        int left = 0;
        int right = (int) Math.sqrt(c);

        while (left <= right) {
            long sum = (long) left * left + (long)right * right;

            if (sum == c) {
                return true;
            } else if (sum < c) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}
