package g0101_0200.s0167_two_sum_ii_input_array_is_sorted;

// #Medium #Array #Binary_Search #Two_Pointers #Acceptance_58.8% #Algorithm_I_Day_3_Two_Pointers
// #Binary_Search_I_Day_7 #2022_03_04_Time_2_ms_(49.88%)_Space_49.8_MB_(25.20%)

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
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
            } else {
                j--;
            }
        }
        return res;
    }
}
