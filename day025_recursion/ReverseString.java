// Time Complixity : O(N)

public class ReverseString {
				public static void reverse(String str, int idx){
								if(idx == -1)
												return;
								
								System.out.println(str.charAt(idx));
								reverse(str, --idx);
				}
				
				
				public static void main(String[] args) {
								String str="Sunil";
								reverse(str, str.length()-1);
				}
}