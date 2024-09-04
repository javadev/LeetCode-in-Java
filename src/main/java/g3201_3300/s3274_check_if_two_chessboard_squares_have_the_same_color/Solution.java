package g3201_3300.s3274_check_if_two_chessboard_squares_have_the_same_color;

// #Easy #String #Math #2024_09_02_Time_0_ms_(100.00%)_Space_41.8_MB_(100.00%)

public class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        int s1 = (c1.charAt(0) - 'a') + (c1.charAt(1) - '0');
        int s2 = (c2.charAt(0) - 'a') + (c2.charAt(1) - '0');
        return s1 % 2 == s2 % 2;
    }
}
