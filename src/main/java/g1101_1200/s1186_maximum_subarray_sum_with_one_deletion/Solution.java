package g1101_1200.s1186_maximum_subarray_sum_with_one_deletion;

// #Medium #Array #Dynamic_Programming #2022_03_03_Time_3_ms_(94.48%)_Space_52.3_MB_(76.90%)

public class Solution {
    public int maximumSum(int[] arr) {
        int maxWithNoDeletions = arr[0];
        int maxWithOneDeletion = arr[0];
        int maxOverall = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int numToProcess = arr[i];
            int nextMaxWithNoDeletions = Math.max(maxWithNoDeletions + numToProcess, numToProcess);
            int nextMaxWithOneDeletion =
                    Math.max(maxWithOneDeletion + numToProcess, maxWithNoDeletions);
            maxOverall =
                    Math.max(maxOverall, Math.max(nextMaxWithNoDeletions, nextMaxWithOneDeletion));
            maxWithNoDeletions = nextMaxWithNoDeletions;
            maxWithOneDeletion = nextMaxWithOneDeletion;
        }
        return maxOverall;
    }
}
