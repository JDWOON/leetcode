package leetcode;

public class Solution {
	public int lengthOfLastWord(String s) {
		int start, end = s.length() - 1;

		while (end >= 0 && s.charAt(end) == ' ') {
			end--;
		}
		start = end;
		while (start >= 0 && s.charAt(start) != ' ') {
			start--;
		}
		return end - start;
	}
}