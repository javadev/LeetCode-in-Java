package g0401_0500.s0421_maximum_xor_of_two_numbers_in_an_array;

// #Medium #Array #Hash_Table #Bit_Manipulation #Trie

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int findMaximumXOR(int[] nums) {
        int max = 0, mask = 0;
        Set<Integer> set = new HashSet<Integer>();
        int maxNum = 0;
        for (int i : nums) maxNum = Math.max(maxNum, i);
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
