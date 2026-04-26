package g3701_3800.s3739_count_subarrays_with_majority_element_ii;

// #Hard #Array #Hash_Table #Prefix_Sum #Divide_and_Conquer #Segment_Tree #Merge_Sort #Senior_Staff
// #Biweekly_Contest_169 #2026_04_26_Time_3_ms_(100.00%)_Space_90.94_MB_(36.19%)

public class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int pre = n + 1;
        long[] count = new long[2 * n + 2];
        long[] acc = new long[2 * n + 2];
        long res = 0;
        count[pre] = acc[pre] = 1;
        for (int a : nums) {
            pre += (a == target ? 1 : -1);
            acc[pre] = ++count[pre] + acc[pre - 1];
            res += acc[pre - 1];
        }
        return res;
    }
}
