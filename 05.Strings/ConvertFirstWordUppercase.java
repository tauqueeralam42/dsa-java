public class ConvertFirstWordUppercase {

    public static String convertFirstLetterUppercase(String str) {
        String result = "";
        result += Character.toUpperCase(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                result += str.charAt(i);
                result += Character.toUpperCase(str.charAt(i + 1));
                i++;
            } else
                result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "hello World";
        System.out.println(convertFirstLetterUppercase(str)); // Hello world
    }
}
