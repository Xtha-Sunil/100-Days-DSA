// Time Complixity : O(N)

// check first and last occurance
public class Occurances {
				static int first = -1, last = -1;
				public static void checkOccurance(String str, char ch, int idx){
								if(idx == str.length()){
												if(first == -1)
																System.out.println("Target doesnt exist in string.");
												else if(first != -1 && last == -1)
																System.out.println("Only one occurance at "+ idx);
								 else
												System.out.println("First occurance at " + first + " last occurance at "+ last);
																
																return;
								}
								
								if(str.charAt(idx) == ch){
												if(first == -1){
																first = idx;
												}else {
																last = idx;
												}
								}
								
								checkOccurance(str, ch, ++idx);
				}
				
				public static void main(String[] args) {
								checkOccurance("abcdefahdur", 'a', 0);
				}
}