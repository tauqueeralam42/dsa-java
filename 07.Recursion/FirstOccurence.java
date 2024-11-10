public class FirstOccurence {

    public static int firstOccurence(int[] arr, int x, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == x) {
            return i;
        }
        return firstOccurence(arr, x, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(firstOccurence(arr, 5, 0));
    }
}