package PatternTasks.LinkedListInPlaceReversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task206 {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        ListNode head = arrayToList(input);
        ListNode reversedHead = reverseList(head);
        System.out.println(Arrays.toString(listToArray(reversedHead)));
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static ListNode reverseList(ListNode head) {
        ListNode temp;
        ListNode prev = null;

        while (head != null) {
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }














    public static ListNode arrayToList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    public static int[] listToArray(ListNode head) {
        List<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }
        // Преобразуем List<Integer> в int[]
        return values.stream().mapToInt(i -> i).toArray();
    }

}
