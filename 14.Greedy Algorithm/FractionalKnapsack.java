import java.util.Arrays;

public class FractionalKnapsack{

    public static double fractionalKnapsack(int[] wt, int[] val, int capacity){
        int n = wt.length;
        double[][] ratio = new double[n][2];

        for(int i = 0; i<n; i++){
            ratio[i][0] = i;
            ratio[i][1] = (double)val[i]/wt[i];
        }

        Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));

        double maxVal = 0;
        for(int i =0; i<n; i++){
            int idx = (int)ratio[i][0];
            if(capacity >= wt[idx]){
                maxVal += val[idx];
                capacity -= wt[idx];
            }else{
                maxVal += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }

        return maxVal;
    }

    public static void main(String[] args){
        int[] wt = {10, 40, 20, 30};
        int[] val = {60, 40, 100, 120};
        int capacity = 50;
        System.out.println(fractionalKnapsack(wt, val, capacity));
    }
}