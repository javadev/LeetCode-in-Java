package g0601_0700.s0696_count_binary_substrings;

// #Easy #String #Two_Pointers #2022_03_22_Time_5_ms_(100.00%)_Space_42.5_MB_(91.17%)

public class Solution {
    public int countBinarySubstrings(String s) {
        int start = 0;
        int ans = 0;
        char[] arr = s.toCharArray();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                ans++;
                start = i - 1;
            } else if (start > 0 && arr[--start] != arr[i]) {
                // if start isn't 0, we may still have a valid substring
                ans++;
            } else {
                // if not, then reset start to 0
                start = 0;
            }
        }
        return ans;
    }
}
