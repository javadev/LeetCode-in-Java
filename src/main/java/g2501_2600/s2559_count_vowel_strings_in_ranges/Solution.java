package g2501_2600.s2559_count_vowel_strings_in_ranges;

// #Medium #Array #String #Prefix_Sum #2023_08_19_Time_4_ms_(99.59%)_Space_85.6_MB_(78.46%)

class Solution {
    private boolean validWord(String s) {
        char c_start = s.charAt(0);
        char c_end = s.charAt(s.length() - 1);
        boolean flag1 =
                c_start == 'a'
                        || c_start == 'e'
                        || c_start == 'i'
                        || c_start == 'o'
                        || c_start == 'u';
        boolean flag2 =
                c_end == 'a' || c_end == 'e' || c_end == 'i' || c_end == 'o' || c_end == 'u';
        return flag1 && flag2;
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] prefix_arr = new int[words.length];
        prefix_arr[0] = validWord(words[0]) ? 1 : 0;
        for (int i = 1; i < words.length; ++i) {
            if (validWord(words[i])) {
                prefix_arr[i] = prefix_arr[i - 1] + 1;
            } else {
                prefix_arr[i] = prefix_arr[i - 1];
            }
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; ++i) {
            int upper_bound = queries[i][1];
            int lower_bound = queries[i][0];
            int val =
                    (lower_bound == 0)
                            ? prefix_arr[upper_bound]
                            : prefix_arr[upper_bound] - prefix_arr[lower_bound - 1];
            res[i] = val;
        }
        return res;
    }
}
