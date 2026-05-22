package g3801_3900.s3805_count_caesar_cipher_pairs;

// #Medium #Array #String #Hash_Table #Math #Counting #Senior #Weekly_Contest_484
// #2026_05_22_Time_34_ms_(98.75%)_Space_67.70_MB_(82.50%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long countPairs(String[] words) {
        String[] a = words;
        Map<String, Integer> b = new HashMap<>();
        long c = 0;
        for (String d : a) {
            char[] e = d.toCharArray();
            int f = e[0];
            for (int g = 0; g < e.length; g++) {
                e[g] = (char) ((e[g] - f + 26) % 26);
            }
            String h = new String(e);
            int i = b.getOrDefault(h, 0);
            c += i;
            b.put(h, i + 1);
        }
        return c;
    }
}
