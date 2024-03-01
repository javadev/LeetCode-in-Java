package g1301_1400.s1374_generate_a_string_with_characters_that_have_odd_counts;

// #Easy #String #2022_03_22_Time_1_ms_(90.52%)_Space_39.4_MB_(87.85%)

public class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n > 1 && n % 2 == 0) {
            while (n-- > 1) {
                sb.append("a");
            }
        } else if (n > 1) {
            while (n-- > 2) {
                sb.append("a");
            }
            sb.append("b");
        }
        sb.append("z");
        return sb.toString();
    }
}
