package g2401_2500.s2426_number_of_pairs_satisfying_inequality;

// #Hard #Array #Binary_Search #Ordered_Set #Divide_and_Conquer #Segment_Tree #Binary_Indexed_Tree
// #Merge_Sort #2022_11_19_Time_12_ms_(99.69%)_Space_60.6_MB_(86.02%)

public class Solution {
    private long[] cnt;

    private long find(int x, int n) {
        long res = 0;
        x = Math.min(x, n);
        while (x > 0) {
            res += cnt[x];
            x -= (x & (-x));
        }
        return res;
    }

    private void update(int x, int n) {
        while (x <= n) {
            cnt[x] += 1;
            x += (x & (-x));
        }
    }

    public long numberOfPairs(int[] nums1, int[] nums2, int diff) {
        int n = nums1.length;
        int[] nums = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            nums[i] = nums1[i] - nums2[i];
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        max = max - min + 2;
        long ans = 0;
        cnt = new long[50000];
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] - min + 1;
            ans += find(nums[i] + diff, max);
            update(nums[i], max);
        }
        return ans;
    }
}
