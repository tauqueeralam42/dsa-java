import java.util.*;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] arr){
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
    
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        int[] res = nextGreaterElement(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
