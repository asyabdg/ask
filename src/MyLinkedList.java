public class MyLinkedList<T> implements MyList<T> {
    private class MyNode<T> {
        T data;
        MyNode<T> next;

        public MyNode(T data) {
            this.data = data;
            next = null;
        }
    }
    private MyNode<T> head;
    private int size;

    public MyLinkedList(){
        head = null;
        size = 0;
    }

    public void add(T newItem) {
        MyNode<T> newNode = new MyNode<>(newItem);
        if (head == null) {
            head = newNode;
        }
        else {
            MyNode<T> currentNode = head;
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    public void addFirst(T newItem) {
        MyNode<T> newNode = new MyNode<>(newItem);
        newNode.next = head;
    }


    public void addLast(T newItem) {
        add(newItem);
    }

    public void add(int index, T newItem) {
        checkIndex(index);
        MyNode<T> newNode = new MyNode<>(newItem);
        MyNode<T> currentNode = head;

        for (int i = 0; i < index - 1; i++)  {
            currentNode = currentNode.next;
        }

        MyNode<T> node = currentNode.next;
        currentNode.next = newNode;
        newNode.next = node;
    }

    public void set(int index, T newItem) {
        checkIndex(index);
        MyNode<T> currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        currentNode.data = newItem;
    }


    public T get(int index) {
        checkIndex(index);
        MyNode<T> currentNode = head;
        if (index == 0)
            return currentNode.data;
        else {
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        }
        return currentNode.data;
    }

    public T getFirst() {
        return head.data;
    }

    public T getLast() {
        MyNode<T> currentNode = head;
        for (int i = 0; i < size - 1; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    public int getSize() {
        return size;
    }

    public void remove(int index) {
        checkIndex(index);
        if(index == 0)
            head = head.next;
        else {
            MyNode<T> currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
        }
        size--;
    }

    public void removeFirst() {
        head = head.next;
        size--;
    }

    public void removeLast() {
        MyNode<T> currentNode = head;
        for (int i = 0; i < size - 2; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        size--;
    }

    public void sort() {

    }

    public int indexOf(Object object) {
        MyNode<T> currentNode = head;
        for (int i = 0; i < size; i++) {
            if (currentNode.data == object) {
                return i;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    public int lastIndexOf(Object object) {
        MyNode<T> currentNode = head;
        MyNode<T> requiredNode;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (currentNode.data == object) {
                requiredNode = currentNode;
                index = i;
            }
            currentNode = currentNode.next;
        }
        return index;
    }

    public boolean exists(Object object) {
        MyNode<T> currentNode = head;
        for (int i = 0; i < size; i++) {
            if (currentNode.data == object) {
                return true;
            }
        }
        return false;
    }

    public Object[] toArray() {
        T[] array = (T[]) new Object[size];
        MyNode<T> currentNode = head;
        for (int i = 0; i < size; i++) {
            array[i] = currentNode.data;
            currentNode = currentNode.next;
        }
        return array;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index not correct");
    }

    public void clear() {
        head = null;
        size = 0;
    }

}