// time complixity : O(2^N)

// sub sequence means we can choose any char, exclude any char but order should be same
public class Subsequence {
		public static void subsequence(String str, int idx, String ans){
				if(str.length() == idx){
						System.out.println("=> " + ans);
						System.out.println("return \n");
						return;
				}
				
				// taking current char
				System.out.println("call* for "+ ans+str.charAt(idx));
				subsequence(str, idx+1, ans+str.charAt(idx));
				
				//not taking
				System.out.println("call for " + ans);
				subsequence(str, idx+1, ans);
		}
		
		public static void main(String[] args) {
				String str = "abc";
				subsequence(str, 0, "");
		}
}