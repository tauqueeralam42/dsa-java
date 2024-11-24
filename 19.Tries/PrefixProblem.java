public class PrefixProblem {
    static class Node {
        Node[] children = new Node[26];
        boolean eow;
        int frq;

        Node() {
            eow = false;
            frq = 1;
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
            } else {
                temp.children[index].frq++;
            }
            temp = temp.children[index];
        }
        temp.eow = true;
    }

    public static void printPrefix(String[] words) {
        for (String word : words) {
            Node temp = root;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                temp = temp.children[index];
                if (temp.frq == 1) {
                    System.out.print(word.substring(0, i + 1) + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] words = { "zebra", "dog", "duck", "dove" };

        for (String word : words) {
            insert(word);
        }

        printPrefix(words);

    }
}
