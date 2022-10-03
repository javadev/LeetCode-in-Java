package g0901_1000.s0957_prison_cells_after_n_days;

// #Medium #Array #Hash_Table #Math #Bit_Manipulation
// #2022_02_18_Time_1_ms_(97.82%)_Space_42.1_MB_(31.56%)

import java.util.Arrays;

public class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        if (n == 0) {
            return cells;
        }
        int[] first = null;
        int[] prev = cells;
        int period;
        int day = 0;
        while (n > 0) {
            day++;
            n--;
            int[] next = getNextDay(prev);
            if (Arrays.equals(next, first)) {
                period = day - 1;
                n %= period;
            }
            if (day == 1) {
                first = next;
            }
            prev = next;
        }
        return prev;
    }

    private int[] getNextDay(int[] arr) {
        int[] ret = new int[8];
        for (int i = 1; i < 7; ++i) {
            if (arr[i - 1] == arr[i + 1]) {
                ret[i] = 1;
            }
        }
        return ret;
    }
}
