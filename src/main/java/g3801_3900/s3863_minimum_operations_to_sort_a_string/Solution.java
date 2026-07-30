package g3801_3900.s3863_minimum_operations_to_sort_a_string;

// #Medium #String #Staff #Weekly_Contest_492
// #2026_07_27_Time_15_ms_(74.44%)_Space_47.98_MB_(56.67%)

public class Solution {
    public int minOperations(String s) {
        int n = s.length();
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return s.charAt(0) > s.charAt(1) ? -1 : 0;
        }
        char min = 'z';
        char max = 'a';
        char first = s.charAt(0);
        char last = s.charAt(n - 1);
        char prev = 'a';
        int[] cnt = new int[26];
        boolean sorted = true;
        for (char c : s.toCharArray()) {
            sorted &= prev <= c;
            min = (char) Math.min(min, c);
            max = (char) Math.max(max, c);
            prev = c;
            cnt[c - 'a']++;
        }
        if (sorted) {
            return 0;
        }
        return calculateOperations(first, last, min, max, cnt);
    }

    private int calculateOperations(char first, char last, char min, char max, int[] cnt) {
        if (first == min || last == max) {
            return 1;
        }
        if (first != max || last != min) {
            return 2;
        }
        return cnt[max - 'a'] > 1 || cnt[min - 'a'] > 1 ? 2 : 3;
    }
}
