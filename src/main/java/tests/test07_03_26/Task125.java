package tests.test07_03_26;

public class Task125 {
    public static void main(String[] args) {

        String s = "race a car";
        System.out.println(isPalindrome(s));

    }

    public static boolean isPalindrome(String s) {

        s = s.toLowerCase();

        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while (leftPointer < rightPointer) {
            while (leftPointer < rightPointer
                    && !Character.isLetter(s.charAt(leftPointer))
                    && !Character.isDigit(s.charAt(leftPointer))
            ) {
                leftPointer++;
            }

            while (rightPointer > leftPointer
                    && !Character.isLetter(s.charAt(rightPointer))
                    && !Character.isDigit(s.charAt(rightPointer))) {
                rightPointer--;
            }

            if (s.charAt(leftPointer) != s.charAt(rightPointer)) {
                return false;
            }

            leftPointer++;
            rightPointer--;
        }

        return true;
    }
}
