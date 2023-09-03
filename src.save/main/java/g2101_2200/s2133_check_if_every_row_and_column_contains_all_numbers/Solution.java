package g2101_2200.s2133_check_if_every_row_and_column_contains_all_numbers;

// #Easy #Array #Hash_Table #Matrix #2022_06_04_Time_32_ms_(64.12%)_Space_83_MB_(46.34%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        Set<Integer> set = new HashSet<>();
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                set.add(anInt);
            }
            if (set.size() != n) {
                return false;
            }
            set.clear();
        }
        for (int i = 0; i < matrix[0].length; i++) {
            for (int[] ints : matrix) {
                set.add(ints[i]);
            }
            if (set.size() != n) {
                return false;
            }
            set.clear();
        }
        return true;
    }
}
