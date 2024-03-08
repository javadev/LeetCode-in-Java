package g2201_2300.s2266_count_number_of_texts;

// #Medium #String #Hash_Table #Dynamic_Programming #Math
// #2022_06_15_Time_38_ms_(81.43%)_Space_51.2_MB_(80.48%)

@SuppressWarnings("java:S135")
public class Solution {
    public int countTexts(String pressedKeys) {
        int len = pressedKeys.length();
        long dp0 = 1L;
        long dp1 = 0;
        long dp2 = 0;
        long dp3 = 0;
        long dp4;
        char[] keys = pressedKeys.toCharArray();
        int base = 1000000007;
        for (int i = 1; i < len; i++) {
            int r = keys[i] - '0';
            dp4 = dp3;
            dp3 = dp2;
            dp2 = dp1;
            dp1 = dp0 % base;
            dp0 = dp1;
            dp0 += (i - 1 == 0 && keys[i] == keys[i - 1]) ? 1 : 0;
            if (i - 1 <= 0 || keys[i] != keys[i - 1]) {
                continue;
            }
            dp0 += dp2;
            dp0 += (i - 2 == 0 && keys[i] == keys[i - 2]) ? 1 : 0;
            if (i - 2 <= 0 || keys[i] != keys[i - 2]) {
                continue;
            }
            dp0 += dp3;
            dp0 += (i - 3 == 0 && keys[i] == keys[i - 3] && (r == 7 || r == 9)) ? 1 : 0;
            if (i - 3 <= 0 || keys[i] != keys[i - 3] || (r != 7 && r != 9)) {
                continue;
            }
            dp0 += dp4;
        }

        return (int) (dp0 % base);
    }
}
