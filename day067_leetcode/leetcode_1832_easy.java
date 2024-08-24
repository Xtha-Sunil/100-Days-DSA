// 1832. Check if the Sentence Is Pangram
// https://leetcode.com/problems/check-if-the-sentence-is-pangram/

class Solution {
	public boolean checkIfPangram(String sentence) {
		int freq[] = new int[26];

		for (int i = 0; i < sentence.length(); i++) {
			char currChar = sentence.charAt(i);
			freq[currChar - 'a'] = 1;
		}

		for (int i = 0; i < 26; i++)
			if (freq[i] != 1)
				return false;

		return true;
	}
}