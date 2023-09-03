package g1901_2000.s1998_gcd_sort_of_an_array;

// #Hard #Array #Math #Sorting #Union_Find #2022_05_16_Time_51_ms_(100.00%)_Space_71.9_MB_(67.50%)

import java.util.Arrays;

public class Solution {
    public boolean gcdSort(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int len = nums.length;
        int max = sorted[len - 1];
        // grouping tree child(index)->parent(value), index==value is root
        int[] nodes = new int[max + 1];
        for (int j : nums) {
            nodes[j] = -1;
        }
        // value: <=0 not sieved, <0 leaf node, 0 or 1 not in nums, >1 grouped
        for (int p = 2; p <= max / 2; p++) {
            if (nodes[p] > 0) {
                // sieved so not a prime number.
                continue;
            }
            // p is now a prime number, set self as root.
            nodes[p] = p;
            int group = p;
            int num = p + p;
            while (num <= max) {
                int existing = nodes[num];
                if (existing < 0) {
                    // 1st hit, set group
                    nodes[num] = group;
                } else if (existing <= 1) {
                    // value doesn't exist in nums
                    nodes[num] = 1;
                } else if ((existing = root(nodes, existing)) < group) {
                    nodes[group] = existing;
                    group = existing;
                } else {
                    nodes[existing] = group;
                }
                num += p;
            }
        }
        for (int i = 0; i < len; i++) {
            if (root(nodes, nums[i]) != root(nodes, (sorted[i]))) {
                return false;
            }
        }
        return true;
    }

    private static int root(final int[] nodes, int num) {
        int group;
        while ((group = nodes[num]) > 0 && group != num) {
            num = group;
        }
        return num;
    }
}
