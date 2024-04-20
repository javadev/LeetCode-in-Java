package g0501_0600.s0567_permutation_in_string;

// #Medium #Top_100_Liked_Questions #String #Hash_Table #Two_Pointers #Sliding_Window
// #Algorithm_I_Day_6_Sliding_Window #2022_08_10_Time_5_ms_(93.93%)_Space_43.1_MB_(71.37%)

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n > m) {
            return false;
        }
        int[] cntS1 = new int[26];
        int[] cntS2 = new int[26];
        for (int i = 0; i < n; i++) {
            cntS1[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            cntS2[s2.charAt(i) - 'a']++;
        }
        if (check(cntS1, cntS2)) {
            return true;
        }
        for (int i = n; i < m; i++) {
            cntS2[s2.charAt(i - n) - 'a']--;
            cntS2[s2.charAt(i) - 'a']++;
            if (check(cntS1, cntS2)) {
                return true;
            }
        }
        return false;
    }

    private boolean check(int[] cnt1, int[] cnt2) {
        for (int i = 0; i < 26; i++) {
            if (cnt1[i] != cnt2[i]) {
                return false;
            }
        }
        return true;
    }
}
