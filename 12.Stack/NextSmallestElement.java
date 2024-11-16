import java.util.Stack;

public class NextSmallestElement {

    public static int[] nextSmallestElementLeft(int[] arr){

        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];

        for(int i =0; i<n; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = arr[s.peek()];
            }
            s.push(i);
        }
        return ans;
    }

    public static int[] nextSmallestElementRight(int[] arr){
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];

        for(int i = n-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = arr[s.peek()];
            }
            s.push(i);
        }
        return ans;
    }

    public static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 10, 8 };
        int[] left = nextSmallestElementLeft(arr);
        int[] right = nextSmallestElementRight(arr);

        System.err.println("Next Smallest Element to the Left");
        printArray(left);
        System.err.println("Next Smallest Element to the Right");
        printArray(right);
        
    }
    
}
