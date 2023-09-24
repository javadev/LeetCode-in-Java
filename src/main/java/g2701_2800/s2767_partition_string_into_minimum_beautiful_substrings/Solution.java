package g2701_2800.s2767_partition_string_into_minimum_beautiful_substrings;

// #Medium #String #Hash_Table #Dynamic_Programming #Backtracking
// #2023_09_24_Time_1_ms_(100.00%)_Space_40.8_MB_(89.80%)

public class Solution {
    private boolean ispower(int num) {
        int pow = 1;
        while (pow < num) {
            pow = pow * 5;
        }
        if (pow == num) {
            return true;
        }
        return false;
    }

    private int backtrack(int ind, String s) {
        if (ind >= s.length()) {
            return 0;
        }
        if (s.charAt(ind) == '0') {
            return 999;
        }
        int temp = 999;
        int run_count = 0;
        for (int i = ind; i < s.length(); i++) {
            run_count = run_count * 2;
            if (s.charAt(i) == '1') {
                run_count++;
            }
            if (this.ispower(run_count) == true) {
                temp = Math.min(temp, 1 + this.backtrack(i + 1, s));
            }
        }
        return temp;
    }

    public int minimumBeautifulSubstrings(String s) {
        int res = this.backtrack(0, s);
        if (res < 999) {
            return res;
        }
        return -1;
    }
}
