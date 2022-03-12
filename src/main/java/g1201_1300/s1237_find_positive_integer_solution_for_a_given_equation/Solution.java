package g1201_1300.s1237_find_positive_integer_solution_for_a_given_equation;

// #Medium #Math #Binary_Search #Two_Pointers #Interactive
// #2022_03_12_Time_2_ms_(79.60%)_Space_41.7_MB_(45.96%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> result = new ArrayList<>();
        int x = 1;
        int y = 1000;
        while (x < 1001 && y > 0) {
            int functionResult = customfunction.f(x, y);
            if (functionResult < z) {
                x++;
            } else if (functionResult > z) {
                y--;
            } else {
                result.add(Arrays.asList(x++, y--));
            }
        }
        return result;
    }
}
