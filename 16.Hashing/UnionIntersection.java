import java.util.HashSet;

public class UnionIntersection {

    public static void union(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i = 0; i<arr2.length; i++){
            set.add(arr2[i]);
        }

        System.out.println("Union of two arrays: "+set);
    }

    public static void intersection(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for(int i = 0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i = 0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                intersection.add(arr2[i]);
            }
        }

        System.out.println("Intersection of two arrays: "+intersection);
    }
    
    public static void main(String[] args){
        int arr1[] = { 1, 2, 4, 5, 6 };
        int arr2[] = { 2, 3, 5, 7 };

        union(arr1, arr2);
        intersection(arr1, arr2);
    }
}
