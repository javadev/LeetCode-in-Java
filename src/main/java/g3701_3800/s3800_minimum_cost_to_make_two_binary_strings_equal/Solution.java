package g3701_3800.s3800_minimum_cost_to_make_two_binary_strings_equal;

// #Medium #String #Greedy #Staff #Weekly_Contest_483
// #2026_05_22_Time_8_ms_(85.71%)_Space_47.61_MB_(85.71%)

public class Solution {
    public long minimumCost(String s, String t, int flipCost, int swapCost, int crossCost) {
        int len = t.length();
        int diff = 0;
        int one = 0;
        int zero = 0;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        for (int i = 0; i < len; i++) {
            if (arr1[i] != arr2[i]) {
                diff++;
                if (arr1[i] == '0') {
                    zero++;
                } else {
                    one++;
                }
            }
        }
        int min = Math.min(one, zero);
        long ans = 0;
        long costOfFlip = ((long) min * flipCost) * 2;
        long costOfSwap = ((long) min * swapCost);
        ans += Math.min(costOfFlip, costOfSwap);
        diff -= (min * 2);
        int oddLeft = diff % 2;
        int evenLeft = diff - oddLeft;
        long costOfCrossSwap =
                (((long) (evenLeft / 2) * crossCost) + ((long) (evenLeft / 2) * swapCost));
        long costOfFlipMain = ((long) evenLeft * flipCost);
        ans += Math.min(costOfCrossSwap, costOfFlipMain);
        ans += (long) oddLeft * flipCost;
        return ans;
    }
}
