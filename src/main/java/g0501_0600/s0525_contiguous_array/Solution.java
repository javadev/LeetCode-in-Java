package g0501_0600.s0525_contiguous_array;

// #Medium #Array #Hash_Table #Prefix_Sum

import java.util.HashMap;

public class Solution {
    public int findMaxLength(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int ps = 0, len = 0;
        for (int i = 0; i < nums.length; i++) {
            ps += nums[i];
            if (!map.containsKey(ps)) {
                map.put(ps, i);
            } else {
                len = Math.max(len, i - map.get(ps));
            }
        }
        return len;
    }
}
