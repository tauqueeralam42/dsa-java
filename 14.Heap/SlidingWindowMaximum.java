import java.util.PriorityQueue;

public class SlidingWindowMaximum {

    static class Pair implements Comparable<Pair>{
        int index;
        int value;
        Pair(int index, int value){
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(Pair p){
            return p.value - this.value;
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k){
        int n = nums.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i=0; i<k; i++){
            pq.add(new Pair(i, nums[i]));
        }
        int[] res = new int[n-k+1];
        res[0] = pq.peek().value;
        for(int i=k; i<n; i++){
            pq.add(new Pair(i, nums[i]));
            while(pq.peek().index <= i-k){
                pq.poll();
            }
            res[i-k+1] = pq.peek().value;
        }
        return res;
    }


    public static void main(String[] args){
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] res = maxSlidingWindow(nums, k);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
    
}
