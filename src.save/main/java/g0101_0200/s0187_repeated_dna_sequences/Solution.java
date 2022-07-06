package g0101_0200.s0187_repeated_dna_sequences;

// #Medium #String #Hash_Table #Bit_Manipulation #Sliding_Window #Hash_Function #Rolling_Hash
// #Data_Structure_II_Day_9_String #Udemy_Strings
// #2022_06_27_Time_29_ms_(77.11%)_Space_74.1_MB_(6.94%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if (s.length() < 10) {
            return Collections.emptyList();
        }
        boolean[] seen = new boolean[1024 * 1024];
        boolean[] added = new boolean[1024 * 1024];
        char[] chars = s.toCharArray();
        int buf = 0;
        int[] map = new int[128];
        map['A'] = 0;
        map['C'] = 1;
        map['G'] = 2;
        map['T'] = 3;
        List<String> ans = new ArrayList<>(s.length() / 2);
        for (int i = 0; i < 10; i++) {
            buf = (buf << 2) + map[chars[i]];
        }
        seen[buf] = true;
        for (int i = 10; i < chars.length; i++) {
            buf = ((buf << 2) & 0xFFFFF) + map[chars[i]];
            if (seen[buf]) {
                if (!added[buf]) {
                    ans.add(new String(chars, i - 9, 10));
                    added[buf] = true;
                }
            } else {
                seen[buf] = true;
            }
        }
        return ans;
    }
}
