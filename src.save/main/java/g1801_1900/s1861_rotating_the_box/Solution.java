package g1801_1900.s1861_rotating_the_box;

// #Medium #Array #Matrix #Two_Pointers #2022_05_09_Time_8_ms_(92.84%)_Space_145.6_MB_(5.03%)

public class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int n = box.length;
        int m = box[0].length;
        char[][] result = new char[m][n];
        for (int i = 0; i < n; i++) {
            int j = m - 1;
            int idx = m - 1;
            while (j >= 0) {
                if (box[i][j] == '#') {
                    result[j--][n - i - 1] = '.';
                    result[idx--][n - i - 1] = '#';
                } else {
                    char c = box[i][j];
                    result[j--][n - i - 1] = c;
                    if (c == '*') {
                        idx = j;
                    }
                }
            }
        }
        return result;
    }
}
