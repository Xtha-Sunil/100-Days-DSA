// Time Complixity : O(N+count)
// here in worst case i.e all chars are X then count becomes N
// TC = O(N+N) = O(2N) => O(N)


public class MoveX {
				public static String moveAllX(String str, int idx, int count, StringBuilder newStr){
								if(idx == str.length() - 1){
												for(int i=0; i<count; i++){
																newStr.append('x');
												}
												return newStr.toString();
								}
								
								if(str.charAt(idx) == 'x')
												count++;
								else
												newStr.append(str.charAt(idx));
												
												
								return moveAllX(str,idx+1, count, newStr);
				}
				
				public static void main(String[] args) {
								StringBuilder sb = new StringBuilder();
								String str = "axtrexguxx";
								System.out.println(str + " becomes " + moveAllX(str, 0, 0, sb));
				}
}