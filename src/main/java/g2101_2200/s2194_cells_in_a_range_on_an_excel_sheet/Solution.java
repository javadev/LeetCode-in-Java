package g2101_2200.s2194_cells_in_a_range_on_an_excel_sheet;

// #Easy #String #2022_06_06_Time_1_ms_(99.92%)_Space_42.6_MB_(99.23%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> cellsInRange(String str) {
        char[] c = str.toCharArray();
        List<String> strings = new ArrayList<>();
        for (char i = c[0]; i <= c[3]; i++) {
            for (char j = c[1]; j <= c[4]; j++) {
                strings.add(new String(new char[] {i, j}));
            }
        }
        return strings;
    }
}
