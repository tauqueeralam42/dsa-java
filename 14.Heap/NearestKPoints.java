import java.util.PriorityQueue;

public class NearestKPoints {

    static class Points implements Comparable<Points>{
        int x;
        int y;
        int dis;

        Points(int x, int y){
            this.x = x;
            this.y = y;
            this.dis = x*x + y*y;
        }

        @Override
        public int compareTo(Points p){
            return this.dis - p.dis;
        }
    }

    public static int[][] kClosest(int[][] points, int k) {
        int n = points.length;

        PriorityQueue<Points> pq = new PriorityQueue<>();

        for(int i = 0; i<n; i++){
            pq.add(new Points(points[i][0], points[i][1]));
        }
       
        int[][] result = new int[k][2];
        for(int i = 0; i<k; i++){
            Points p = pq.remove();
            result[i][0] = p.x;
            result[i][1] = p.y;
        }

        return result;
        
    }
    

    public static void main(String[] args){
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        int[][] result = kClosest(points, k);
        for (int[] point : result) {
            System.out.println(point[0] + " " + point[1]);
        }
    }
}
