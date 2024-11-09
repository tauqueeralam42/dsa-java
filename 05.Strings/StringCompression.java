public class StringCompression {

    public static String compress(String str) {
        String result = "";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            result += str.charAt(i);

            if (count > 1) {
                result += count;
                count = 1;

            } 

        }   
        return result;
    }

    public static void main(String[] args) {
        String str = "aaabbcccd";
        System.out.println(compress(str)); // a3b2c3d1
    }
}
