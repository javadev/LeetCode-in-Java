package g1601_1700.s1679_max_number_of_k_sum_pairs;

// #Medium #Array #Hash_Table #Sorting #Two_Pointers
// #2022_04_21_Time_20_ms_(91.22%)_Space_52.7_MB_(87.98%)

import java.util.Arrays;

public class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int count = 0;
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == k) {
                count++;
                start++;
                end--;
            } else if (sum < k) {
                start++;
            } else {
                end--;
            }
        }
        return count;
    }
}
