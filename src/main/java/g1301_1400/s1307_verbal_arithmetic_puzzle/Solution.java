package g1301_1400.s1307_verbal_arithmetic_puzzle;

// #Hard #Array #String #Math #Backtracking #2022_03_15_Time_6_ms_(95.74%)_Space_41.5_MB_(46.81%)

import java.util.Arrays;

public class Solution {
    private int[] map;
    private char[][] grid;
    private boolean solved;
    private boolean[] usedDigit;
    private boolean[] mustNotBeZero;
    private int cols;
    private int resultRow;

    public boolean isSolvable(String[] words, String result) {
        this.solved = false;
        int rows = words.length + 1;
        this.cols = result.length();
        this.grid = new char[rows][cols];
        this.mustNotBeZero = new boolean[26];
        this.usedDigit = new boolean[10];
        this.resultRow = rows - 1;
        this.map = new int[26];
        Arrays.fill(map, -1);
        int maxLength = 0;
        for (int i = 0; i < words.length; i++) {
            int j = words[i].length();
            if (j > maxLength) {
                maxLength = j;
            }
            if (j > 1) {
                mustNotBeZero[words[i].charAt(0) - 'A'] = true;
            }
            if (j > cols) {
                return false;
            }
            for (char c : words[i].toCharArray()) {
                grid[i][--j] = c;
            }
        }
        if (maxLength + 1 < cols) {
            return false;
        }
        int j = cols;
        if (j > 1) {
            mustNotBeZero[result.charAt(0) - 'A'] = true;
        }
        for (char c : result.toCharArray()) {
            grid[resultRow][--j] = c;
        }
        backtrack(0, 0, 0);
        return solved;
    }

    private boolean canPlace(int ci, int d) {
        return (!usedDigit[d] && map[ci] == -1) || (map[ci] == d);
    }

    private void placeNum(int ci, int d) {
        usedDigit[d] = true;
        map[ci] = d;
    }

    private void removeNum(int ci, int d) {
        usedDigit[d] = false;
        map[ci] = -1;
    }

    private void placeNextNum(int r, int c, int sum) {
        if (r == resultRow && c == cols - 1) {
            solved = sum == 0;
        } else {
            if (r == resultRow) {
                backtrack(0, c + 1, sum);
            } else {
                backtrack(r + 1, c, sum);
            }
        }
    }

    private void backtrack(int r, int c, int sum) {
        char unused = '\u0000';
        if (grid[r][c] == unused) {
            placeNextNum(r, c, sum);
        } else {
            int ci = grid[r][c] - 'A';
            if (r == resultRow) {
                int d = sum % 10;
                if (map[ci] == -1) {
                    if (canPlace(ci, d)) {
                        placeNum(ci, d);
                        placeNextNum(r, c, sum / 10);
                        if (solved) {
                            return;
                        }
                        removeNum(ci, d);
                    }
                } else {
                    if (map[ci] == d) {
                        placeNextNum(r, c, sum / 10);
                    }
                }
            } else {
                if (map[ci] == -1) {
                    for (int d = mustNotBeZero[ci] ? 1 : 0; d < 10; d++) {
                        if (canPlace(ci, d)) {
                            placeNum(ci, d);
                            placeNextNum(r, c, sum + d);
                            if (solved) {
                                return;
                            }
                            removeNum(ci, d);
                        }
                    }
                } else {
                    placeNextNum(r, c, sum + map[ci]);
                }
            }
        }
    }
}
