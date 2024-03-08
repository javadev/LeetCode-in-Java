package g2901_3000.s2935_maximum_strong_pair_xor_ii;

// #Hard #Array #Hash_Table #Bit_Manipulation #Sliding_Window #Trie
// #2024_01_03_Time_126_ms_(76.94%)_Space_60.1_MB_(73.25%)

import java.util.Arrays;
import java.util.BitSet;

public class Solution {
    private final int[] map = new int[1 << 20];

    public int maximumStrongPairXor(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max = nums[n - 1];
        int ans = 0;
        int mask;
        int masks = 0;
        int highBit = 20;
        while (--highBit >= 0) {
            if (((max >> highBit) & 1) == 1) {
                break;
            }
        }
        int m = 1 << highBit + 1;
        BitSet seen = new BitSet(m);
        for (int i = highBit; i >= 0; i--) {
            mask = 1 << i;
            masks |= mask;
            if (check(nums, masks, ans | mask, seen)) {
                ans |= mask;
            }
            seen = new BitSet(m);
        }
        return ans;
    }

    private boolean check(int[] nums, int masks, int ans, BitSet seen) {
        for (int x : nums) {
            int mask = x & masks;
            if (seen.get(mask ^ ans) && x <= 2 * map[mask ^ ans]) {
                return true;
            }
            seen.set(mask);
            map[mask] = x;
        }
        return false;
    }
}
