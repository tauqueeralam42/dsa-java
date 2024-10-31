public class Character {

    // A
    // BC
    // DEF
    // GHIJ

    public static void main(String[] args) {

        int n = 4;
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
