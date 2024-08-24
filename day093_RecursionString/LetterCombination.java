package day026;

public class LetterCombination {
    static String[] map = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public static void main(String[] args) {
        String inp = "23";
        getAllCombinations("", inp);
    }

    private static void getAllCombinations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int num = up.charAt(0) - '0';

        String str = map[num - 1];

        for(char ch : str.toCharArray()){
            getAllCombinations(p + ch, up.substring(1));
        }

    }

}
