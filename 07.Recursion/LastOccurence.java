public class LastOccurence {
    

    public static int lastOccurence(int[] arr, int x, int i) {
        if (i == arr.length) {
            return -1;
        }
        int restArray = lastOccurence(arr, x, i + 1);
        if (restArray != -1) {
            return restArray;
        }
        if (arr[i] == x) {
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};
        System.out.println(lastOccurence(arr, 5, 0));
    }
}
