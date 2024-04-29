public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> array = new MyArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        System.out.println("Item with index 2: " + array.get(2));
        array.remove(2);
        System.out.println("Item with index 2: " + array.get(2));
        array.add(2, 8);
        array.set(1, 6);
        for (int i = 0; i < array.getSize(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
        System.out.println(array.exists(5));
        System.out.println(array.exists(6));
        System.out.println(array.indexOf(5));
        System.out.println(array.indexOf(6));
        array.sort();
        for (int i = 0; i < array.getSize(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
        array.clear();
        System.out.println(array.getSize());
        System.out.println();

        System.out.println("Test for MyLinkedList");
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        System.out.println(myLinkedList.get(2));
        myLinkedList.add(2, 5);
        System.out.println(myLinkedList.get(2));
        for (int i = 0; i <myLinkedList.getSize(); i++) {
            System.out.print(myLinkedList.get(i) + " ");
        }
        System.out.println();
        myLinkedList.removeFirst();
        myLinkedList.removeLast();
        for (int i = 0; i <myLinkedList.getSize(); i++) {
            System.out.print(myLinkedList.get(i) + " ");
        }
        System.out.println();
        System.out.println(myLinkedList.getLast());
        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.indexOf(5));
        System.out.println(myLinkedList.lastIndexOf(5));
        Object[] arr = myLinkedList.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        myLinkedList.add(4);
        myLinkedList.set(1, 3);
        for (int i = 0; i < myLinkedList.getSize(); i++) {
            System.out.print(myLinkedList.get(i) + " ");
        }
        System.out.println();
    }
}