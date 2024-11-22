import java.util.*;

public class MajorityElement {

    public static void majorityElement(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        Set<Integer> keys = map.keySet();

        for(int key: keys){
            if(map.get(key) > arr.length/3){
                System.out.println("Majority Element is: "+key);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
        majorityElement(arr);
    }
}