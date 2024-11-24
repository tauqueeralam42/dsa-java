public class WordBreak {

    static class Node {
        Node[] children = new Node[26];
        boolean eow;

        Node() {
            eow = false;
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }

    }

    static Node root = new Node();

    public static void insert(String word) {
        Node temp = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (temp.children[index] == null) {
                temp.children[index] = new Node();
            }
            temp = temp.children[index];
        }
        temp.eow = true;
    }

    public static boolean search(String word) {
        Node temp = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (temp.children[index] == null) {
                return false;
            }
            temp = temp.children[index];
        }
        return temp.eow;
    }

    public static boolean wordBreak(String key){
        int n = key.length();
        if(n == 0){
            return true;
        }

        for(int i=1; i<=n; i++){
            if(search(key.substring(0, i)) && wordBreak(key.substring(i, n))){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] words = { "i", "like", "sam", "samsung", "mobile", "ice" };

        for (String word : words) {
            insert(word);
        }

        String key = "ilikesamsung";
        System.out.println(wordBreak(key));

    }

}
