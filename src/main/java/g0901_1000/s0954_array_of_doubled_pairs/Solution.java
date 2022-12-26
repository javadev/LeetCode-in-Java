package g0901_1000.s0954_array_of_doubled_pairs;

// #Medium #Array #Hash_Table #Sorting #Greedy
// #2022_12_26_Time_13_ms_(98.71%)_Space_50.1_MB_(80.26%)

import java.util.Arrays;

public class Solution {
    public boolean canReorderDoubled(int[] arr) {
        int max = Math.max(0, Arrays.stream(arr).max().getAsInt());
        int min = Math.min(0, Arrays.stream(arr).min().getAsInt());
        int[] positive = new int[max + 1];
        int[] negative = new int[-min + 1];
        for (int a : arr) {
            if (a < 0) {
                negative[-a]++;
            } else {
                positive[a]++;
            }
        }
        if (positive[0] % 2 != 0) {
            return false;
        }
        return validateFrequencies(positive, max) && validateFrequencies(negative, -min);
    }

    private boolean validateFrequencies(int[] frequencies, int limit) {
        for (int i = 0; i <= limit; i++) {
            if (frequencies[i] == 0) {
                continue;
            }
            if (2 * i > limit || frequencies[2 * i] < frequencies[i]) {
                return false;
            }
            frequencies[2 * i] -= frequencies[i];
        }
        return true;
    }
}
