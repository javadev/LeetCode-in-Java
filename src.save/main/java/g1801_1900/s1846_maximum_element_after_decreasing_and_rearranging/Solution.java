package g1801_1900.s1846_maximum_element_after_decreasing_and_rearranging;

// #Medium #Array #Sorting #Greedy #2022_05_07_Time_4_ms_(93.59%)_Space_74.4_MB_(23.49%)

public class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int[] count = new int[arr.length + 1];
        for (int j : arr) {
            count[Math.min(j, arr.length)]++;
        }
        int ans = 1;
        for (int i = 1; i < count.length; i++) {
            ans = Math.min(i, ans + count[i]);
        }
        return ans;
    }
}
