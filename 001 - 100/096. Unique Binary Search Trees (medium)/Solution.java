package leetcode;

public class Solution {
	public int numTrees(int n) {
		int[] result = new int[n + 1];
		result[0] = 1;
		result[1] = 1;
		for (int i = 2; i < n + 1; i++) {
			result[i] = 0;
			for (int j = 0; j < i; j++) {
				result[i] += result[j] * result[i - j - 1];
			}
		}
		return result[n];
	}
}