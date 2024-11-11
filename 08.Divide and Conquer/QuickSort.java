public class QuickSort {

    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int index = partition(arr, left, right);
        quickSort(arr, left, index - 1);
        quickSort(arr, index+1, right);
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[ei];
        arr[ei] = temp;

        return i + 1;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 3, 1, 4 };
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
