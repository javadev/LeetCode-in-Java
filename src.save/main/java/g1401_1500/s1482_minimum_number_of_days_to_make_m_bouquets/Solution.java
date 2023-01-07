package g1401_1500.s1482_minimum_number_of_days_to_make_m_bouquets;

// #Medium #Array #Binary_Search #Binary_Search_II_Day_7
// #2022_04_05_Time_25_ms_(69.18%)_Space_82.5_MB_(9.59%)

public class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if (m * k > n) {
            return -1;
        }
        int left = 1;
        int right = 1;
        for (int day : bloomDay) {
            right = Math.max(right, day);
        }
        while (left < right) {
            int guess = (left + right) / 2;
            boolean judgeResult = judge(bloomDay, m, k, guess);
            if (!judgeResult) {
                left = guess + 1;
            } else if (!judge(bloomDay, m, k, guess - 1)) {
                return guess;
            } else {
                right = guess;
            }
        }
        return left;
    }

    private boolean judge(int[] bloomDay, int m, int k, int guess) {
        int bouquets = 0;
        int cnt = 0;
        for (int j : bloomDay) {
            if (j <= guess) {
                cnt++;
                if (cnt == k) {
                    cnt = 0;
                    bouquets++;
                    if (bouquets >= m) {
                        return true;
                    }
                }
            } else {
                cnt = 0;
            }
        }
        return false;
    }
}
