package g0301_0400.s0319_bulb_switcher;

// #Medium #Math #Brainteaser

public class Solution {
    public int bulbSwitch(int n) {
        if (n < 2) {
            return n;
        }
        return (int) Math.sqrt(n);
    }
}
