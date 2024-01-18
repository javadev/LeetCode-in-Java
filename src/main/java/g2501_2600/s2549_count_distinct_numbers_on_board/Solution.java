package g2501_2600.s2549_count_distinct_numbers_on_board;

// #Easy #Array #Hash_Table #Math #Simulation #2023_08_15_Time_0_ms_(100.00%)_Space_39.2_MB_(75.23%)

public class Solution {
    public int distinctIntegers(int n) {
        if (n == 1) {
            return 1;
        }
        return n - 1;
    }
}
