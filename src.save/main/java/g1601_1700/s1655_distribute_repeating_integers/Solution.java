package g1601_1700.s1655_distribute_repeating_integers;

// #Hard #Array #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask
// #2022_04_23_Time_7_ms_(94.23%)_Space_75.4_MB_(73.08%)

import java.util.Arrays;

public class Solution {
    public boolean canDistribute(int[] nums, int[] quantity) {
        int[] counter = count(nums);
        Arrays.sort(quantity);
        return dfs(counter, quantity, quantity.length - 1);
    }

    private boolean dfs(int[] counter, int[] quantity, int quantityId) {
        if (quantityId < 0) {
            return true;
        }
        for (int i = 0; i < counter.length; i++) {
            if (i > 0 && counter[i] == counter[i - 1]) {
                continue;
            }
            if (counter[i] >= quantity[quantityId]) {
                counter[i] -= quantity[quantityId];
                if (dfs(counter, quantity, quantityId - 1)) {
                    return true;
                }
                counter[i] += quantity[quantityId];
            }
        }
        return false;
    }

    private int[] count(int[] nums) {
        int[] counter = new int[1001];
        for (int n : nums) {
            counter[n]++;
        }
        Arrays.sort(counter);
        return Arrays.copyOfRange(counter, counter.length - 50, counter.length);
    }
}
