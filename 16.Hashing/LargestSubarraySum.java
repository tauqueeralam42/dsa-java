import java.util.HashMap;

public class LargestSubarraySum {

    public static int largestSubarraySum(int[] arr){
        int n = arr.length;
        int maxLen = 0;
        int sum = 0;


        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        for(int i = 0; i<n; i++){
            sum += arr[i];
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }else{
                maxLen = Math.max(maxLen, i-map.get(sum));
            }
        }
        return maxLen;
    }
    

    public static void main(String[] args){
        int arr[] = {1,2,-3,4,5,6,-3,4,5,6};
        System.out.println(largestSubarraySum(arr));
    }
}
