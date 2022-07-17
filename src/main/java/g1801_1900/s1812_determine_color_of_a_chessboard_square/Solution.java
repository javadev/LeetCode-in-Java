package g1801_1900.s1812_determine_color_of_a_chessboard_square;

// #Easy #String #Math #2022_05_03_Time_1_ms_(49.36%)_Space_41.4_MB_(67.43%)

public class Solution {
    public boolean squareIsWhite(String coordinates) {
        char x = coordinates.charAt(0);
        int y = Integer.parseInt(coordinates.charAt(1) + "");
        switch (x) {
            case 'a':
            case 'c':
            case 'e':
            case 'g':
                return y % 2 == 0;
            default:
                return y % 2 != 0;
        }
    }
}
