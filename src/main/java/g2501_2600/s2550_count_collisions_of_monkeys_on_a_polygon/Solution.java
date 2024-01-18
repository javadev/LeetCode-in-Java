package g2501_2600.s2550_count_collisions_of_monkeys_on_a_polygon;

// #Medium #Math #Recursion #2023_08_15_Time_0_ms_(100.00%)_Space_39.3_MB_(62.81%)

public class Solution {
    public int monkeyMove(int n) {
        return (int) ((((modPow2(n - 2) - 1) << 2) + 2) % 1000000007);
    }

    private long modPow2(int n) {
        if (n == 0) {
            return 1;
        }
        long b = modPow2(n >> 1);
        return ((b * b) << (n & 1)) % 1000000007;
    }
}
