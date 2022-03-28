package g1401_1500.s1423_maximum_points_you_can_obtain_from_cards;

// #Medium #Array #Prefix_Sum #Sliding_Window #2022_03_28_Time_4_ms_(31.70%)_Space_65.6_MB_(39.85%)

public class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxScore = 0;
        if (cardPoints.length <= k) {
            for (int point : cardPoints) {
                maxScore += point;
            }
            return maxScore;
        }
        for (int i = 0; i < k; i++) {
            maxScore += cardPoints[i];
        }
        int runningSum = maxScore;
        for (int i = cardPoints.length - 1, j = 1; i >= 0 && j <= k; i--, j++) {
            runningSum = runningSum - cardPoints[k - j] + cardPoints[i];
            maxScore = Math.max(maxScore, runningSum);
        }
        return maxScore;
    }
}
