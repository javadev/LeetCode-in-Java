package g2501_2600.s2559_count_vowel_strings_in_ranges;

// #Medium #Array #String #Prefix_Sum #2023_08_19_Time_4_ms_(99.59%)_Space_85.6_MB_(78.46%)

public class Solution {
    private boolean validWord(String s) {
        char cStart = s.charAt(0);
        char cEnd = s.charAt(s.length() - 1);
        boolean flag1 =
                cStart == 'a' || cStart == 'e' || cStart == 'i' || cStart == 'o' || cStart == 'u';
        boolean flag2 = cEnd == 'a' || cEnd == 'e' || cEnd == 'i' || cEnd == 'o' || cEnd == 'u';
        return flag1 && flag2;
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] prefixArr = new int[words.length];
        prefixArr[0] = validWord(words[0]) ? 1 : 0;
        for (int i = 1; i < words.length; ++i) {
            if (validWord(words[i])) {
                prefixArr[i] = prefixArr[i - 1] + 1;
            } else {
                prefixArr[i] = prefixArr[i - 1];
            }
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; ++i) {
            int upperBound = queries[i][1];
            int lowerBound = queries[i][0];
            int val =
                    (lowerBound == 0)
                            ? prefixArr[upperBound]
                            : prefixArr[upperBound] - prefixArr[lowerBound - 1];
            res[i] = val;
        }
        return res;
    }
}
