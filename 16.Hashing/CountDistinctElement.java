import java.util.*;

public class CountDistinctElement {
    public static void countDistinctElement(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println("Count of distinct elements: " + set.size());
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
        countDistinctElement(arr);
    }
}