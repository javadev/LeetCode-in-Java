package g3601_3700.s3675_minimum_operations_to_transform_string;

// #Medium #Weekly_Contest_466 #2025_09_07_Time_137_ms_(100.00%)_Space_51.85_MB_(100.00%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int minOperations(String s) {
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
        if (set.size() == 1 && set.contains('a')) {
            return 0;
        }
        char minCh = 'z';
        for (char ch : s.toCharArray()) {
            if (ch != 'a' && ch < minCh) {
                minCh = ch;
            }
        }
        return ('z' - minCh) + 1;
    }
}
