// time complixity : N * N!

// here we will get N! answer and to get every answer we have to go through N recursive calls so time complixity is N*N!
/*
     A _ _
     /    \
  A B _   A C _
   /        \
A B C       A C B

    B
   / \
  A   C
 /     \
B       A

     C
    / \
   A   B
  /     \
 B       A
*/
public class Permutation {
		public static void allPerm(String str, String perm){
				
				// here we are modifying the actual string on every call so indexing doesnt make sense i.e idx == str.length()
				
				// when we add all item then there will be 0 option
				if(str.length() == 0){
						System.out.println(perm);
						return;
				}
				
				for(int i=0; i<str.length(); i++){
						char currChar = str.charAt(i);
						
						// removing the used item from option 
						String newStr = str.substring(0,i) + str.substring(i+1);
						
						allPerm(newStr, perm+currChar);
				}
		}
		
		public static void main(String[] args) {
				String str = "ABC";
				allPerm(str, "");
		}
}