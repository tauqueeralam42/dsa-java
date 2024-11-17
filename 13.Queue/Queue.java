public class Queue {
    
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node front = null, rear = null;

    void add(int data){
        Node newNode = new Node(data);
        if(rear == null){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    int remove(){
        if(front == null){
            return -1;
        }
        int data = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return data;
    }

    int peek(){
        if(front == null){
            return -1;
        }
        return front.data;
    }

    boolean isEmpty(){
        return front == null;
    }

    void print(){
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.print();
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        q.print();
    }
}
