package g3701_3800.s3737_count_subarrays_with_majority_element_i;

// #Medium #Array #Hash_Table #Prefix_Sum #Counting #Divide_and_Conquer #Segment_Tree #Merge_Sort
// #Senior #Biweekly_Contest_169 #2026_04_26_Time_1_ms_(100.00%)_Space_46.96_MB_(57.62%)

public class Solution {
    public int countMajoritySubarrays(int[] a, int target) {
        int n = a.length;
        int pre = n + 1;
        int res = 0;
        int[] count = new int[2 * n + 2];
        int[] acc = new int[2 * n + 2];
        count[pre] = acc[pre] = 1;
        for (int i : a) {
            pre += (i == target ? 1 : -1);
            count[pre]++;
            acc[pre] = acc[pre - 1] + count[pre];
            res += acc[pre - 1];
        }
        return res;
    }
}
