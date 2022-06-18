package g2201_2300.s2261_k_divisible_elements_subarrays;

// #Array #Hash_Table #Trie #Rolling_Hash #Hash_Function #Enumeration
// #2022_06_18_Time_73_ms_(92.32%)_Space_67.2_MB_(78.03%)

import java.util.HashSet;

class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        HashSet<Long> numSubarray = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int count_div = 0;
            long hashCode = 1;
            for (int j = i; j < nums.length; j++) {
                hashCode = 199L * hashCode + nums[j];
                if (nums[j] % p == 0) {
                    ++count_div;
                }
                if (count_div <= k) {
                    numSubarray.add(hashCode);
                } else {
                    break;
                }
            }
        }
        return numSubarray.size();
    }
}
