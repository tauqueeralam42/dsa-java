import java.util.PriorityQueue;

public class WeakestSoldierRow {

    static class Row implements Comparable<Row>{
        int index;
        int count;
        Row(int index, int count){
            this.index = index;
            this.count = count;
        }
        public int compareTo(Row r){
            if(this.count == r.count){
                return this.index - r.index;
            }
            return this.count - r.count;
        }
    }

    public static int[] kWeakestRows(int[][] mat, int k){
        int n = mat.length;
        int m = mat[0].length;
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<m; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            pq.add(new Row(i, count));
        }
        int[] res = new int[k];
        for(int i=0; i<k; i++){
            res[i] = pq.poll().index;
        }
        return res;
    }
    

    public static void main(String[] args){
        int[][] mat = {{1,1,0,0,0},
                       {1,1,1,1,0},
                       {1,0,0,0,0},
                       {1,1,0,0,0},
                       {1,1,1,1,1}};
        int k = 3;
        int[] res = kWeakestRows(mat, k);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
