import java.util.*;

public class ActivitySelection {

    public static void printMaxActivities(int[] start, int[]end, int n){

        int maxAct = 0;
        ArrayList<Integer> result = new ArrayList<>();

        int[][] activities = new int[n][3];

        for(int i =0; i<n; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort(activities, (a, b) -> a[2] - b[2]);
        System.out.println(Arrays.deepToString(activities));

        maxAct++;
        result.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i = 1; i<n; i++){
            if(activities[i][1] >= lastEnd){
                maxAct++;
                result.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Maximum number of activities that can be performed are: " + maxAct);
        System.out.println("Activities are: " + result);
    }
    
    public static void main(String[] args) {
        int[] start = {1, 0, 3, 5, 8, 5};
        int[] finish = {2, 6, 4, 7, 9, 9};
        int n = start.length;
        printMaxActivities(start, finish, n);
    }
}
