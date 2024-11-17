import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    boolean isEmpty(){
        return q1.isEmpty() && q2.isEmpty();
    }

    void push(int data){

        if(!q1.isEmpty()){
            q1.add(data);
        }else{
            q2.add(data);
        }
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }

        int top = -1;

        if(!q1.isEmpty()){
            while(q1.size() > 1){
                q2.add(q1.remove());
            }
            top =  q1.remove();
        }else{
            while(q2.size() > 1){
                q1.add(q2.remove());
            }
            top = q2.remove();
        }

        return top;

    }
    
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }

        int top = -1;

        if(!q1.isEmpty()){
            while(q1.size() > 1){
                q2.add(q1.poll());
            }
            top =  q1.poll();
            q2.add(top);
        }else{
            while(q2.size() > 1){
                q1.add(q2.poll());
            }
            top =  q2.poll();
            q1.add(top);
        }

        return top;
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
