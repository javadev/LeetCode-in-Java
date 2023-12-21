package g2101_2200.s2139_minimum_moves_to_reach_target_score;

// #Medium #Math #Greedy #2022_06_05_Time_1_ms_(37.95%)_Space_40.8_MB_(55.49%)

public class Solution {
    public int minMoves(int target, int maxDoubles) {
        int count = 0;
        while (target > 1) {
            if (maxDoubles > 0 && target % 2 == 0) {
                maxDoubles--;
                target = target / 2;
            } else {
                if (maxDoubles == 0) {
                    count = count + target - 1;
                    return count;
                } else {
                    target = target - 1;
                }
            }
            count++;
        }
        return count;
    }
}
