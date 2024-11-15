public class DetectCycle {


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.head.next.next.next.next = list.head.next;
        System.out.println(detectCycle(list.head));
    }

    public static boolean detectCycle(LinkedList.Node head) {
        LinkedList.Node slow = head;
        LinkedList.Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
}