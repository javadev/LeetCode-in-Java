package g1001_1100.s1071_greatest_common_divisor_of_strings;

// #Easy #String #Math #2022_02_27_Time_1_ms_(82.09%)_Space_42.6_MB_(33.55%)

public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return "";
        }
        if (str1.equals(str2)) {
            return str1;
        }
        int m = str1.length();
        int n = str2.length();
        if (m > n && str1.substring(0, n).equals(str2)) {
            return gcdOfStrings(str1.substring(n), str2);
        }
        if (n > m && str2.substring(0, m).equals(str1)) {
            return gcdOfStrings(str2.substring(m), str1);
        }
        return "";
    }
}
