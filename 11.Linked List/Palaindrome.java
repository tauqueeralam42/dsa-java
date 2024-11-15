public class Palaindrome {

    public static boolean isPalindrome(LinkedList.Node head){
        LinkedList.Node slow = head;
        LinkedList.Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        LinkedList.Node head1 = head;
        LinkedList.Node head2 = ReverseLinkedList.reverse(slow);

        while(head2 != null){
            if(head1.data != head2.data){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        return true;
    }

    
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);

        System.out.println(isPalindrome(list.head));
    }
}
