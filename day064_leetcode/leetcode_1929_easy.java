// 1929. Concatenation of Array
// https://leetcode.com/problems/concatenation-of-array/

class Solution {
    public int[] getConcatenation(int[] nums) {
      int n = nums.length;
      int newLen = n*2;
      
      int[] ans = new int[newLen];
      
      for(int i=0; i<newLen; i++){
        
        ans[i] = nums[i%n];
      }
      
      return ans;
    }
}