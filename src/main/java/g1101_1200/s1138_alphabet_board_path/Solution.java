package g1101_1200.s1138_alphabet_board_path;

// #Medium #String #Hash_Table #2023_06_01_Time_1_ms_(48.92%)_Space_40.5_MB_(86.56%)

public class Solution {
    public String alphabetBoardPath(String target) {
        if (target.length() == 0) {
            return "";
        }
        int sourceRow = 0;
        int sourceCol = 0;
        StringBuilder path = new StringBuilder();
        for (char c : target.toCharArray()) {
            int position = c - 97;
            int targetRow = position / 5;
            int targetCol = position % 5;
            if (targetCol < sourceCol) {
                path.append(helper("L", sourceCol - targetCol));
            }
            if (targetRow < sourceRow) {
                path.append(helper("U", sourceRow - targetRow));
            }
            if (targetRow > sourceRow) {
                path.append(helper("D", targetRow - sourceRow));
            }
            if (targetCol > sourceCol) {
                path.append(helper("R", targetCol - sourceCol));
            }
            path.append("!");
            sourceRow = targetRow;
            sourceCol = targetCol;
        }
        return path.toString();
    }

    public StringBuilder helper(String dir, int time) {
        StringBuilder path = new StringBuilder();
        for (int i = 0; i < time; i++) {
            path.append(dir);
        }
        return path;
    }
}
