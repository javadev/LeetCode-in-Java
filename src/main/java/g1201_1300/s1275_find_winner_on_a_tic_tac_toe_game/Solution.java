package g1201_1300.s1275_find_winner_on_a_tic_tac_toe_game;

// #Easy #Array #Hash_Table #Matrix #Simulation
// #2022_03_14_Time_0_ms_(100.00%)_Space_41.4_MB_(53.01%)

public class Solution {
    public String tictactoe(int[][] moves) {
        String[][] board = new String[3][3];
        for (int i = 0; i < moves.length; i++) {
            if (i % 2 == 0) {
                board[moves[i][0]][moves[i][1]] = "X";
            } else {
                board[moves[i][0]][moves[i][1]] = "O";
            }
            if (i > 3 && !wins(board).equals("")) {
                return wins(board);
            }
        }
        return moves.length == 9 ? "Draw" : "Pending";
    }

    private String wins(String[][] board) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == null) {
                continue;
            }
            String str = board[i][0];
            if (str.equals(board[i][1]) && str.equals(board[i][2])) {
                return getWinner(str);
            }
        }
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == null) {
                continue;
            }
            String str = board[0][j];
            if (str.equals(board[1][j]) && str.equals(board[2][j])) {
                return getWinner(str);
            }
        }
        if (board[1][1] == null) {
            return "";
        }
        String str = board[1][1];
        if (str.equals(board[0][0]) && str.equals(board[2][2])
                || (str.equals(board[0][2]) && str.equals(board[2][0]))) {
            return getWinner(str);
        }
        return "";
    }

    private String getWinner(String str) {
        if (str.equals("X")) {
            return "A";
        } else {
            return "B";
        }
    }
}
