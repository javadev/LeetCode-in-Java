package g3301_3400.s3330_find_the_original_typed_string_i;

// #Easy #String #2024_10_29_Time_1_ms_(96.13%)_Space_42_MB_(72.46%)

public class Solution {
    public int possibleStringCount(String word) {
        int n = word.length();
        int count = 1;
        char pre = word.charAt(0);
        int temp = 0;
        for (int i = 1; i < n; i++) {
            char ch = word.charAt(i);
            if (ch == pre) {
                temp++;
            } else {
                if (temp >= 1) {
                    count += temp;
                }
                temp = 0;
                pre = ch;
            }
        }
        if (temp >= 1) {
            count += temp;
        }
        return count;
    }
}
