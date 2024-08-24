// 1431. Kids With the Greatest Number of Candies
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

class Solution {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max = 0;
		for (int candy : candies)
			max =  Math.max(candy, max);

		List<Boolean> ans = new ArrayList<>();

		for (int i = 0; i < candies.length; i++)
			list.add(candies[i] + extraCandies >= max);

		return ans;
	}
}