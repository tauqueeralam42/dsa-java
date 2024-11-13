import java.util.LinkedList;

public class SearchLinkedList{

    public static int search(LinkedList<Integer> list, int key){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == key){
                System.out.println("Element found at index: " + i);
                return i;
            }
        }
        System.out.println("Element not found");
        return -1;
    }

    public static int recSearch(LinkedList<Integer> list, int key, int index){

        if(list.get(0) == key){
            return index;
        }
        if(list.size() == 1){
            return -1;
        }

        return recSearch(new LinkedList<>(list.subList(1, list.size())), key, index + 1);
    }


    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(97); 
        list.add(98); 
        list.add(113); 
        list.add(72);
        list.add(1);

        search(list, 1);
        System.out.println("Recursive search result: " + recSearch(list, 1, 0));

    }
}