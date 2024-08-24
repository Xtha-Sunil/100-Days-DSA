package day015;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Sunil";
        reverse(str);
    }

    private static void reverse(String str){
        if(str.length() == 0 ) 
            return;
        reverse(str.substring(1));
        System.out.println(str.charAt(0));
    }
}