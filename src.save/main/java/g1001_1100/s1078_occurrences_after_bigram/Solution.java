package g1001_1100.s1078_occurrences_after_bigram;

// #Easy #String #2022_02_26_Time_0_ms_(100.00%)_Space_40.4_MB_(48.38%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();
        String[] str = text.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(first) && str.length - 1 >= i + 2 && str[i + 1].equals(second)) {
                list.add(str[i + 2]);
            }
        }
        String[] s = new String[list.size()];
        int j = 0;
        for (String ele : list) {
            s[j++] = ele;
        }
        return s;
    }
}
