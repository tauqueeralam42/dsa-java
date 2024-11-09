public class DiagonalSum {

    public static void diagonalSum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {

            sum += matrix[i][i];

            if (i != n - i - 1)
                sum += matrix[i][n - i - 1];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        diagonalSum(matrix);
    }
}
