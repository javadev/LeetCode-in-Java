package g1101_1200.s1147_longest_chunked_palindrome_decomposition;

// #Hard #String #Dynamic_Programming #Greedy #Two_Pointers #Hash_Function #Rolling_Hash
// #2022_03_05_Time_11_ms_(44.95%)_Space_42.8_MB_(60.55%)

public class Solution {
    public int longestDecomposition(String text) {
        int n = text.length();
        int l = 0;
        int r = n - 1;
        int len = 1;
        int ans = 0;
        String lft;
        String rit;
        boolean perfectSubstring = false;
        while (l + len <= r - len + 1) {
            lft = text.substring(l, l + len);
            rit = text.substring(r - len + 1, r + 1);
            if (lft.equals(rit)) {
                ans += 2;
                if (l + len == r - len + 1) {
                    perfectSubstring = true;
                    break;
                }
                l = l + len;
                r = r - len;
                len = 1;
            } else {
                len++;
            }
        }
        if (!perfectSubstring) {
            ans++;
        }
        return ans;
    }
}
