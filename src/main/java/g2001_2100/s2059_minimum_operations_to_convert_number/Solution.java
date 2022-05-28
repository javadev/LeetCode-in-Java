package g2001_2100.s2059_minimum_operations_to_convert_number;

<<<<<<< HEAD
// #Medium #Array #Breadth_First_Search #2022_05_28_Time_97_ms(64.14%)_Space_116.9_MB(51.03%)
=======
// #Medium #Array #Breadth_First_Search #2022_05_28_Time_97_ms_(64.14%)_Space_116.9_MB_(51.03%)
>>>>>>> 5ff28ef1427714e338539132a38c0a32860317b3

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

<<<<<<< HEAD
class Solution {
=======
public class Solution {
>>>>>>> 5ff28ef1427714e338539132a38c0a32860317b3
    public int minimumOperations(int[] nums, int start, int goal) {
        boolean[] seen = new boolean[1001];
        List<Integer> q = Arrays.asList(goal);
        int cnt = 0;
        while (!q.isEmpty()) {
            ++cnt;
            List<Integer> q1 = new ArrayList<>();
            for (int x : q) {
                for (int n : nums) {
                    for (int xn : new int[] {x + n, x - n, x ^ n}) {
                        if (xn >= 0 && xn <= 1000 && !seen[xn]) {
                            if (xn == start) {
                                return cnt;
                            }
                            seen[xn] = true;
                            q1.add(xn);
                        }
                    }
                }
                q = q1;
            }
        }
        return -1;
    }
}
