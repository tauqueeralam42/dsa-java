public class ClearLastithBit {

    public static int clearLastIthBit(int n, int i) {
        int bitMask = (-1 << i);
        return n & bitMask;
    }
    
    public static void main(String[] args) {
        int n = 15;
        int i = 2;
        System.out.println(clearLastIthBit(n, i));
    }
}
