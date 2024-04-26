public interface MyList {
    int size();
    boolean isEmpty();
    void add(Object element);
    void add(int index, Object element);
    Object remove(int index);
    Object get(int index);
    Object set(int index, Object element);
    boolean contains(Object element);
    int indexOf(Object element);
    int lastIndexOf(Object element);
    void clear();
    Iterator iterator();
}

public class MyArrayList implements MyList {
    private Object[] array;
    private int size;

    public MyArrayList() {
        array = new Object[10];
        size = 0;
    }

}

public class MyLinkedList implements MyList {
    private class MyNode {
        private Object element;
        private MyNode next;
        private MyNode prev;

        public MyNode(Object element) {
            this.element = element;
            this.next = null;
            this.prev = null;
        }
    }

    private MyNode head;
    private MyNode tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

}

public class MyStack {
    private MyArrayList list;

    public MyStack() {
        list = new MyArrayList();
    }

}

public class MyQueue {
    private MyArrayList list;

    public MyQueue() {
        list = new MyArrayList();
    }

}

public class MyMinHeap {
    private MyArrayList list;

    public MyMinHeap() {
        list = new MyArrayList();
    }

}

