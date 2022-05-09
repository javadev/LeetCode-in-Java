package g1801_1900.s1861_rotating_the_box;

// #Medium #Array #Matrix #Two_Pointers #2022_05_08_Time_16_ms_(30.81%)_Space_77.6_MB_(95.11%)

public class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (box[i][j] == '#') {
                    int empty = j + 1;
                    while (empty < n && box[i][empty] == '.') {
                        empty++;
                    }
                    if (empty < n && box[i][empty] == '.') {
                        box[i][empty] = '#';
                        box[i][j] = '.';
                    } else if (empty - 1 < n && box[i][empty - 1] == '.') {
                        box[i][empty - 1] = '#';
                        box[i][j] = '.';
                    }
                }
            }
        }
        char[][] result = new char[n][m];
        int k = m - 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][k] = box[i][j];
            }
            k--;
        }
        return result;
    }
}
