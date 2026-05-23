package g3701_3800.s3799_word_squares_ii;

// #Medium #Array #String #Sorting #Backtracking #Enumeration #Senior #Weekly_Contest_483
// #2026_05_22_Time_5_ms_(99.15%)_Space_56.77_MB_(55.56%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<String>> wordSquares(String[] words) {
        String[] s = words.clone();
        Arrays.sort(s);
        List<List<String>> result = new ArrayList<>();
        int n = s.length;
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                if (a != b && s[a].charAt(0) == s[b].charAt(0)) {
                    for (int c = 0; c < n; c++) {
                        if (c != a && c != b && s[a].charAt(3) == s[c].charAt(0)) {
                            for (int d = 0; d < n; d++) {
                                if (d != a
                                        && d != b
                                        && d != c
                                        && s[d].charAt(0) == s[b].charAt(3)
                                        && s[d].charAt(3) == s[c].charAt(3)) {
                                    result.add(Arrays.asList(s[a], s[b], s[c], s[d]));
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
