package g3101_3200.s3121_count_the_number_of_special_characters_ii;

// #Medium #String #Hash_Table #2024_04_27_Time_6_ms_(100.00%)_Space_45.2_MB_(97.93%)

import java.util.Arrays;

public class Solution {
    public int numberOfSpecialChars(String word) {
        int[] small = new int[26];
        Arrays.fill(small, -1);
        int[] capital = new int[26];
        Arrays.fill(capital, Integer.MAX_VALUE);
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            if (a < 91) {
                capital[a - 65] = Math.min(capital[a - 65], i);
            } else {
                small[a - 97] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (-1 != small[i] && Integer.MAX_VALUE != capital[i] && capital[i] > small[i]) {
                result++;
            }
        }
        return result;
    }
}
