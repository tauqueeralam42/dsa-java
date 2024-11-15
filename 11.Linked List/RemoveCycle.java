public class RemoveCycle {

    public static void removeCycle(LinkedList.Node head) {
        LinkedList.Node slow = head;
        LinkedList.Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        if (slow != fast)
            return;
        slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        list.head.next.next.next.next = list.head.next;

        System.out.println(DetectCycle.detectCycle(list.head));
        removeCycle(list.head);
        System.out.println(DetectCycle.detectCycle(list.head));
    }
}
