package PatternTasks.MonotonicStack;

import LearnStructures.Array;

import java.util.Arrays;
import java.util.Stack;

public class Task496 {
    public static void main(String[] args) {
        int[] num1 = {4,1,2};
        int[] num2 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElement(num1, num2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] nextGreater = new int[10001]; // так как 1 <= nums1.length <= nums2.length <= 1000
        Stack<Integer> stack = new Stack<>();

        for (int i = nums2.length-1; i >= 0 ; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                    stack.pop();
            }
            nextGreater[nums2[i]] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nextGreater[nums1[i]];
        }

        return nums1;
    }
}
