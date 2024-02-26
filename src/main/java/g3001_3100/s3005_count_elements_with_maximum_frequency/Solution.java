package g3001_3100.s3005_count_elements_with_maximum_frequency;

// #Easy #Array #Hash_Table #Counting #2024_02_26_Time_1_ms_(99.76%)_Space_41.6_MB_(98.97%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S135")
public class Solution {
    public int maxFrequencyElements(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        List<Integer> list = new ArrayList<>();
        int co = 0;
        int prev = 0;
        for (int num : nums) {
            if (list.contains(num)) {
                continue;
            }
            list.add(num);
            if (list.size() == nums.length) {
                break;
            }
            int c = 0;
            for (int i : nums) {
                if (num == i) {
                    c++;
                }
            }
            if (c > 1) {
                if (c > prev) {
                    co = c;
                    prev = c;
                } else if (c == prev) {
                    co = c + co;
                }
            }
        }
        if (co == 0) {
            return nums.length;
        }
        return co;
    }
}
