package g1401_1500.s1447_simplified_fractions;

// #Medium #String #Math #Number_Theory #2022_03_28_Time_33_ms_(69.60%)_Space_67.7_MB_(81.94%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S2234")
public class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> result = new ArrayList<>();
        if (n == 1) {
            return result;
        }
        StringBuilder str = new StringBuilder();
        for (int denom = 2; denom <= n; denom++) {
            for (int num = 1; num < denom; num++) {
                if (checkGCD(num, denom) == 1) {
                    result.add(str.append(num).append("/").append(denom).toString());
                }
                str.setLength(0);
            }
        }
        return result;
    }

    private int checkGCD(int a, int b) {
        if (a < b) {
            return checkGCD(b, a);
        }
        if (a == b || a % b == 0 || b == 1) {
            return b;
        }
        return checkGCD(a % b, b);
    }
}
