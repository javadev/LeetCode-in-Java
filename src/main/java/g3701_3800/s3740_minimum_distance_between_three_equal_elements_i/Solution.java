package g3701_3800.s3740_minimum_distance_between_three_equal_elements_i;

// #Easy #Array #Hash_Table #Mid_Level #Weekly_Contest_475
// #2026_04_26_Time_1_ms_(99.99%)_Space_44.21_MB_(75.36%)

public class Solution {
    public int minimumDistance(int[] nums) {
        int len = nums.length;
        int[] last2 = new int[len];
        int res = 200;

        for (int i = 0; i < len; i++) {
            int val = nums[i] - 1;
            int pos = i + 1, pack = last2[val];
            int old = pack & 255, cur = pack >> 8;

            last2[val] = cur | (pos << 8);

            if (old > 0) res = Math.min(res, (pos - old) << 1);
        }

        return res == 200 ? -1 : res;
    }
}
