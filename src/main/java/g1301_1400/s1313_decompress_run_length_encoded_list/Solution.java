package g1301_1400.s1313_decompress_run_length_encoded_list;

// #Easy #Array #2022_03_18_Time_11_ms_(10.55%)_Space_49_MB_(17.49%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i += 2) {
            int count = nums[i];
            int value = nums[i + 1];
            while (count-- > 0) {
                list.add(value);
            }
        }
        return list.stream().mapToInt(integer -> integer).toArray();
    }
}
