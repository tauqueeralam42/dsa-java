import java.util.Stack;

public class ReverseStack {

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int temp = stack.pop();
        reverseStack(stack);
        pushBottom(stack, temp);
    }

    public static void pushBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int temp = stack.pop();
        pushBottom(stack, data);
        stack.push(temp);
    }

    public static void main(String[] arg) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        reverseStack(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());

        }
    }
}
