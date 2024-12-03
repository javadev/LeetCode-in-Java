package g3301_3400.s3360_stone_removal_game;

// #Easy #Math #Simulation #2024_12_03_Time_0_ms_(100.00%)_Space_40.3_MB_(80.86%)

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
