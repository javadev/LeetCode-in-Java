package g2101_2200.s2141_maximum_running_time_of_n_computers;

// #Hard #Array #Sorting #Greedy #Binary_Search
// #2022_06_05_Time_24_ms_(70.39%)_Space_83.1_MB_(5.83%)

public class Solution {
    private boolean isPossibeToRun(int n, int[] batteries, long averageLife) {
        long totalDuration = 0;
            for (long battery : batteries) {
                totalDuration += Math.min(battery, averageLife);
            }
        long requiredDuration = averageLife * n;
        return totalDuration >= requiredDuration;
    }

    public long maxRunTime(int n, int[] batteries) {
        long totalBatteryLife = 0;
        for (long battery : batteries) {
            totalBatteryLife += battery;
        }

        long minimumAverageLife = 0;
        long maximumAverageLife = totalBatteryLife;
        //Introducing explaining variable refactoring technique
        while (minimumAverageLife <= maximumAverageLife) {
            long currentAverageLife = (minimumAverageLife + maximumAverageLife) / 2;
            boolean isPossibleToRun = isPossibeToRun(n, batteries, currentAverageLife);
            if (isPossibleToRun) {
            minimumAverageLife = currentAverageLife + 1;
            } else {
                maximumAverageLife = currentAverageLife - 1;
            }
        }

        return maximumAverageLife;
    }
}
