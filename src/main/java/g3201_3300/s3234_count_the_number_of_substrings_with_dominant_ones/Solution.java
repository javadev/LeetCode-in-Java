package g3201_3300.s3234_count_the_number_of_substrings_with_dominant_ones;

// #Medium #String #Sliding_Window #Enumeration
// #2024_08_02_Time_163_ms_(93.90%)_Space_45.1_MB_(81.71%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int numberOfSubstrings(String s) {
        List<Integer> zero = new ArrayList<>();
        zero.add(-1);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zero.add(i);
            } else {
                result += i - zero.get(zero.size() - 1);
            }
            for (int j = 1; j < zero.size(); j++) {
                int len = j * (j + 1);
                if (len > i + 1) {
                    break;
                }
                int prev = zero.get(zero.size() - j - 1);
                int from = Math.min(i - len + 1, zero.get(zero.size() - j));
                if (from > prev) {
                    result += from - prev;
                }
            }
        }
        return result;
    }
}
