public class CountingSort {
    
    public static void countingSort(int[] arr){
        int n = arr.length;
        int max = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int[] count = new int[max+1];
        for(int i=0; i<=max; i++){
            count[i] = 0;
        }
        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }
        int k = 0;
        for(int i=0; i<=max; i++){
            for(int j=0; j<count[i]; j++){
                arr[k++] = i;
            }
        }
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    

    public static void main(String[] args){
        int[] arr = {5, 3, 8, 4, 2};
        countingSort(arr);
        printArray(arr);
    }
}
