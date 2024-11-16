public class SearchLinkedList {

    public static int search(LinkedList.Node head, int key) {
        LinkedList.Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data == key) {
                System.out.println("Element found at index: " + index);
                return index;
            }
            index++;
            current = current.next;
        }
        System.out.println("Element not found in the list");
        return -1;
    }

    public static int recSearch(LinkedList.Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int res = recSearch(head.next, key);
        if (res == -1) {
            return -1;
        } else {
            return res + 1;
        }

    }

    public static void main(String[] args) {

        // Create an instance of the LinkedList
        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);

        search(list.head, 10); // Output: Element found at index: 0
        System.out.println(recSearch(null, 0)); // Output: -1

    }
}