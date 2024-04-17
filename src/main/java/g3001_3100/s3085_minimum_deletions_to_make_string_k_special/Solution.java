package g3001_3100.s3085_minimum_deletions_to_make_string_k_special;

// #Medium #String #Hash_Table #Sorting #Greedy #Counting
// #2024_04_17_Time_4_ms_(100.00%)_Space_45.1_MB_(94.33%)

public class Solution {
    public int minimumDeletions(String word, int k) {
        int[] arr = new int[26];
        for (int i = 0; i < word.length(); i++) {
            arr[word.charAt(i) - 'a']++;
        }
        int min = Integer.MAX_VALUE;
        for (int value : arr) {
            if (value != 0) {
                int u = value + k;
                int res = 0;
                for (int i : arr) {
                    if (i < value) {
                        res += i;
                    } else if (i > u) {
                        res += (i - u);
                    }
                }
                min = Math.min(res, min);
            }
        }
        return min;
    }
}
