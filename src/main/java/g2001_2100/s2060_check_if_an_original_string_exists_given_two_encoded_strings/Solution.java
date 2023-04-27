package g2001_2100.s2060_check_if_an_original_string_exists_given_two_encoded_strings;

// #Hard #String #Dynamic_Programming #2022_05_29_Time_354_ms_(69.39%)_Space_209.4_MB_(51.21%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private boolean stringMatched = false;
    private String s1;
    private String s2;

    static class Key {
        int i1;
        int i2;

        Key(int i1, int i2) {
            this.i1 = i1;
            this.i2 = i2;
        }
    }

    private Boolean[][][] memo;

    public boolean possiblyEquals(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
        memo = new Boolean[s1.length() + 1][s2.length() + 1][2000];
        dfs(0, 0, 0);
        return stringMatched;
    }

    private void dfs(int i1, int i2, int diff) {
        if (stringMatched) {
            return;
        }
        if (i1 == s1.length() && i2 == s2.length()) {
            if (diff == 0) {
                stringMatched = true;
            }
            return;
        }
        if (i1 == s1.length() && diff <= 0) {
            return;
        }
        if (i2 == s2.length() && diff >= 0) {
            return;
        }
        if (memo[i1][i2][diff + 999] != null) {
            stringMatched = memo[i1][i2][diff + 999];
            return;
        }
        List<int[]> indexNums1 = new ArrayList<>();
        int num1 = 0;
        int x1 = i1;
        while (x1 < s1.length() && Character.isDigit(s1.charAt(x1))) {
            num1 = num1 * 10 + (s1.charAt(x1) - '0');
            indexNums1.add(new int[] {x1, num1});
            x1++;
        }
        List<int[]> indexNums2 = new ArrayList<>();
        int num2 = 0;
        int x2 = i2;
        while (x2 < s2.length() && Character.isDigit(s2.charAt(x2))) {
            num2 = num2 * 10 + (s2.charAt(x2) - '0');
            indexNums2.add(new int[] {x2, num2});
            x2++;
        }
        if (diff == 0) {
            if (extracted(i1, i2, diff, indexNums1, indexNums2)) {
                return;
            }
        } else if (diff > 0) {
            if (Character.isLetter(s2.charAt(i2))) {
                dfs(i1, i2 + 1, diff - 1);
            } else {
                for (int[] num2Item : indexNums2) {
                    dfs(i1, num2Item[0] + 1, diff - num2Item[1]);
                }
            }
        } else {
            if (Character.isLetter(s1.charAt(i1))) {
                dfs(i1 + 1, i2, diff + 1);
            } else {
                for (int[] num1Item : indexNums1) {
                    dfs(num1Item[0] + 1, i2, diff + num1Item[1]);
                }
            }
        }
        memo[i1][i2][diff + 999] = stringMatched;
    }

    private boolean extracted(
            int i1, int i2, int diff, List<int[]> indexNums1, List<int[]> indexNums2) {
        char c1 = s1.charAt(i1);
        char c2 = s2.charAt(i2);
        if (Character.isLetter(c1) && Character.isLetter(c2)) {
            if (c1 != c2) {
                return true;
            }
            dfs(i1 + 1, i2 + 1, diff);
            return true;
        } else {
            if (!indexNums1.isEmpty()) {
                for (int[] num1Item : indexNums1) {
                    dfs(num1Item[0] + 1, i2, diff + num1Item[1]);
                }
            } else {
                for (int[] num2Item : indexNums2) {
                    dfs(i1, num2Item[0] + 1, diff - num2Item[1]);
                }
            }
        }
        return false;
    }
}
