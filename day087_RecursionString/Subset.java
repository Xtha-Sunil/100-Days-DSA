import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        String str = "abc";
        subsets("", str);
        System.out.println(getSubset("", str));
    }

    private static void subsets(String ans, String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        subsets(ans + ch, str.substring(1));
        subsets(ans, str.substring(1));
    }

    private static ArrayList<String> getSubset(String ans, String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> left = getSubset(ans + ch, str.substring(1));
        ArrayList<String> right = getSubset(ans, str.substring(1));

        left.addAll(right);
        return left;
    }
}
