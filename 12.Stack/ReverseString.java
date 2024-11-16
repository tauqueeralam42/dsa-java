import java.util.Stack;

public class ReverseString {

    public static String reverseStack(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder reversed = new StringBuilder("");

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();

    }

    public static String reverseRec(String str) {
        if (str.length() == 0) {
            return str;
        }

        return reverseRec(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverseRec(str));
        System.out.println(reverseStack(str));
        
    }

}
