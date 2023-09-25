package g1801_1900.s1871_jump_game_vii;

// #Medium #String #Two_Pointers #Prefix_Sum #2022_05_11_Time_14_ms_(76.25%)_Space_54.9_MB_(41.39%)

public class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int i;
        int j = 0;
        int n = s.length();
        char[] li = s.toCharArray();
        for (i = 0; i < n; i++) {
            // o == ok
            if (i == 0 || li[i] == 'o') {
                for (j = Math.max(j, i + minJump); j < Math.min(n, i + maxJump + 1); j++) {
                    if (li[j] == '0') {
                        li[j] = 'o';
                    }
                }
            }
            if (j > n) {
                break;
            }
        }
        return li[n - 1] == 'o';
    }
}
