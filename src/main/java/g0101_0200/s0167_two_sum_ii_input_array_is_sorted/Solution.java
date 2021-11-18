package g0101_0200.s0167_two_sum_ii_input_array_is_sorted;

public class Solution {
	public int[] twoSum(int[] numbers, int target) {
		int res[] = new int[2];
		int i = 0;
		int j = numbers.length - 1;

		while (i < j) {
			int sum = numbers[i] + numbers[j];
			if (sum == target) {
				res[0] = i + 1;
				res[1] = j + 1;
				return res;
			} else if (sum < target) {
				i++;
			}

			else {
				j--;
			}

		}
		return res;
	}
}
