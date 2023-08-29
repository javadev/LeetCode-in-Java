package g2501_2600.s2598_smallest_missing_non_negative_integer_after_operations;

// #Medium #Array #Hash_Table #Math #Greedy #2023_08_29_Time_4_ms_(99.19%)_Space_58.2_MB_(83.87%)

public class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int n = nums.length;
        if (value == 1) {
            return n;
        }
        int[] a = new int[value];
        for (int i = 0; i < n; i++) {
            int k = nums[i] % value;
            if (k < 0) {
                k = (value + k) % value;
            }
            a[k]++;
        }
        int[] minsResult = mins(a);
        int min = minsResult[0];
        int minIndex = minsResult[1];
        return min * value + minIndex;
    }

    private int[] mins(int[] a) {
        int n = a.length;
        int min = 100001;
        int minIndex = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
            }
        }
        return new int[] {min, minIndex};
    }
}
