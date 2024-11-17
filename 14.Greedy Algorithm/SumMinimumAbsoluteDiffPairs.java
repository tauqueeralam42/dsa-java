import java.util.Arrays;

public class SumMinimumAbsoluteDiffPairs {

    public static int minimumAbsoluteDiff(int[] A, int[] B) {
        int sum = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++) {
            sum += Math.abs(A[i] - B[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] A = { 4, 1, 8, 7 };
        int[] B = { 2, 3, 6, 5 };
        System.out.println(minimumAbsoluteDiff(A, B));
    }
}
