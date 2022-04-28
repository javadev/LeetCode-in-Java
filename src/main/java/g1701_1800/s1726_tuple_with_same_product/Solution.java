package g1701_1800.s1726_tuple_with_same_product;

// #Medium #Array #Hash_Table #2022_04_28_Time_235_ms_(90.73%)_Space_63.4_MB_(87.42%)

import java.util.HashMap;

public class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> AB = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                AB.put(nums[i] * nums[j], AB.getOrDefault(nums[i] * nums[j], 0) + 1);
            }
        }

        int count = 0;
        for (Integer key : AB.keySet()) {
            int val = AB.get(key);
            count = count + (val * (val - 1)) / 2;
        }

        return count * 8;
    }
}
