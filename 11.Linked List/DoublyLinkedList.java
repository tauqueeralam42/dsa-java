public class DoublyLinkedList {
    
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head = null;
    public Node tail = null;
    public int size = 0;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void add(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        size++;

        while(index > 1){
            temp = temp.next;
            index--;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
        newNode.next.prev = newNode;
    }

    public void deleteFirst(){
        if(head == null){
            return;
        }
        size--;
        if(head != tail){
            head = head.next;
            head.prev = null;
        }else{
            head = tail = null;
        }
    }

    public void deleteLast(){
        if(head == null){
            return;
        }
        size--;
        if(head != tail){
            tail = tail.prev;
            tail.next = null;
        }else{
            head = tail = null;
        }
    }

    public void delete(int index){
        if(index == 0){
            deleteFirst();
            return;
        }

        Node temp = head;
        size--;

        while(index > 0){
            temp = temp.next;
            index--;
        }

        if(temp.next != null){
            temp.next.prev = temp.prev;
        }else{
            tail = temp.prev;
        }

        temp.prev.next = temp.next;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        Node current = head;
        Node temp = null;

        while(current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if(temp != null){
            head = temp.prev;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();

        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        list.print(); // Output: 10<->20<->30<->40<->50<->null
        list.delete(2);
        list.print(); // Output: 10<->20<->40<->50<->null

        list.reverse();
        list.print(); // Output: 50<->40<->20<->10<->null
    }
}
