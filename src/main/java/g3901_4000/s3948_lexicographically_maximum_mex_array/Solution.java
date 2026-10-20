package g3901_4000.s3948_lexicographically_maximum_mex_array;

// #Hard #Array #Hash_Table #Greedy #Queue #Senior_Staff #Weekly_Contest_504
// #2026_10_20_Time_4_ms_(100.00%)_Space_68.51_MB_(66.67%)

public class Solution {
    public int[] maximumMEX(int[] nums) {
        int n = nums.length;
        int[] suffixMex = new int[n];
        boolean[] seen = new boolean[n + 2];
        int currMex = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < n + 2) {
                seen[nums[i]] = true;
            }
            while (seen[currMex]) {
                currMex++;
            }
            suffixMex[i] = currMex;
        }
        int[] result = new int[n];
        int resIdx = 0;
        int[] seenAtStep = new int[n + 2];
        int stepCounter = 0;
        int i = 0;
        while (i < n) {
            int m = suffixMex[i];
            result[resIdx++] = m;
            if (m == 0) {
                i++;
            } else {
                stepCounter++;
                int found = 0;
                int j = i;
                while (j < n) {
                    if (nums[j] < m && seenAtStep[nums[j]] != stepCounter) {
                        seenAtStep[nums[j]] = stepCounter;
                        found++;
                    }
                    if (found == m) {
                        i = j + 1;
                        break;
                    }
                    j++;
                }
            }
        }
        int[] finalResult = new int[resIdx];
        System.arraycopy(result, 0, finalResult, 0, resIdx);
        return finalResult;
    }
}
