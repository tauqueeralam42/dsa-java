import java.util.*;

public class Subset {

    public static void subset(String str, int index, StringBuilder current){
        if(index == str.length()){
            System.out.println(current);
            return;
        }
        subset(str, index+1, current.append(str.charAt(index)));
        current.deleteCharAt(current.length()-1);
        subset(str, index+1, current);
    }

    public static void subset(int arr[], int index, ArrayList<Integer> current){
        if(index == arr.length){
            System.out.println(current);
            return;
        }
        current.add(arr[index]);
        subset(arr, index+1, current);
        current.remove(current.size()-1);
        subset(arr, index+1, current);
    }
    
    public static void main(String[] arg){
        String str = "abc";
        subset(str, 0, new StringBuilder(""));

        int arr[] = {1, 2, 3};
        subset(arr, 0, new ArrayList<Integer>());
    }
}
