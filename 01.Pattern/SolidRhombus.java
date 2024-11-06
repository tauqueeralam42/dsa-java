public class SolidRhombus {

    //     * * * *
    //    * * * *
    //   * * * *
    //  * * * *

    public static void main(String[] arg) {

        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
