// 1929. Concatenation of Array
// https://leetcode.com/problems/concatenation-of-array

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];
        
        for(int i=0; i<2*n; i++){
            ans[i] = nums[i%n];
        }
        return ans;
    }
}