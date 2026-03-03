package ByteOperations;

public class Task231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }

    public static boolean isPowerOfTwo(int n) {

        if (n == 0 || n < 0) return false;
        int ones = 0;
        while (n != 0) {
            ones += (n & 1);
            if (ones > 1) return false;
            n >>>= 1;
        }
        return true;
    }
}
