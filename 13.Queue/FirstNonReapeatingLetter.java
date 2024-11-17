import java.util.Queue;
import java.util.LinkedList;

public class FirstNonReapeatingLetter {

    public static String firstNonRepeating(String str) {
        Queue<Character> q = new LinkedList<>();

        int[] count = new int[26];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            q.add(str.charAt(i));
            count[str.charAt(i) - 'a']++;

            while (!q.isEmpty() && count[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                sb.append('#');
            } else {
                sb.append(q.peek());
            }

        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aabccxb";
        System.out.println(firstNonRepeating(str));
    }
}
