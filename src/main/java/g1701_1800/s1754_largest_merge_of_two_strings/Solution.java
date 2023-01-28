package g1701_1800.s1754_largest_merge_of_two_strings;

// #Medium #String #Greedy #Two_Pointers #2022_04_30_Time_37_ms_(89.23%)_Space_53.8_MB_(53.08%)

public class Solution {
    public String largestMerge(String word1, String word2) {
        char[] a = word1.toCharArray();
        char[] b = word2.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                boolean first = go(a, i, b, j);
                if (first) {
                    sb.append(a[i]);
                    i++;
                } else {
                    sb.append(b[j]);
                    j++;
                }
            } else {
                if (a[i] > b[j]) {
                    sb.append(a[i]);
                    i++;
                } else {
                    sb.append(b[j]);
                    j++;
                }
            }
        }

        while (i < a.length) {
            sb.append(a[i++]);
        }
        while (j < b.length) {
            sb.append(b[j++]);
        }

        return sb.toString();
    }

    private boolean go(char[] a, int i, char[] b, int j) {
        while (i < a.length && j < b.length && a[i] == b[j]) {
            i++;
            j++;
        }
        if (i == a.length) {
            return false;
        }
        if (j == b.length) {
            return true;
        }
        return a[i] > b[j];
    }
}
