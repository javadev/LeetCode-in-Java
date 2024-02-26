package g2201_2300.s2261_k_divisible_elements_subarrays;

// #Medium #Array #Hash_Table #Trie #Enumeration #Hash_Function #Rolling_Hash
// #2022_06_18_Time_73_ms_(92.32%)_Space_67.2_MB_(78.03%)

import java.util.HashSet;

public class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        HashSet<Long> numSubarray = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int countDiv = 0;
            long hashCode = 1;
            for (int j = i; j < nums.length; j++) {
                hashCode = 199L * hashCode + nums[j];
                if (nums[j] % p == 0) {
                    countDiv++;
                }
                if (countDiv <= k) {
                    numSubarray.add(hashCode);
                } else {
                    break;
                }
            }
        }
        return numSubarray.size();
    }
}
