import java.util.Stack;

public class MaximumAreaHistogram {

    public static int maxAreaHistogram(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!s1.isEmpty() && arr[s1.peek()] >= arr[i]) {
                s1.pop();
            }
            if (s1.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = s1.peek();
            }
            s1.push(i);
        }

        for (int i = n - 1; i >= 0; i--) {
            while (!s2.isEmpty() && arr[s2.peek()] >= arr[i]) {
                s2.pop();
            }
            if (s2.isEmpty()) {
                right[i] = n;
            } else {
                right[i] = s2.peek();
            }
            s2.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int area = width * arr[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 6, 2, 3 };
        System.out.println(maxAreaHistogram(arr));
    }

}