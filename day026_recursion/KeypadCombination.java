// time complixity : O(4^N)
// here worst case can be only 6 with 4chars as option
// so if str has N number of 6 then for every call there can be 4 option so (4*4*4*.....4)n Times => 4^N

public class KeypadCombination {
		public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
		
		public static void allCombn(String str, int idx, String ans){
				if(idx == str.length()){
						System.out.println(ans);
						return;
				}
				
				char currCharKey = str.charAt(idx);
				String opt = keypad[currCharKey - '0'];
				
				for(int i =0; i<opt.length(); i++){
						char currChar = opt.charAt(i);
						allCombn(str, idx+1, ans+currChar);
				}
		}
		
		public static void main(String[] args) {
				String str = "67534";
				allCombn(str, 0, "");
		}
}