package g2501_2600.s2545_sort_the_students_by_their_kth_score;

// #Medium #Array #Sorting #Matrix #2023_05_11_Time_1_ms_(99.50%)_Space_53.2_MB_(6.86%)

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(
                score,
                new Comparator<int[]>() {
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        return o2[k] - o1[k];
                    }
                });
        return score;
    }
}
