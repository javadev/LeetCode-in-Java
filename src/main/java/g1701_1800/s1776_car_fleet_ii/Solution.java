package g1701_1800.s1776_car_fleet_ii;

// #Hard #Array #Math #Stack #Heap_Priority_Queue #Monotonic_Stack
// #2022_04_30_Time_19_ms_(93.81%)_Space_100.6_MB_(87.17%)

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public double[] getCollisionTimes(int[][] cars) {
        Deque<Integer> stack = new LinkedList<>();
        int n = cars.length;
        double[] ans = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = -1.0;
            int[] presentCar = cars[i];
            int presentCarSpeed = presentCar[1];
            while (!stack.isEmpty()) {
                int previousCar = stack.peekLast();
                int previousCarSpeed = cars[previousCar][1];
                if (presentCarSpeed > previousCarSpeed
                        && (ans[previousCar] == -1.0
                                || catchTime(cars, i, previousCar) <= ans[previousCar])) {
                    ans[i] = catchTime(cars, i, previousCar);
                    break;
                }
                stack.pollLast();
            }
            stack.offerLast(i);
        }
        return ans;
    }

    private double catchTime(int[][] cars, int presentCar, int previousCar) {
        int dist = cars[previousCar][0] - cars[presentCar][0];
        int speed = cars[presentCar][1] - cars[previousCar][1];
        return 1.0 * dist / speed;
    }
}
