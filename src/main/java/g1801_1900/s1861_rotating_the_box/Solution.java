package g1801_1900.s1861_rotating_the_box;

// #Medium #Array #Matrix #Two_Pointers #2022_05_09_Time_11_ms_(63.70%)_Space_141_MB_(55.18%)

public class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        char[][] result = new char[n][m];
        for (int i = m - 1; i >= 0; i--) {
            int free = -1;
            for (int j = n - 1; j >= 0; j--) {
                if (box[i][j] == '.' && free == -1) {
                    free = j;
                } else if (box[i][j] == '*') {
                    free = -1;
                } else if (box[i][j] == '#' && free != -1) {
                    box[i][j] = '.';
                    box[i][free] = '#';
                    free = free - 1;
                }
            }
            // this part can be further optimized by doing this in above for-loop
            for (int j = 0; j < n; j++) {
                result[j][m - 1 - i] = box[i][j];
            }
        }
        return result;
    }
}
