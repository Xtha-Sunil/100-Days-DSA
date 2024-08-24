// 9. Palindrome Number
// https://leetcode.com/problems/palindrome-number

class Solution {
    public boolean isPalindrome(int x) {
    	if(x<0)
        return false;
/*      
      String str = Integer.toString(x);
      int l=0, r = str.length()-1;
      for(int i=0; i<str.length()/2; i++){
        if(str.charAt(l++) != str.charAt(r--))
           return false;
      }
    
      return true;
*/
      int y=x,sum=0;
      
      while	(x>0){
        int rem = x % 10;
        sum = sum * 10 + rem;
        x /= 10;
      }
  
      return y==sum;
    }
}