public class InsertTrie {

    static class Node{
        Node[] children = new Node[26];
        boolean eow;

        Node(){
            eow = false;
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }

    }

    static Node root = new Node();

    public static void insert(String word){
        Node temp = root;
        for(int i=0; i<word.length(); i++){
            int index = word.charAt(i) - 'a';
            if(temp.children[index] == null){
                temp.children[index] = new Node();
            }
            temp = temp.children[index];
        }
        temp.eow = true;
    }



    public static void main(String[] args){
        String[] words = {"apple", "ape", "app", "banana", "bat"};

        for(String word: words){
            insert(word);
        }

    }
    
}
