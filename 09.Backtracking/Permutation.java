public class Permutation {

    public static void permutation(String str, int index){
        if(index == str.length()){
            System.out.println(str);
            return;
        }
        for(int i = index; i < str.length(); i++){
            str = swap(str, index, i);
            permutation(str, index+1);
            str = swap(str, index, i);
        }
    }

    public static String swap(String str, int i, int j){
        char arr[] = str.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }
    

    public static void main(String[] arg){
        String str = "abc";
        permutation(str, 0);
    }
}
