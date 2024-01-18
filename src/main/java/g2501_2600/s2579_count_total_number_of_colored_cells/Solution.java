package g2501_2600.s2579_count_total_number_of_colored_cells;

// #Medium #Math #2023_08_22_Time_0_ms_(100.00%)_Space_39.2_MB_(60.33%)

public class Solution {
    public long coloredCells(int n) {
        return (long) Math.pow(n, 2) + (long) Math.pow(n - (double) 1, 2);
    }
}
