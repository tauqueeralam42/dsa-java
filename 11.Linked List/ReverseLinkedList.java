public class ReverseLinkedList {

    public static LinkedList.Node reverse(LinkedList.Node head) {
        LinkedList.Node prev = null;
        LinkedList.Node current = head;
        LinkedList.Node next = null;

        while (current != null) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {

        // Create an instance of the LinkedList
        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);

        list.print(); // Output: 10 20 30
        list.head = reverse(list.head);
        list.print(); // Output: 30 20 10

    }
}