package g0401_0500.s0421_maximum_xor_of_two_numbers_in_an_array;

// #Medium #Array #Hash_Table #Bit_Manipulation #Trie
// #2022_07_16_Time_14_ms_(100.00%)_Space_55.9_MB_(100.00%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int findMaximumXOR(int[] nums) {
        int max = 0;
        int mask = 0;
        Set<Integer> set = new HashSet<>();
        int maxNum = 0;
        for (int i : nums) {
            maxNum = Math.max(maxNum, i);
        }
        for (int i = 31 - Integer.numberOfLeadingZeros(maxNum); i >= 0; i--) {
            set.clear();
            int bit = 1 << i;
            mask = mask | bit;
            int temp = max | bit;
            for (int prefix : nums) {
                if (set.contains((prefix & mask) ^ temp)) {
                    max = temp;
                    break;
                }
                set.add(prefix & mask);
            }
        }
        return max;
    }
}
