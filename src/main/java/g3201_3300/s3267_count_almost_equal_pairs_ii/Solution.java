package g3201_3300.s3267_count_almost_equal_pairs_ii;

// #Hard #2024_08_28_Time_353_ms_(99.78%)_Space_45.8_MB_(56.64%)

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int countPairs(int[] nums) {
        int pairs = 0;
        Map<Integer, Integer> counts = new HashMap<>();
        Arrays.sort(nums);
        for (int num : nums) {
            Set<Integer> newNums = new HashSet<>();
            newNums.add(num);
            for (int unit1 = 1, remain1 = num; remain1 > 0; unit1 *= 10, remain1 /= 10) {
                int digit1 = num / unit1 % 10;
                for (int unit2 = unit1 * 10, remain2 = remain1 / 10;
                        remain2 > 0;
                        unit2 *= 10, remain2 /= 10) {
                    int digit2 = num / unit2 % 10;
                    int newNum1 =
                            num - digit1 * unit1 - digit2 * unit2 + digit2 * unit1 + digit1 * unit2;
                    newNums.add(newNum1);
                    for (int unit3 = unit1 * 10, remain3 = remain1 / 10;
                            remain3 > 0;
                            unit3 *= 10, remain3 /= 10) {
                        int digit3 = newNum1 / unit3 % 10;
                        for (int unit4 = unit3 * 10, remain4 = remain3 / 10;
                                remain4 > 0;
                                unit4 *= 10, remain4 /= 10) {
                            int digit4 = newNum1 / unit4 % 10;
                            int newNum2 =
                                    newNum1
                                            - digit3 * unit3
                                            - digit4 * unit4
                                            + digit4 * unit3
                                            + digit3 * unit4;
                            newNums.add(newNum2);
                        }
                    }
                }
            }
            for (int newNum : newNums) {
                pairs += counts.getOrDefault(newNum, 0);
            }
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        return pairs;
    }
}
