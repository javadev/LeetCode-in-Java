package g1101_1200.s1184_distance_between_bus_stops;

// #Easy #Array #2022_03_03_Time_0_ms_(100.00%)_Space_43.9_MB_(5.55%)

public class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {
            int tmp = start;
            start = destination;
            destination = tmp;
        }
        int clockwise = 0;
        for (int i = start; i < destination; i++) {
            clockwise += distance[i];
        }
        int counterClockwise = 0;
        for (int i = destination; i < distance.length; i++) {
            counterClockwise += distance[i];
        }
        for (int i = 0; i < start; i++) {
            counterClockwise += distance[i];
        }

        return Math.min(clockwise, counterClockwise);
    }
}
