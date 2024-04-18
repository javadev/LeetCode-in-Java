package g3001_3100.s3092_most_frequent_ids;

// #Medium #Array #Hash_Table #Heap_Priority_Queue #Ordered_Set
// #2024_04_18_Time_3_ms_(100.00%)_Space_69_MB_(49.39%)

public class Solution {
    public long[] mostFrequentIDs(int[] nums, int[] freq) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        long[] bins = new long[max + 1];
        int mostFrequentID = 0;
        long maxCount = 0;
        long[] ans = new long[n];
        for (int i = 0; i < n; i++) {
            bins[nums[i]] += freq[i];
            if (freq[i] > 0) {
                if (bins[nums[i]] > maxCount) {
                    maxCount = bins[nums[i]];
                    mostFrequentID = nums[i];
                }
            } else {
                if (nums[i] == mostFrequentID) {
                    maxCount = bins[nums[i]];
                    for (int j = 0; j <= max; j++) {
                        if (bins[j] > maxCount) {
                            maxCount = bins[j];
                            mostFrequentID = j;
                        }
                    }
                }
            }
            ans[i] = maxCount;
        }
        return ans;
    }
}
