package g1601_1700.s1673_find_the_most_competitive_subsequence;

// #Medium #Array #Greedy #Stack #Monotonic_Stack
// #2022_04_19_Time_7_ms_(96.82%)_Space_54.9_MB_(88.07%)

public class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int[] r = new int[k];
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                r[j] = nums[i];
                j++;
            } else {
                int l = j - 1;
                while ((l >= 0) && (nums[i] < r[l]) && ((n - i) >= (k - l))) {
                    l--;
                }
                j = l + 1;
                if (j < k) {
                    r[j] = nums[i];
                    j++;
                }
            }
        }
        return r;
    }
}
