package g3301_3400.s3360_stone_removal_game;

// #Easy #2024_11_24_Time_0_ms_(100.00%)_Space_40.5_MB_(100.00%)

public class Solution {
    public boolean canAliceWin(int n) {
        if (n < 10) {
            return false;
        }
        int stonesRemaining = n - 10;
        int stonesToBeRemoved = 9;
        int i = 1;
        while (stonesRemaining >= stonesToBeRemoved) {
            stonesRemaining -= stonesToBeRemoved;
            i++;
            stonesToBeRemoved--;
        }
        return i % 2 != 0;
    }
}
