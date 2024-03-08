package g0701_0800.s0735_asteroid_collision;

// #Medium #Array #Stack #Level_2_Day_18_Stack #2022_03_25_Time_2_ms_(99.59%)_Space_43.1_MB_(91.77%)

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new LinkedList<>();
        for (int a : asteroids) {
            if (a > 0) {
                stack.addLast(a);
            } else {
                if (!stack.isEmpty() && stack.peekLast() > 0) {
                    if (stack.peekLast() == Math.abs(a)) {
                        stack.pollLast();
                    } else {
                        while (!stack.isEmpty()
                                && stack.peekLast() > 0
                                && stack.peekLast() < Math.abs(a)) {
                            stack.pollLast();
                        }
                        if (!stack.isEmpty()
                                && stack.peekLast() > 0
                                && stack.peekLast() == Math.abs(a)) {
                            stack.pollLast();
                        } else if (stack.isEmpty() || stack.peekLast() < 0) {
                            stack.addLast(a);
                        }
                    }
                } else {
                    stack.addLast(a);
                }
            }
        }
        int[] ans = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pollLast();
        }
        return ans;
    }
}
