package g2901_3000.s2998_minimum_number_of_operations_to_make_x_and_y_equal;

// #Medium #Dynamic_Programming #Breadth_First_Search #Memoization
// #2024_01_17_Time_0_ms_(100.00%)_Space_41.2_MB_(92.39%)

public class Solution {
    public int minimumOperationsToMakeEqual(int x, int y) {
        if (x <= y) {
            return y - x;
        }
        int res = x - y;
        res = Math.min(res, 1 + minimumOperationsToMakeEqual(x / 5, y) + x % 5);
        res = Math.min(res, 1 + minimumOperationsToMakeEqual(x / 5 + 1, y) + 5 - x % 5);
        res = Math.min(res, 1 + minimumOperationsToMakeEqual(x / 11, y) + x % 11);
        res = Math.min(res, 1 + minimumOperationsToMakeEqual(x / 11 + 1, y) + 11 - x % 11);
        return res;
    }
}
