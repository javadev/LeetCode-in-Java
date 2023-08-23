package g2501_2600.s2594_minimum_time_to_repair_cars;

// #Medium #Array #Binary_Search #2023_08_23_Time_15_ms_(97.28%)_Space_53.8_MB_(85.07%)

public class Solution {
    public long repairCars(int[] ranks, int cars) {
        long low = 0;
        long high = 100000000000000L;
        long pivot;
        while (low <= high) {
            pivot = low + (high - low) / 2;
            if (canRepairAllCars(ranks, cars, pivot)) {
                high = pivot - 1;
            } else {
                low = pivot + 1;
            }
        }
        return low;
    }

    private boolean canRepairAllCars(int[] ranks, int cars, long totalMinutes) {
        int repairedCars = 0;
        for (int i = 0; i < ranks.length && repairedCars < cars; i++) {
            repairedCars += (int) Math.sqrt((double) totalMinutes / ranks[i]);
        }
        return repairedCars >= cars;
    }
}
