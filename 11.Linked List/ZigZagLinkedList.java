public class ZigZagLinkedList {

    public static LinkedList.Node zigZag(LinkedList.Node head){
        if(head == null || head.next == null){
            return head;
        }

        LinkedList.Node mid = getMid(head);
        LinkedList.Node second = mid.next;
        mid.next = null;

        second = reverse(second);

        LinkedList.Node left = head;
        LinkedList.Node right = second;
        LinkedList.Node nextL,nextR;

        while(right != null){
            nextL = left.next;
            nextR = right.next;

            left.next = right;
            right.next = nextL;

            left = nextL;
            right = nextR;
           
        }
        return head;
    }

    public static LinkedList.Node getMid(LinkedList.Node head){
        if(head == null){
            return head;
        }
        LinkedList.Node slow = head;
        LinkedList.Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static LinkedList.Node reverse(LinkedList.Node head){
        if(head == null || head.next == null){
            return head;
        }
        LinkedList.Node prev = null;
        LinkedList.Node curr = head;
        LinkedList.Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        list.print();

        list.head = zigZag(list.head);

        list.print();
    }
}
