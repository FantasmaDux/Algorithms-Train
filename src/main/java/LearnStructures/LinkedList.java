package LearnStructures;

public class LinkedList {

    static class Node {
        int data;
        Node next;
    }

    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            insertAtStart(data);
        } else {
            Node n = head;
            for (int i = 0; i < index-1; i++) {
                n = n.next;
            }

            node.next = n.next;
            n.next = node;
        }

    }

    public void deleteAt(int index) {
            if (index == 0) {
                head = head.next;
            } else {
                Node n = head;
                Node n1 = null;
                for (int i = 0; i < index-1; i++) {
                    n = n.next;
                }
                n1 = n.next;
                n.next = n1.next;

            }
    }

    public void show() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }




    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(4);
        linkedList.insert(12);
        linkedList.insert(5);
        linkedList.insertAtStart(7);
        linkedList.insertAt(2, 32);
        linkedList.insertAt(0, 32);
        linkedList.show();
        System.out.println("\n\n");
        linkedList.deleteAt(3);
        linkedList.show();

    }
}
