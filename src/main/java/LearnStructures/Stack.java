package LearnStructures;

public class Stack<T> {
    // Using LIFO. Первый пришёл, последний ушёл.
    // Methods: push() (add to the top), pop( (remove from the top);
    private T[] arr;
    private int capacity;
    private int pointer = -1;

    public Stack(int capacity) {
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    public void push(T element) {
        if (pointer + 1 == arr.length) {
            throw new RuntimeException("Stack overflow");
        }
        arr[++pointer] = element;
    }

    public T pop() {
        if (pointer < 0) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[pointer--];
    }

    public static void main(String[] args) {
        java.util.Stack<String> games = new java.util.Stack<>();
        games.push("skyrim");
        games.push("oblivion");
        games.push("morovind");
        System.out.println(games.pop());
        System.out.println(games.pop());
        System.out.println(games.pop());


        // My implementation
        Stack<Integer> nums = new Stack<Integer>(3);
        nums.push(2);
        nums.push(3);
        nums.push(4);
        System.out.println(nums.pop());
    }
}
