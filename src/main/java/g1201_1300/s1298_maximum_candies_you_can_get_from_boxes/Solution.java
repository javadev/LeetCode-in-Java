package g1201_1300.s1298_maximum_candies_you_can_get_from_boxes;

// #Hard #Array #Breadth_First_Search #2022_03_10_Time_3_ms_(100.00%)_Space_53.8_MB_(91.45%)

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int maxCandies(
            int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int collectedCandies = 0;
        Queue<Integer> boxes = new LinkedList<>();
        for (int box : initialBoxes) {
            boxes.offer(box);
        }
        int unseen = 0;
        while (!boxes.isEmpty()) {
            if (unseen == boxes.size()) {
                break;
            }
            int curBox = boxes.poll();
            if (status[curBox] == 0) {
                unseen++;
                boxes.offer(curBox);
            } else {
                unseen = 0;
                // collect candies
                collectedCandies += candies[curBox];
                // open keys
                for (int key : keys[curBox]) {
                    status[key] = 1;
                }
                // collect contained boxes
                for (int box : containedBoxes[curBox]) {
                    boxes.offer(box);
                }
            }
        }
        return collectedCandies;
    }
}
