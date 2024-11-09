public class SubString {
    
    public static String subString(String str, int start, int end){
        String result = "";
        for(int i = start; i < end; i++){
            result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(subString(str, 0, 3)); // mad
        System.out.println(subString(str, 2, 5)); // dam
        System.out.println(subString(str, 2, str.length())); // dam
    }
}
