package g1901_2000.s1954_minimum_garden_perimeter_to_collect_enough_apples;

// #Medium #Math #Binary_Search #2022_05_18_Time_2_ms_(59.57%)_Space_40.7_MB_(69.15%)

public class Solution {
    public long minimumPerimeter(long neededApples) {
        long l = 1;
        long r = 1000000;
        long res = l;
        while (l <= r) {
            long m = l + (r - l) / 2;
            boolean isPossible = check(m, neededApples);
            if (isPossible) {
                res = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return res * 8;
    }

    private boolean check(long len, long neededApples) {
        long sum = len * (len + 1) / 2;
        long applesPerQuadrant = 2 * len * sum;
        long totalCount = 4 * sum + 4 * applesPerQuadrant;
        return totalCount >= neededApples;
    }
}
