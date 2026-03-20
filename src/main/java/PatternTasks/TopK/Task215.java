package PatternTasks.TopK;

import java.util.PriorityQueue;

public class Task215 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));

    }


    private static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // с самого начала это minHeap
                               // значит, вверху самый маленький элемент

        for (int num : nums) {
            pq.offer(num); // добавляем элемент

            if (pq.size() > k) { // держим всегда только k элементов, лишние удаляем
                pq.poll();      // типа так мы будем от минимумов избавляться, потому что
            }                   // они всегда вверх всплывают
        }
        return pq.peek();
    }
}
