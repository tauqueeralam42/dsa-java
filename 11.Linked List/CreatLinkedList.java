public class CreatLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void addFirst(int data){
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
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
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
        }

        public void add(int index, int data){
            if(index == 0){
                addFirst(data);
                return;
            }

            Node temp = head;
            Node newNode = new Node(data);
            size++;

            while(index > 1){
                temp = temp.next;
                index--;
            }
            newNode.next = temp.next;
            temp.next = newNode;

        }

        public int removeFirst(){
            if(head == null){
                System.out.println("List is empty");
                return -1;
            }
            else if(head == tail){
                Node temp = head;
                head = null;
                tail = null;
                size--;
                return temp.data;
            }
            else{
                Node temp = head;
                head = head.next;
                temp.next = null;
                size--;
                return temp.data;
            }
        }
        
        public int removeLast(){
            if(head == null){
                System.out.println("List is empty");
                return -1;
            }
            else if(head == tail){
                Node temp = head;
                head = null;
                tail = null;
                size--;
                return temp.data;
            }
            else{
                Node temp = head;
                while(temp.next != tail){
                    temp = temp.next;
                }
                Node lastNode = tail;
                tail = temp;
                temp.next = null;
                size--;
                return lastNode.data;
            }
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        list.add(0, 7);
        list.add(7, 8);

        list.display();
        System.out.println("Size of the list is: " + list.size);

        list.removeFirst();
        list.removeLast();

        list.display();
        System.out.println("Size of the list is: " + list.size);

    }
}