package g1401_1500.s1423_maximum_points_you_can_obtain_from_cards;

// #Medium #Array #Prefix_Sum #Sliding_Window #2022_06_26_Time_2_ms_(94.06%)_Space_51_MB_(86.63%)

public class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int currSum = 0;
        int maxSum;
        for (int i = 0; i < k; i++) {
            currSum += cardPoints[i];
        }
        if (k == cardPoints.length) {
            return currSum;
        }
        maxSum = currSum;
        int r = cardPoints.length - 1;
        while (r >= cardPoints.length - k) {
            currSum += cardPoints[r] - cardPoints[k + r - cardPoints.length];
            maxSum = Math.max(currSum, maxSum);
            r--;
        }
        return maxSum;
    }
}
