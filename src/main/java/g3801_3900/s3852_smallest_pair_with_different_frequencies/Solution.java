package g3801_3900.s3852_smallest_pair_with_different_frequencies;

// #Easy #Array #Hash_Table #Counting #Mid_Level #Biweekly_Contest_177
// #2026_07_22_Time_1_ms_(100.00%)_Space_46.80_MB_(62.33%)

public class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        int[] freq = new int[101];
        for (int num : nums) {
            freq[num]++;
        }
        int first = -1;
        int second = -1;
        for (int i = 1; i <= 100; i++) {
            if (freq[i] != 0) {
                if (first == -1) {
                    first = i;
                } else if (freq[i] != freq[first]) {
                    second = i;
                    break;
                }
            }
        }
        return second == -1 ? new int[] {-1, -1} : new int[] {first, second};
    }
}
