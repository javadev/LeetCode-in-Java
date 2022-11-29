package g1501_1600.s1550_three_consecutive_odds;

// #Easy #Array #2022_04_11_Time_0_ms_(100.00%)_Space_43.3_MB_(21.06%)

public class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 == 1 && arr[i + 1] % 2 == 1 && arr[i + 2] % 2 == 1) {
                return true;
            }
        }
        return false;
    }
}
