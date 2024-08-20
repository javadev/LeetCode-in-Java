package g3201_3300.s3261_count_substrings_that_satisfy_k_constraint_ii;

// #Hard #Array #String #Binary_Search #Prefix_Sum #Sliding_Window
// #2024_08_20_Time_8_ms_(100.00%)_Space_104.9_MB_(71.64%)

public class Solution {
    public long[] countKConstraintSubstrings(String s, int k, int[][] queries) {
        char[] current = s.toCharArray();
        int n = current.length;
        long[] prefix = new long[n];
        int[] index = new int[n];
        int i = 0;
        int count = 0;
        int count1 = 0;
        int count0 = 0;
        for (int j = 0; j < n; j++) {
            if (current[j] == '0') {
                count0++;
            }
            if (current[j] == '1') {
                count1++;
            }
            while (count0 > k && count1 > k) {
                if (current[i] == '0') {
                    count0--;
                }
                if (current[i] == '1') {
                    count1--;
                }
                i++;
                index[i] = j - 1;
            }
            count += j - i + 1;
            index[i] = j;
            prefix[j] = count;
        }
        while (i < n) {
            index[i++] = n - 1;
        }
        long[] result = new long[queries.length];
        for (i = 0; i < queries.length; i++) {
            int indexFirst = index[queries[i][0]];
            if (indexFirst > queries[i][1]) {
                long num = queries[i][1] - queries[i][0] + 1L;
                result[i] = ((num) * (num + 1)) / 2;
            } else {
                result[i] = prefix[queries[i][1]] - prefix[indexFirst];
                long num = indexFirst - queries[i][0] + 1L;
                result[i] += ((num) * (num + 1)) / 2;
            }
        }
        return result;
    }
}
