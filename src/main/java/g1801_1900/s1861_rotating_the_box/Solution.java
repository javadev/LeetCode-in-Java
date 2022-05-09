package g1801_1900.s1861_rotating_the_box;

// #Medium #Array #Matrix #Two_Pointers #2022_05_09_Time_9_ms_(84.22%)_Space_141.2_MB_(50.05%)

import java.util.Arrays;

public class Solution {
    public char[][] rotateTheBox(char[][] box) {
        char[][] result = new char[box[0].length][box.length];
        for (char[] row : result) {
            Arrays.fill(row, '#');
        }
        for (int i = 0; i < box.length; i++) {
            int col = box.length - 1 - i;
            int stones = 0;
            for (int j = 0; j < box[0].length; j++) {
                if (box[i][j] == '#') {
                    stones++;
                } else if (box[i][j] == '*') {
                    stones = 0;
                    result[j][col] = '*';
                } else {
                    result[j - stones][col] = '.';
                }
            }
        }
        return result;
    }
}
