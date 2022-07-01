package g2201_2300.s2223_sum_of_scores_of_built_strings;

// #Hard #String #Binary_Search #Hash_Function #String_Matching #Rolling_Hash #Suffix_Array
// #2022_06_12_Time_21_ms_(63.91%)_Space_54.3_MB_(42.86%)

public class Solution {
    public long sumScores(String s) {
        int n = s.length();
        char[] ss = s.toCharArray();
        int[] z = new int[n];
        int l = 0;
        int r = 0;
        for (int i = 1; i < n; i++) {
            if (i <= r) {
                z[i] = Math.min(z[i - l], r - i + 1);
            }
            while (i + z[i] < n && ss[z[i]] == ss[i + z[i]]) {
                z[i]++;
            }
            if (i + z[i] - 1 > r) {
                l = i;
                r = i + z[i] - 1;
            }
        }
        long sum = n;
        for (int i = 0; i < n; i++) {
            sum += z[i];
        }
        return sum;
    }
}
