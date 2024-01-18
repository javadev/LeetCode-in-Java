package g1401_1500.s1461_check_if_a_string_contains_all_binary_codes_of_size_k;

// #Medium #String #Hash_Table #Bit_Manipulation #Hash_Function #Rolling_Hash
// #2022_03_29_Time_169_ms_(52.07%)_Space_95.1_MB_(49.18%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasAllCodes(String s, int k) {
        int total = (int) Math.pow(2, k);
        int start = 0;
        int end = start + k;
        Set<String> st = new HashSet<>();
        while (end <= s.length()) {
            String sbStr = s.substring(start, end);
            st.add(sbStr);
            if (st.size() == total) {
                return true;
            }
            start++;
            end++;
        }
        return false;
    }
}
