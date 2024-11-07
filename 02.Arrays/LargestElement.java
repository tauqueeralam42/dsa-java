public class LargestElement {
    
    public static int largestElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int result = largestElement(arr);
        System.out.println("Largest element in the array is: " + result);
    }
}
