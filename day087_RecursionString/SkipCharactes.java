 public class SkipCharactes {
    public static void main(String[] args) {
        String str = "baccad";
        skip(str, "");
    }

    private static void skip(String str, String ans){
        if(str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char c = str.charAt(0);
        if(c == 'a'){
            skip(str.substring(1), ans);
        }else{
            skip(str.substring(1), ans+c);
        }
    }
}