package g1301_1400.s1395_count_number_of_teams;

// #Medium #Array #Dynamic_Programming #Binary_Indexed_Tree
// #2022_03_14_Time_18_ms_(91.75%)_Space_44.9_MB_(10.22%)

import java.util.Arrays;

public class Solution {
    public int numTeams(int[] rating) {
        int[] cp = rating.clone();
        Arrays.sort(cp);
        // count i, j such that i<j and rating[i]<rating[j]
        int[][] count = new int[cp.length][2];
        int[] bit = new int[cp.length];
        for (int i = 0; i < rating.length; i++) {
            count[i][0] = count(bs(cp, rating[i] - 1), bit);
            count[i][1] = i - count[i][0];
            add(bs(cp, rating[i]), bit);
        }
        // reverse count from right to left, that i<j and rating[i]>rating[j]
        int[][] reverseCount = new int[cp.length][2];
        int[] reverseBit = new int[cp.length];
        for (int i = cp.length - 1; i >= 0; i--) {
            reverseCount[i][0] = count(bs(cp, rating[i] - 1), reverseBit);
            reverseCount[i][1] = cp.length - 1 - i - reverseCount[i][0];
            add(bs(cp, rating[i]), reverseBit);
        }
        int result = 0;
        for (int i = 0; i < rating.length; i++) {
            result += count[i][0] * reverseCount[i][1] + count[i][1] * reverseCount[i][0];
        }
        return result;
    }

    private int count(int idx, int[] bit) {
        int sum = 0;
        while (idx >= 0) {
            sum += bit[idx];
            idx = (idx & (idx + 1)) - 1;
        }
        return sum;
    }

    private void add(int idx, int[] bit) {
        if (idx < 0) {
            return;
        }
        while (idx < bit.length) {
            bit[idx] += 1;
            idx = (idx | (idx + 1));
        }
    }

    private int bs(int[] arr, int val) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] == val) {
                return m;
            } else if (arr[m] < val) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return arr[l] > val ? l - 1 : l;
    }
}
