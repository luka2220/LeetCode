import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

class MyQueue {
    private Stack<Integer> store;
    private Stack<Integer> empty;

    public MyQueue() {
        store = new Stack<>();
        empty = new Stack<>();
    }

    public void push(int x) {
        store.push(x);
    }

    public int pop() {
        while (!store.isEmpty()) {
            empty.push(store.pop());
        }

        var result = empty.pop();

        while (!empty.isEmpty()) {
            store.push(empty.pop());
        }

        return result;
    }

    public int peek() {
        while (!store.isEmpty()) {
            empty.push(store.pop());
        }

        var result = empty.peek();

        while (!empty.isEmpty()) {
            store.push(empty.pop());
        }

        return result;
    }

    public boolean empty() {
        return store.isEmpty();
    }
}