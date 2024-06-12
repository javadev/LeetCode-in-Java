package g3101_3200.s3178_find_the_child_who_has_the_ball_after_k_seconds;

// #Easy #Math #Simulation #2024_06_12_Time_0_ms_(100.00%)_Space_40.4_MB_(93.82%)

public class Solution {
    public int numberOfChild(int n, int k) {
        int bigN = 2 * n - 2;
        int x = k % bigN;
        return (x < n) ? x : bigN - x;
    }
}
