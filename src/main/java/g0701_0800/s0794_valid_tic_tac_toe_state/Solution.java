package g0701_0800.s0794_valid_tic_tac_toe_state;

// #Medium #Array #String #2022_03_30_Time_0_ms_(100.00%)_Space_39.6_MB_(91.75%)

public class Solution {
    public boolean validTicTacToe(String[] board) {
        // X=1,O=-1,’ ’=0
        int sum = 0;
        int[] winsCol = new int[3];
        int[] winsDiag = new int[2];
        boolean xWin = false;
        boolean oWin = false;
        for (int i = 0; i < 3; i++) {
            String str = board[i];
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                // char chr=str.toCharArray()[j];
                int intchr = 0;
                if (str.toCharArray()[j] == 'X') {
                    intchr = 1;
                }
                if (str.toCharArray()[j] == 'O') {
                    intchr = -1;
                }
                rowSum += intchr;
                winsCol[j] += intchr;
                if (i == 2 && winsCol[j] == 3) {
                    xWin = true;
                }
                if (i == 2 && winsCol[j] == -3) {
                    oWin = true;
                }
                if (Math.abs(i - j) != 1) {
                    if (i == j && i == 1) {
                        winsDiag[0] += intchr;
                        winsDiag[1] += intchr;
                    } else if (i == j) {
                        winsDiag[0] += intchr;
                    } else {
                        winsDiag[1] += intchr;
                    }
                }
                if (i == 2 && Math.max(winsDiag[0], winsDiag[1]) == 3) {
                    xWin = true;
                }
                if (i == 2 && Math.min(winsDiag[0], winsDiag[1]) == -3) {
                    oWin = true;
                }
            }
            if (rowSum == 3) {
                xWin = true;
            }
            if (rowSum == -3) {
                oWin = true;
            }
            sum += rowSum;
        }
        if (sum == 0 && !xWin) {
            return true;
        }
        return sum == 1 && !oWin;
    }
}
