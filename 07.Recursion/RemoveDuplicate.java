import java.util.HashMap;

public class RemoveDuplicate {

    public static void removeDuplicate(String str, int idx, String result, HashMap<Character, Boolean> map) {
        if (idx == str.length()) {
            System.err.println(result);
            return;
        }
        if (map.get(str.charAt(idx)) == null) {
            result += str.charAt(idx);
            map.put(str.charAt(idx), true);

        }
        removeDuplicate(str, idx + 1, result, map);

    }

    public static void main(String[] args) {
        String str = "aaabbbccc";
        HashMap<Character, Boolean> map = new HashMap<>();
        removeDuplicate(str, 0, "", map);

    }
}
