package g0801_0900.s0818_race_car;

// #Hard #Dynamic_Programming #2022_03_23_Time_9_ms_(82.90%)_Space_44.2_MB_(70.46%)

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int racecar(int target) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {0, 1, 0});
        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            if (arr[0] == target) {
                return arr[2];
            }
            queue.add(new int[] {arr[0] + arr[1], 2 * arr[1], 1 + arr[2]});
            if ((arr[0] + arr[1]) > target && arr[1] > 0) {
                queue.add(new int[] {arr[0], -1, 1 + arr[2]});
            }
            if ((arr[0]) + arr[1] < target && (arr[1] < 0)) {
                queue.add(new int[] {arr[0], 1, 1 + arr[2]});
            }
        }
        return -1;
    }
}
