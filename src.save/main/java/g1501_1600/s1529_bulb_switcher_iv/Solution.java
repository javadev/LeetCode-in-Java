package g1501_1600.s1529_bulb_switcher_iv;

// #Medium #String #Greedy #2022_04_09_Time_6_ms_(89.67%)_Space_48.3_MB_(7.02%)

public class Solution {
    public int minFlips(String target) {
        int flipCount = target.charAt(0) - 48;
        char prev = target.charAt(0);
        for (char ch : target.toCharArray()) {
            if (ch != prev) {
                flipCount++;
                prev = ch;
            }
        }
        return flipCount;
    }
}
