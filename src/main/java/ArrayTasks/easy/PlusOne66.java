package ArrayTasks.easy;

public class PlusOne66 {
    public static void main(String[] args) {
        int[] di = {1, 2, 3};
        int[] res = plusOne(di);
        for (int i : res) {
            System.out.println(i + " ");
        }
    }

    public static int[] plusOne(int[] digits) {
        int step = 1;
        for (int i = digits.length-1; i >=0; i--) {
            int sum = digits[i] + step;
            digits[i] = sum % 10;
            step = sum / 10;

            if (step == 0) {
                return digits;
            }
        }

        if (step == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        return digits;
    }
}
