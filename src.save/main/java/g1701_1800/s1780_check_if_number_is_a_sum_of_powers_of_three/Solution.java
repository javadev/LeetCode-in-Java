package g1701_1800.s1780_check_if_number_is_a_sum_of_powers_of_three;

// #Medium #Math #Acceptance_64.9% #2022_04_30_Time_2_ms_(19.71%)_Space_41.1_MB_(41.61%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean checkPowersOfThree(int n) {
        List<Integer> powers = new ArrayList<>();
        int power = 1;
        for (int i = 1; power <= n; i++) {
            powers.add(power);
            power = (int) Math.pow(3, i);
        }
        int i = powers.size() - 1;
        while (n > 0 && i >= 0) {
            if (n - powers.get(i) > 0) {
                n -= powers.get(i--);
            } else if (n - powers.get(i) == 0) {
                return true;
            } else {
                i--;
            }
        }
        return n == 0;
    }
}
