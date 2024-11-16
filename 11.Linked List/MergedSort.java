public class MergedSort {

    public static LinkedList.Node mergeSort(LinkedList.Node head){
        if(head == null || head.next == null){
            return head;
        }
        LinkedList.Node middle = getMiddle(head);
        LinkedList.Node nextOfMiddle = middle.next;
        middle.next = null;

        LinkedList.Node left = mergeSort(head);
        LinkedList.Node right = mergeSort(nextOfMiddle);

        LinkedList.Node sortedList = sortedMerge(left, right);
        return sortedList;
    }

    public static LinkedList.Node getMiddle(LinkedList.Node head){
        if(head == null){
            return head;
        }
        LinkedList.Node slow = head;
        LinkedList.Node fast = head.next;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static LinkedList.Node sortedMerge(LinkedList.Node a, LinkedList.Node b){
        LinkedList list = new LinkedList();
        LinkedList.Node mergeList = list.new Node(-1);
        LinkedList.Node temp = mergeList;

        while(a != null && b != null){
            if(a.data < b.data){
                temp.next = a;
                a = a.next;
            }else{
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }

        temp.next = (a == null) ? b : a;
        return mergeList.next;

    }
    

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(3);
        list.addLast(5);
        list.addLast(2);
        list.addLast(6);
        list.addLast(4);

        list.print();

        list.head = mergeSort(list.head);

        list.print();


    }
}
