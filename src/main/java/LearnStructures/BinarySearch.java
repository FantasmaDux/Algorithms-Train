package LearnStructures;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = new int[] {1, 3, 5, 7, 9};
        System.out.println(binarySearch(arr, 3));

    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high);
            int guess = arr[mid];
            if (guess == target) {
                return mid;
            } else if (guess > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
