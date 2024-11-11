public class GridWays {
    
    public static int countGridWays(int i, int j, int n, int m){
        if(i == n-1 && j == m-1){
            return 1;
        }
        if(i >= n || j >= m){
            return 0;
        }
        return countGridWays(i+1, j, n, m) + countGridWays(i, j+1, n, m);
    }

    public static void main(String[] args){
        int n = 3;
        int m = 3;
        System.out.println(countGridWays(0,0,n, m));
    }
}
