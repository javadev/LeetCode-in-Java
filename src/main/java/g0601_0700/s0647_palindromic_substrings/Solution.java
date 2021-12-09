package g0601_0700.s0647_palindromic_substrings;

// #Medium #Top_100_Liked_Questions #String #Dynamic_Programming

public class Solution {
    private int res = 0;

    private void expand(char a[], int l, int r) {
        while (l >= 0 && r < a.length) {
            if (a[l] != a[r]) {
                return;
            } else {
                res++;
                l--;
                r++;
            }
        }
    }

    public int countSubstrings(String s) {
        char a[] = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            expand(a, i, i);
            expand(a, i, i + 1);
        }
        return res;
    }
}
