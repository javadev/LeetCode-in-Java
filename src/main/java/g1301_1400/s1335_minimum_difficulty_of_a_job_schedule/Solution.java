package g1301_1400.s1335_minimum_difficulty_of_a_job_schedule;

// #Hard #Array #Dynamic_Programming #2022_03_19_Time_11_ms_(79.28%)_Space_41.6_MB_(59.99%)

public class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int totalJobs = jobDifficulty.length;
        if (totalJobs < d) {
            return -1;
        }
        int maxJobsOneDay = totalJobs - d + 1;
        int[] map = new int[totalJobs];
        int maxDiff = Integer.MIN_VALUE;
        for (int k = totalJobs - 1; k > totalJobs - 1 - maxJobsOneDay; k--) {
            maxDiff = Math.max(maxDiff, jobDifficulty[k]);
            map[k] = maxDiff;
        }
        for (int day = d - 1; day > 0; day--) {
            int maxEndIndex = (totalJobs - 1) - (d - day);
            int maxStartIndex = maxEndIndex - maxJobsOneDay + 1;
            for (int startIndex = maxStartIndex; startIndex <= maxEndIndex; startIndex++) {
                map[startIndex] = Integer.MAX_VALUE;
                int maxDiffOfTheDay = Integer.MIN_VALUE;
                for (int endIndex = startIndex; endIndex <= maxEndIndex; endIndex++) {
                    maxDiffOfTheDay = Math.max(maxDiffOfTheDay, jobDifficulty[endIndex]);
                    int totalDiff = maxDiffOfTheDay + map[endIndex + 1];
                    map[startIndex] = Math.min(map[startIndex], totalDiff);
                }
            }
        }
        return map[0];
    }
}
