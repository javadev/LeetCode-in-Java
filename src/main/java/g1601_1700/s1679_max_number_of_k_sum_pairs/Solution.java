package g1601_1700.s1679_max_number_of_k_sum_pairs;

// #Medium #Array #Hash_Table #Sorting #Two_Pointers
// #2022_04_21_Time_22_ms_(85.31%)_Space_67.1_MB_(70.80%)

import java.util.Arrays;

public class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int c = 0;
        int j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == k) {
                c++;
                i++;
                j--;
            } else if (sum > k) {
                j--;
            } else {
                i++;
            }
        }
        return c;
    }
}
