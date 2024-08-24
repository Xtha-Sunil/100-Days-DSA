// 1. Two Sum
// https://leetcode.com/problems/two-sum

class Solution {
    public int[] twoSum(int[] a, int target) {
      Map<Integer, Integer> map = new HashMap<>();
      for(int i=0; i<a.length; i++){
      	if(map.containsKey(target-a[i])){
        	return new int[] {map.get(target-a[i]),i};
      	}
        map.put(a[i],i);
    	}
      
      throw new IllegalArgumentException();
  }
}