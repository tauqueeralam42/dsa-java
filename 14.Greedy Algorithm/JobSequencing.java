import java.util.*;

public class JobSequencing {

    public static void jobSequencing(int[] deadline, int[] profit) {
        int n = deadline.length;
        int[][] jobs = new int[n][3];
        for (int i = 0; i < n; i++) {
            jobs[i][0] = i;
            jobs[i][1] = deadline[i];
            jobs[i][2] = profit[i];
        }

        Arrays.sort(jobs, (a, b) -> b[2] - a[2]);

        ArrayList<Integer> result = new ArrayList<>();
        int maxProfit = 0;
        int time = 0;

        for (int i = 0; i < n; i++) {
            if (jobs[i][1] > time) {
                result.add(jobs[i][0]);
                maxProfit += jobs[i][2];
                time++;
            }
        }

        System.out.println("Maximum profit: " + maxProfit);
        System.out.println("Jobs: " + result);
    }


    public static void main(String[] args) {
        int[] deadline = { 4, 1, 1, 1 };
        int[] profit = { 20, 10, 40, 30 };
        jobSequencing(deadline, profit);
    }
}
