package g2201_2300.s2211_count_collisions_on_a_road;

// #Medium #String #Stack #2022_06_12_Time_113_ms_(45.96%)_Space_54.3_MB_(57.28%)

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int countCollisions(String directions) {
        if (directions == null || directions.length() == 1) {
            return 0;
        }
        Deque<Character> stack = new ArrayDeque<>();
        char[] direction = directions.toCharArray();
        char prevc = '0';
        int collision = 0;
        for (int i = 0; i < direction.length; i++) {
            if (direction[i] == 'R') {
                stack.push(direction[i]);
            } else {
                if ((direction[i] == 'S' && prevc == 'R')) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    collision += 1;
                    direction[i] = 'S';
                    while (!stack.isEmpty()) {
                        collision++;
                        stack.pop();
                    }
                }
                if ((direction[i] == 'L' && prevc == 'R')) {
                    stack.pop();
                    collision += 2;
                    direction[i] = 'S';
                    while (!stack.isEmpty()) {
                        collision++;
                        stack.pop();
                    }
                }
                if (direction[i] == 'L' && prevc == 'S') {
                    collision++;
                    direction[i] = 'S';
                }
            }
            prevc = direction[i];
        }
        return collision;
    }
}
