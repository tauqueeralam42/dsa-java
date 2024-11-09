public class ClearithBit {

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
    
    public static void main(String[] args){
        int n = 5;
        int i = 0;
        System.out.println(clearIthBit(n, i));
    }
}
