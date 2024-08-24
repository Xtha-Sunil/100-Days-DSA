// time comoluxity : O(2^N)

import java.util.*;

public class UniqueSubsequence {
		public static void uniqueSubsequence(String str, int idx, String ans, HashSet<String> set){
				
				if(idx == str.length()){
						if(!set.contains(ans)){
								set.add(ans);
								System.out.println(ans);
						}
						return;
				}
				
				// taking current char
				uniqueSubsequence(str, idx+1, ans+str.charAt(idx), set);
				
				//not taking
				uniqueSubsequence(str, idx+1, ans, set);
		}
		
		public static void main(String[] args) {
				String str = "aaa";
				HashSet<String> set = new HashSet<>();
				uniqueSubsequence(str, 0, "", set);
		}
}