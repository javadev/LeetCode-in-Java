package g0401_0500.s0464_can_i_win;

// #Medium #Dynamic_Programming #Math #Bit_Manipulation #Bitmask #Memoization #Game_Theory

public class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= maxChoosableInteger) {
            return true;
        } else if (desiredTotal > (maxChoosableInteger * (maxChoosableInteger + 1)) / 2) {
            return false;
        }
        int[] dp = new int[(int) Math.pow(2, maxChoosableInteger) + 1];
        return recursion(maxChoosableInteger, desiredTotal, true, 0, dp);
    }

    private boolean recursion(int m, int d, boolean turn, int visited, int[] dp) {
        if (d <= 0 && !turn) {
            return true;
        } else if (d <= 0) {
            return false;
        } else if (turn) {
            if (dp[visited] == 0) {
                int temp = 1;
                int counter = 1;
                while (counter <= m) {
                    if ((temp & visited) == 0) {
                        boolean check = recursion(m, d - counter, !turn, visited | temp, dp);
                        if (check) {
                            dp[visited] = 1;
                            break;
                        }
                    }
                    temp = temp << 1;
                    counter++;
                }
                if (dp[visited] == 0) {
                    dp[visited] = -1;
                }
            }
            return dp[visited] == 1;
        } else {
            if (dp[visited] == 0) {
                int temp = 1;
                int counter = 1;
                while (counter <= m) {
                    if ((temp & visited) == 0) {
                        boolean check = recursion(m, d - counter, !turn, visited | temp, dp);
                        if (!check) {
                            dp[visited] = 1;
                            break;
                        }
                    }
                    temp = temp << 1;
                    counter++;
                }
                if (dp[visited] == 0) {
                    dp[visited] = -1;
                }
            }
            return dp[visited] != 1;
        }
    }
}
