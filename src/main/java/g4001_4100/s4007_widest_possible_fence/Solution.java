package g4001_4100.s4007_widest_possible_fence;

// #Hard #Array #Hash_Table #Counting #Enumeration #Senior #Biweekly_Contest_188
// #2026_11_17_Time_214_ms_(100.00%)_Space_240.96_MB_(90.41%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maximumWidth(int[] planks) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int plank : planks) {
            freqMap.merge(plank, 1, Integer::sum);
        }
        int n = freqMap.size();
        int i = 0;
        int[] nums = new int[n];
        int[] freq = new int[n];
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            nums[i] = entry.getKey();
            freq[i++] = entry.getValue();
        }
        return getMax(n, nums, freq);
    }

    private static int getMax(int n, int[] nums, int[] freq) {
        Map<Integer, Integer> fence = HashMap.newHashMap(n * n);
        int max = 1;
        for (int right = 0; right < n; ++right) {
            int curr = nums[right];
            int count = freq[right];
            max = Math.max(max, fence.merge(curr, count, Integer::sum));
            if (count > 1) {
                max = Math.max(max, fence.merge(curr << 1, count >> 1, Integer::sum));
            }
            for (int left = right + 1; left < n; ++left) {
                max =
                        Math.max(
                                max,
                                fence.merge(
                                        curr + nums[left],
                                        Math.min(count, freq[left]),
                                        Integer::sum));
            }
        }
        return max;
    }
}
