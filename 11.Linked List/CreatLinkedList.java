public class CreatLinkedList {

    public static void main(String[] args) {

        // Create an instance of the LinkedList class
        LinkedList list = new LinkedList();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        list.add(0, 7);
        list.add(7, 8);

        list.print();
        System.out.println("Size of the list is: " + list.size);

        list.removeFirst();
        list.removeLast();

        list.print();
        System.out.println("Size of the list is: " + list.size);

    }
}