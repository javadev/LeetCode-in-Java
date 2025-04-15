package g3501_3600.s3517_smallest_palindromic_rearrangement_i;

// #Medium #String #Sorting #Counting_Sort #2025_04_14_Time_33_ms_(100.00%)_Space_46.07_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int m = n / 2;
        if (n == 1 || n == 2) {
            return s;
        }
        char[] fArr = s.substring(0, m).toCharArray();
        Arrays.sort(fArr);
        String f = new String(fArr);
        StringBuilder rev = new StringBuilder(f).reverse();
        if (n % 2 == 1) {
            f += s.charAt(m);
        }
        return f + rev;
    }
}
