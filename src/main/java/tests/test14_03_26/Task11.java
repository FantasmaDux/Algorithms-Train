package tests.test14_03_26;

public class Task11 {
    public static void main(String[] args) {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
//        if (height.length == 2) {
//            return Math.min(height[0], height[1])*Math.min(height[0], height[1]);
//        }
        int left = 0, right = height.length - 1;
        int max = 0;

        while (left < right) {
            int squad = ((right) - (left)) * Math.min(height[right], height[left]);
            max = Math.max(max, squad);
            if (height[left] < height[right]) {
                left++;
            } else
                right--;
        }

        return max;
    }
}
