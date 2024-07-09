package g3201_3300.s3211_generate_binary_strings_without_adjacent_zeros;

// #Medium #String #Bit_Manipulation #Recursion #2024_07_09_Time_1_ms_(100.00%)_Space_46_MB_(27.65%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> validStrings(int n) {
        List<String> strings = new ArrayList<>();
        dfs(n, new StringBuilder(), strings);
        return strings;
    }

    private void dfs(int n, StringBuilder build, List<String> strings) {
        if (build.length() == n) {
            strings.add(build.toString());
            return;
        }
        // need to add a one
        if (!build.isEmpty() && build.charAt(build.length() - 1) == '0') {
            build.append('1');
            dfs(n, build, strings);
            // undo for backtracking
            build.setLength(build.length() - 1);
            return;
        }
        // choose to append a one
        build.append('1');
        dfs(n, build, strings);
        build.setLength(build.length() - 1);
        // choose to append a zero
        build.append('0');
        dfs(n, build, strings);
        build.setLength(build.length() - 1);
    }
}
