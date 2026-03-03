package PatternTasks.TwoPointers;

public class Task125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        s = s.toLowerCase();

        while (left < right) {
            char leftChar = s.charAt(left), rightChar = s.charAt(right);
            boolean isNum = leftChar >= '0' && leftChar <= '9';
            boolean isLetter = leftChar >= 'a' && leftChar <= 'z';
            if (!(isNum || isLetter)) {
                left++;
                continue;
            }

            isNum = rightChar >= '0' && rightChar <= '9';
            isLetter = rightChar >= 'a' && rightChar <= 'z';
            if (!(isNum || isLetter)) {
                right--;
                continue;
            }

            if (leftChar != rightChar) {
                return false;
            }
                left++;
                right--;
        }
        return true;
    }
}
