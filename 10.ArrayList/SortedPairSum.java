import java.util.ArrayList;

public class SortedPairSum {

    public static boolean sortedPairSum(ArrayList<Integer> list, int sum) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int currentSum = list.get(left) + list.get(right);
            if (currentSum == sum) {
                return true;
            } else if (currentSum < sum) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }
    
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int sum = 10;
        System.out.println(sortedPairSum(list, sum));
    }
}
