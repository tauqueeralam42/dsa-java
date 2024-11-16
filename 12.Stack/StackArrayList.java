import java.util.ArrayList;

  public class StackArrayList {
    ArrayList<Integer> list = new ArrayList<Integer>();

    boolean isEmpty() {
        if (list.size() == 0) {
            System.out.println("Stack is empty");
            return true;
        }
        return false;

    }

    void push(int data) {
        list.add(data);
    }

    int pop() {
        if (isEmpty()) {
            return -1;
        }
        int data = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return data;
    }

    int peek() {
        if (isEmpty()) {
            return -1;
        }
        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
  }


  


