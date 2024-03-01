package g1201_1300.s1253_reconstruct_a_2_row_binary_matrix;

// #Medium #Array #Greedy #Matrix #2022_03_12_Time_18_ms_(57.27%)_Space_111.1_MB_(42.74%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<List<Integer>> res = new ArrayList<>();
        int n = colsum.length;
        int[] upperRow = new int[n];
        int[] lowerRow = new int[n];
        int currentUpperSum = 0;
        int currentLowerSum = 0;
        for (int i = 0; i < n; i++) {
            if (colsum[i] >= 1) {
                upperRow[i] = 1;
                lowerRow[i] = 1;
                currentUpperSum++;
                currentLowerSum++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (colsum[i] == 1 && currentUpperSum > upper) {
                currentUpperSum--;
                upperRow[i] = 0;
            }
        }
        for (int i = 0; i < upperRow.length; i++) {
            if (colsum[i] == 1 && upperRow[i] == 1) {
                currentLowerSum--;
                lowerRow[i] = 0;
            }
        }
        if (currentUpperSum != upper || currentLowerSum != lower) {
            return res;
        }
        res.add(new ArrayList<>());
        res.add(new ArrayList<>());
        for (int i = 0; i < n; i++) {
            res.get(0).add(upperRow[i]);
            res.get(1).add(lowerRow[i]);
        }
        return res;
    }
}
