package g0501_0600.s0532_k_diff_pairs_in_an_array;

// #Medium #Array #Hash_Table #Sorting #Binary_Search #Two_Pointers

import java.util.HashSet;

public class Solution {
    public int findPairs(int[] nums, int k) {
        int res = 0;
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> twice = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                if (k == 0 && !twice.contains(n)) {
                    res++;
                    twice.add(n);
                } else {
                    continue;
                }
            } else {
                if (set.contains(n - k)) {
                    res++;
                }
                if (set.contains(n + k)) {
                    res++;
                }
            }

            set.add(n);
        }

        return res;
    }
}
