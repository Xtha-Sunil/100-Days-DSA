// 1431. Kids With the Greatest Number of Candies
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int greatest = 0;

        for (int i = 0; i < candies.length; i++) {
            greatest = Math.max(greatest, candies[i]);
        }

        for (int i = 0; i < candies.length; i++) {
            list.add(candies[i] + extraCandies >= greatest);
        }

        return list;
    }
}