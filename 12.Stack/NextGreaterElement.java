import java.util.*;

public class NextGreaterElement {

    public static int[] nextGreaterElementRight(int[] arr){
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        for(int i = n-1; i>=0; i--){

            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
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

    public static int[] nextGreaterElementLeft(int[] arr){
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int [] ans = new int[n];

        for(int i = 0; i<n; i++){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
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
        int[] arr = {6, 8, 0, 1, 3};
        int[] right = nextGreaterElementRight(arr);
        int[] left = nextGreaterElementLeft(arr);

        System.out.println("Next Greater Element to the Right");
        printArray(right);
        System.out.println("Next Greater Element to the Left");
        printArray(left);
        
    }
}
