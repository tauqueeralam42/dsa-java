public class InvertedHalfPyramid {

    //       *
    //     * *
    //   * * *
    // * * * *

    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--) {
                if (j > i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

}
