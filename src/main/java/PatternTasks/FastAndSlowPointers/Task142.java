package PatternTasks.FastAndSlowPointers;

public class Task142 {
    public static void main(String[] args) {

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        // мы еще не в начале цикла, а просто в месте встречи slow и fast

        while (head != slow) { // head и slow на одинаковом расстоянии от точки начала цикла (т.к. slow двигался на 1)
            head = head.next; // перемещаем их, пока не встретятся, это будет начало цикла
            slow = slow.next;
        }

        return head;
    }

}
