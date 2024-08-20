package g3201_3300.s3258_count_substrings_that_satisfy_k_constraint_i;

// #Easy #String #Sliding_Window #2024_08_20_Time_1_ms_(100.00%)_Space_42_MB_(75.09%)

public class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int n = s.length();
        int sum = n;
        int i = 0;
        int j = 0;
        int one = 0;
        int zero = 0;
        char ch;
        while (j < n) {
            ch = s.charAt(j++);
            if (ch == '0') {
                zero++;
            } else {
                one++;
            }
            while (i <= j && one > k && zero > k) {
                ch = s.charAt(i++);
                if (ch == '0') {
                    zero--;
                } else {
                    one--;
                }
            }
            int len = (zero + one - 1);
            sum += len;
        }
        return sum;
    }
}
