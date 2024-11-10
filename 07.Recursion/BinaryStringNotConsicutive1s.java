public class BinaryStringNotConsicutive1s {
    
public static void generateBinaryStrings(int n, String str, int lastDigit) {
    if (n == 0) {
        System.out.println(str);
        return;
    }
    
    generateBinaryStrings(n - 1, str + "0", 0);
    
    if (lastDigit == 0) {
        generateBinaryStrings(n - 1, str + "1", 1);
    }
}

public static void main(String[] args) {
    int n = 3;
    generateBinaryStrings(n, "", 0);
}
    
}
