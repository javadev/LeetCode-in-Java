package g0101_0200.s0118_pascals_triangle;

// #Easy #Top_Interview_Questions #Array #Dynamic_Programming

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S2589")
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> currRow = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i <= 1) {
                    currRow.add(1);
                } else {
                    int currCell = output.get(i - 1).get(j - 1) + output.get(i - 1).get(j);
                    currRow.add(currCell);
                }
            }
            output.add(currRow);
        }
        return output;
    }
}
