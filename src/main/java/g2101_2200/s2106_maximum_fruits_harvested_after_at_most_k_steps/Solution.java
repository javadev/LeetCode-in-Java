package g2101_2200.s2106_maximum_fruits_harvested_after_at_most_k_steps;

// #Hard #Array #Binary_Search #Prefix_Sum #Sliding_Window
// #2022_05_31_Time_4_ms_(86.67%)_Space_90.5_MB_(84.76%)

public class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int res = 0;
        int sum = 0;
        int left = 0;
        for (int right = 0; right < fruits.length; right++) {
            sum += fruits[right][1];
            while (left <= right && !isValidRange(fruits[left][0], fruits[right][0], startPos, k)) {
                sum -= fruits[left++][1];
            }
            res = Math.max(sum, res);
        }
        return res;
    }

    private boolean isValidRange(int leftPos, int rightPos, int startPos, int k) {
        final boolean result;
        if (rightPos <= startPos) {
            result = startPos - leftPos <= k;
        } else if (leftPos >= startPos) {
            result = rightPos - startPos <= k;
        } else {
            int left = startPos - leftPos;
            int right = rightPos - startPos;
            result = left <= right ? left * 2 + right <= k : right * 2 + left <= k;
        }
        return result;
    }
}
