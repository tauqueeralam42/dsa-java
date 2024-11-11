import java.util.ArrayList;
import java.util.Arrays;

public class RotatedSortedPairSum {

    public static boolean rotatedSortedPairSum(ArrayList<Integer> nums, int sum) {
        int pivot = findPivot(nums);
        int left = pivot;
        int right = (pivot - 1 + nums.size()) % nums.size();

        while (left != right) {
            int currentSum = nums.get(left) + nums.get(right);
            if (currentSum == sum) {
                return true;
            } else if (currentSum < sum) {
                left = (left + 1) % nums.size();
            } else {
                right = (right - 1 + nums.size()) % nums.size();
            }
        }

        return false;
    }

    public static int findPivot(ArrayList<Integer> nums) {
        int left = 0;
        int right = nums.size() - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums.get(mid) > nums.get(right)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 0, 1, 2));
        int sum = 9;
        System.out.println(rotatedSortedPairSum(nums, sum));
    }
}
