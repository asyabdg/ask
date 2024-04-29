public class MyArrayList<T> implements MyList<T> {
    private T[] array;
    private int size = 0;
    private int capacity = 5;
    public MyArrayList() {
        array = (T[]) new Object[capacity];
    }

    public T get(int index) {
        checkIndex(index);
        return array[index];
    }

    public T getFirst() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("Array is empty");
        }
        return array[0];
    }

    public T getLast() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("Array is empty");
        }
        return array[size - 1];
    }

    public void add(T newItem) {
        if (size == capacity) {
            increaseBuffer();
        }
        array[size++] = newItem;
    }

    public void set(int index, T newItem) {
        checkIndex(index);
        array[index] = newItem;
    }

    public void addFirst(T newItem) {
        if (size == capacity) {
            increaseBuffer();
        }
        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1];
        }
        size++;
        array[0] = newItem;
    }

    public void addLast(T newItem) {
        add(newItem);
    }

    public void add(int index, T newItem) {
        checkIndex(index);
        if (size == capacity) {
            increaseBuffer();
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        size++;
        array[index] = newItem;
    }

    public void removeLast() {
        size--;
    }

    public void removeFirst() {
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void sort() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (((Comparable)array[j + 1]).compareTo(array[j]) < 0) {
                    T item = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = item;
                }
            }
        }
    }

    public int indexOf(Object object) {
        for (int i = 0; i < size; i++) {
            if (array[i] == object) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object object) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i] == object) {
                return i;
            }
        }
        return -1;
    }

    public boolean exists(Object object) {
        for (int i = 0; i < size; i++) {
            if (array[i] == object) {
                return true;
            }
        }
        return false;
    }

    public Object[] toArray() {
        T[] array2 = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            array2[i] = array[i];
        }
        return array2;
    }

    public void clear() {
        capacity = 5;
        array = (T[]) new Object[capacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index is not correct");
        }
    }

    private void increaseBuffer() {
        capacity = (int) (1.5 * capacity);
        T[] array2 = (T[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }
}
