package g3701_3800.s3771_total_score_of_dungeon_runs;

// #Medium #Array #Binary_Search #Prefix_Sum #Staff #Weekly_Contest_479
// #2026_05_07_Time_19_ms_(100.00%)_Space_170.56_MB_(72.37%)

public class Solution {
    public long totalScore(int hp, int[] damage, int[] requirement) {
        int n = damage.length;
        int[] cumulative = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            cumulative[i] = cumulative[i + 1] + damage[i];
        }
        long soln = 0;
        for (int i = n - 1; i >= 0; i--) {
            int adjHP = hp - requirement[i] + cumulative[i + 1];
            if (adjHP >= cumulative[i]) {
                soln += i - binSearch(cumulative, adjHP, i) + 1;
            }
        }
        return soln;
    }

    private int binSearch(int[] arr, int hp, int l) {
        int h = 0;
        while (h < l) {
            int mid = (h + l) >>> 1;
            if (arr[mid] > hp) {
                h = mid + 1;
            } else {
                l = mid;
            }
        }
        return h;
    }
}
