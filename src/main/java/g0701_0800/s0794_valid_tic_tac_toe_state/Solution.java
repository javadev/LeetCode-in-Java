package g0701_0800.s0794_valid_tic_tac_toe_state;

// #Medium #Array #String #2022_03_26_Time_0_ms_(100.00%)_Space_42.1_MB_(13.47%)

public class Solution {
    public boolean validTicTacToe(String[] board) {
        int cO = 0;
        int cX = 0;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                char ch = board[x].charAt(y);
                if (ch == 'O') {
                    cO++;
                } else if (ch == 'X') {
                    cX++;
                }
            }
        }
        char a1 = board[0].charAt(0);
        char a2 = board[0].charAt(1);
        char a3 = board[0].charAt(2);
        char a4 = board[1].charAt(0);
        char a5 = board[1].charAt(1);
        char a6 = board[1].charAt(2);
        char a7 = board[2].charAt(0);
        char a8 = board[2].charAt(1);
        char a9 = board[2].charAt(2);
        // The main thing here is we just need to check if the given sequence is possible or not.
        // We dont need to find any winner. *Logic is the one who has last chance can be in 1 row,
        // column(horizontally,vertically or diagonally) not the other one.
        // So few cases will arise
        // 1) Count of 'X' is 1 more than count of 'O'-> Only X can win and 'O' cannot win (Last
        // Chance is with X so only X can win)
        // 2) Count of 'X' is equal to count of 'O'   -> Only 'O' can win and 'X' cannot win(Check
        // few cases)(Last Chance is with 'O' so only 'O' can win)
        // 3) return false (rest all are invalid case)

        // Eg - if X=4 and O=3 (ie Count of 'O' is 1 less) then 'O' cannot win and
        // if we find such a case then we need to return false else the sequence is fine(try
        // yourself & see)
        if ((cX - 1) == cO) {
            // These are all horizaontal, vertical, diagonal
            return (a1 != a2 || a2 != a3 || a1 != 'O')
                    && (a4 != a5 || a5 != a6 || a4 != 'O')
                    && (a7 != a8 || a8 != a9 || a7 != 'O')
                    && (a1 != a5 || a5 != a9 || a1 != 'O')
                    && (a3 != a5 || a5 != a7 || a3 != 'O')
                    && (a1 != a4 || a4 != a7 || a1 != 'O')
                    && (a2 != a5 || a5 != a8 || a2 != 'O')
                    && (a3 != a6 || a6 != a9 || a3 != 'O');
        } else if (cX == cO) {
            // if X=4 and O=4 (ie both r equal) then 'X' cannot win amd
            // if we find such a case then we need to return false else the sequence is fine(try
            // yourself & see)
            return (a1 != a2 || a2 != a3 || a1 != 'X')
                    && (a4 != a5 || a5 != a6 || a4 != 'X')
                    && (a7 != a8 || a8 != a9 || a7 != 'X')
                    && (a1 != a5 || a5 != a9 || a1 != 'X')
                    && (a3 != a5 || a5 != a7 || a3 != 'X')
                    && (a1 != a4 || a4 != a7 || a1 != 'X')
                    && (a2 != a5 || a5 != a8 || a2 != 'X')
                    && (a3 != a6 || a6 != a9 || a3 != 'X');
        }
        return false;
    }
}
