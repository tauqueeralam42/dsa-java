import java.util.Arrays;

public class MaximumLengthChainPair {

    public static int maxLengthChain(int[][] pairs){
        int n = pairs.length;

        Arrays.sort(pairs, (a, b) -> Double.compare(a[1], b[1]));

        int maxLen = 1;
        int lastEnd = pairs[0][1];
        for(int i = 1; i<n; i++){
            if(pairs[i][0] > lastEnd){
                maxLen++;
                lastEnd = pairs[i][1];
            }
        }
        return maxLen;
    }

    public static void main(String[] args){
        int[][] pairs = {{5, 24}, {39, 60}, {15, 28}, {27, 40}, {50, 90}};
        System.out.println(maxLengthChain(pairs));
    }
    
}
