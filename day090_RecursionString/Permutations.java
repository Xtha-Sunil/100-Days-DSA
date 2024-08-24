package day023;

public class Permutations {
    public static void main(String[] args) {
        String str = "abcd";
        getPerms(str, "");
    }

    static void getPerms(String str, String ans){
        if(str.length() == 0){
            System.out.print(ans + ", ");
            return;
        }

        for(int i=0; i<str.length(); i++){
            String newStr = str.substring(0,i) + str.substring(i+1);
            getPerms(newStr, ans+str.charAt(i));
        }
    }
}