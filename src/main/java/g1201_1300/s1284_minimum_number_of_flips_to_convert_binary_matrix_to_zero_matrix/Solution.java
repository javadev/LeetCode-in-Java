package g1201_1300.s1284_minimum_number_of_flips_to_convert_binary_matrix_to_zero_matrix;

// #Hard #Array #Breadth_First_Search #Matrix #Bit_Manipulation
// #2022_03_11_Time_2_ms_(89.29%)_Space_40_MB_(77.10%)

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Solution {
    private Set<Integer> visited;

    private boolean isValid(int x, int y, int r, int c) {
        return x >= 0 && y >= 0 && x < r && y < c;
    }

    private List<Integer> next(Integer n, int r, int c) {
        List<Integer> ans = new ArrayList<>();
        int[] dx = {0, 0, 0, 1, -1};
        int[] dy = {0, 1, -1, 0, 0};
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Integer newMask = n;
                for (int k = 0; k < dx.length; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (isValid(nx, ny, r, c)) {
                        newMask = newMask ^ (1 << (nx * 3 + ny));
                    }
                }
                if (visited.add(newMask)) {
                    ans.add(newMask);
                }
            }
        }
        return ans;
    }

    public int minFlips(int[][] mat) {
        int mask = 0;
        int r = mat.length;
        int c = mat[0].length;
        if (r == 1 && c == 1) {
            return mat[0][0] == 0 ? 0 : 1;
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mask |= (mat[i][j] << (i * 3 + j));
            }
        }
        if (mask == 0) {
            return 0;
        }
        visited = new HashSet<>();
        Queue<Integer> q = new ArrayDeque<>();
        int count = 1;
        q.add(mask);
        visited.add(mask);
        while (!q.isEmpty()) {
            int qSize = q.size();
            for (int i = 0; i < qSize; i++) {
                Integer currMask = q.poll();
                List<Integer> nextStates = next(currMask, r, c);
                for (Integer nextState : nextStates) {
                    if (nextState == 0) {
                        return count;
                    }
                    q.add(nextState);
                }
            }
            count++;
        }
        return -1;
    }
}
