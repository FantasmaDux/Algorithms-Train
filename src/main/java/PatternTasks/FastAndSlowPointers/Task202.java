package PatternTasks.FastAndSlowPointers;

public class Task202 {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        boolean isHappy = false;
        int slowPointer = n; // двигается на 1 шаг
        int fastPointer = getSquadSum(slowPointer);

        while (true) {
            slowPointer = getSquadSum(slowPointer); // двигается на 1 шаг
            fastPointer = getSquadSum(getSquadSum(fastPointer)); // двигается на 2 шага
            if (fastPointer == slowPointer && fastPointer != 1) { // могут встретиться сразу в 1. Если встретились не в 1, несчастливое
                isHappy = false;
                break;
            }

            if (fastPointer == 1 || slowPointer == 1) {
                isHappy = true;
                break;
            }
        }
        return isHappy;
    }

    private static int getSquadSum(int n) {

        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
}
