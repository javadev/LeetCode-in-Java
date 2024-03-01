package g0301_0400.s0319_bulb_switcher;

// #Medium #Math #Brainteaser #2022_07_08_Time_0_ms_(100.00%)_Space_41.1_MB_(27.19%)

public class Solution {
    public int bulbSwitch(int n) {
        if (n < 2) {
            return n;
        }
        return (int) Math.sqrt(n);
    }
}
