package Yandex;

public class Task4 {
    public static long getRowsTask4(long n) {
        long ans = Long.MAX_VALUE;

        for (long row = 1; row <= Math.sqrt(n); row++) {
            long rowLen = n / row;
            long rowLenRem = n % row;

            long maxStInRow = rowLenRem > 0 ? rowLen : rowLen+1;
            long diffModule = Math.abs(rowLen - maxStInRow);

            ans = Math.min(ans, diffModule);
        }
        return ans;
    }
}
