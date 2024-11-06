public class HollowRhombus {

    //     * * * *
    //    *     *
    //   *     *
    //  * * * * 

    public static void main(String[] arg) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if (i == 1 || i == n) {
                    System.out.print("* ");
                } else {
                    if (j == 0 || j == n - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
