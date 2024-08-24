// 1436. Destination City
// https://leetcode.com/problems/destination-city

class Solution {
	public String destCity(List<List<String>> paths) {
		Set<String> startingCities = new HashSet<>();

		for (List<String> path : paths)
			startingCities.add(path.get(0));


		for (List<String> path : paths)
			if (!startingCities.contains(path.get(1)))
				return path.get(1);


		return ""; // handle case where no destination city is found
	}
}