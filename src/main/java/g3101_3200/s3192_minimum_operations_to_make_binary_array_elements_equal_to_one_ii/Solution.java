package g3101_3200.s3192_minimum_operations_to_make_binary_array_elements_equal_to_one_ii;

// #Medium #Array #Dynamic_Programming #Greedy #2024_06_26_Time_6_ms_(99.64%)_Space_62.9_MB_(17.52%)

public class Solution {
    public int minOperations(int[] nums) {
        int a = 0;
        int c = 1;
        for (int x : nums) {
            if (x != c) {
                a++;
                c ^= 1;
            }
        }
        return a;
    }
}
