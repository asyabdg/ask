public class MyStack<T> {
    private MyLinkedList<T> stack;
    private int size;

    public MyStack() {
        stack = new MyLinkedList<>();
        size = 0;
    }

    public void push(T data) {
        stack.add(data);
        size++;
    }

    public T pop() {
        if (empty()) {
            return null;
        }
        T lastItem = stack.getLast();
        stack.removeLast();
        size--;
        return lastItem;
    }

    public T peek() {
        return stack.getLast();
    }

    public int getSize() {
        return size;
    }

    public boolean empty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
}
