import java.util.Stack;

public class QueueUsingStack {
    
    public class Queue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        int remove(){
            if(s1.isEmpty()){
                return -1;
            }
            return s1.pop();
        }

        int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.peek();
        }

        boolean isEmpty(){
            System.out.println("Queue is Empty");
            return s1.isEmpty();
        }
    }

    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        Queue queue = q.new Queue();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }
}
