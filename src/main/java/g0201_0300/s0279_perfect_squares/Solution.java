package g0201_0300.s0279_perfect_squares;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Dynamic_Programming #Math
// #Breadth_First_Search #Dynamic_Programming_I_Day_21
// #2022_03_14_Time_0_ms_(100.00%)_Space_39.4_MB_(93.46%)

public class Solution {
    private boolean validSquare(int n) {
        int root = (int) Math.sqrt(n);
        return root * root == n;
    }

    public int numSquares(int n) {
        if (n < 4) {
            return n;
        }
        if (validSquare(n)) {
            return 1;
        }
        while ((n & 3) == 0) {
            n >>= 2;
        }
        if ((n & 7) == 7) {
            return 4;
        }
        int x = (int) Math.sqrt(n);
        for (int i = 1; i <= x; i++) {
            if (validSquare(n - i * i)) {
                return 2;
            }
        }
        return 3;
    }
}
