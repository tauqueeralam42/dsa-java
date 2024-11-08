public class SelectionSort {

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-2; i++){
            int minIdx = i;
            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args){
        int[] arr = {5, 3, 8, 4, 2};
        selectionSort(arr);
        printArray(arr);
    }
}
