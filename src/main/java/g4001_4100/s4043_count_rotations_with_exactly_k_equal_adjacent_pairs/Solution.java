package g4001_4100.s4043_count_rotations_with_exactly_k_equal_adjacent_pairs;

// #Easy #String #Sliding_Window #Enumeration #Mid_Level #Weekly_Contest_518
// #2026_11_25_Time_2_ms_(81.84%)_Space_43.68_MB_(66.83%)

public class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int same = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == s.charAt((i + 1) % n)) {
                same++;
            }
        }
        if (k == same - 1) {
            return same;
        } else {
            return k == same ? n - same : 0;
        }
    }
}
