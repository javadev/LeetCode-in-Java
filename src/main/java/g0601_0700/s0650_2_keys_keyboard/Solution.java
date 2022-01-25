package g0601_0700.s0650_2_keys_keyboard;

// #Medium #Dynamic_Programming #Math

public class Solution {
    public int minSteps(int n) {
        int count = 1;
        int cost = 0;
        int addValue = 1;
        while (count < n) {
            cost++;
            count += addValue;
            if (n % count == 0) {
                cost++;
                addValue = count;
            }
        }
        return cost;
    }
}
