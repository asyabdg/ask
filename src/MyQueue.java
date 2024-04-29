public class MyQueue<T> {
    private MyLinkedList<T> queue;
    private int size;

    public MyQueue() {
        queue = new MyLinkedList<>();
        size = 0;
    }

    public void enqueue(T data) {
        queue.add(data);
        size++;
    }

    public T dequeue() {
        if (empty()) {
            return null;
        }
        T topItem = queue.getFirst();
        queue.removeFirst();
        size--;
        return topItem;
    }

    public int getSize() {
        return size;
    }

    public T peek() {
        return queue.getFirst();
    }

    public boolean empty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
}
