package g1801_1900.s1865_finding_pairs_with_a_certain_sum;

// #Medium #Array #Hash_Table #Design #2022_05_10_Time_195_ms_(83.97%)_Space_74.2_MB_(92.11%)

import java.util.HashMap;
import java.util.Map;

public class FindSumPairs {
    private Map<Integer, Integer> numFreq = new HashMap<>();
    private int[] nums1;
    private int[] nums2;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        for (int num : nums2) {
            numFreq.put(num, numFreq.getOrDefault(num, 0) + 1);
        }
    }

    public void add(int index, int val) {
        numFreq.put(nums2[index], numFreq.getOrDefault(nums2[index], 0) - 1);
        nums2[index] += val;
        numFreq.put(nums2[index], numFreq.getOrDefault(nums2[index], 0) + 1);
    }

    public int count(int tot) {
        int res = 0;
        for (int num : nums1) {
            res += numFreq.getOrDefault(tot - num, 0);
        }
        return res;
    }
}
