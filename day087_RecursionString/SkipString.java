public class SkipString {
    public static void main(String[] args) {
        String str = "sunil is king from nepal";
        System.out.println(verify(str, ""));
    }

    static String verify(String str, String ans){
        if(str.isEmpty()){
            return ans;
        }

        // !startsWith() if we want that substring
        if(str.startsWith("from")){
            return verify(str.substring(4), ans);
        }else{
            return verify(str.substring(1), ans+str.charAt(0));
        }
    }
}
