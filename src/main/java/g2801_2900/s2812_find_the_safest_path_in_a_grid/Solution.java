package g2801_2900.s2812_find_the_safest_path_in_a_grid;

// #Medium #Array #Breadth_First_Search #Binary_Search #Matrix #Union_Find
// #2023_11_20_Time_57_ms_(100.00%)_Space_65.3_MB_(77.00%)

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("java:S6541")
public class Solution {
    private static final int[][] MOVES = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int maximumSafenessFactor(List<List<Integer>> grid) {
        final int yLen = grid.size();
        final int xLen = grid.get(0).size();
        if (grid.get(0).get(0) == 1 || grid.get(yLen - 1).get(xLen - 1) == 1) {
            return 0;
        }
        int[][] secure = new int[yLen][xLen];
        int[] deque = new int[yLen * xLen];
        int[] nDeque = new int[yLen * xLen];
        int[] tmpDeque;
        int[] queue = new int[yLen * xLen];
        int[] root = new int[yLen * xLen];
        int head = -1;
        int tail = -1;
        int qIdx = -1;
        int end = yLen * xLen - 1;
        int curY;
        int curX;
        int nextY;
        int nextX;
        int curID;
        int nextID;
        for (int y = 0; y < yLen; y++) {
            Arrays.fill(secure[y], -1);
            for (int x = 0; x < xLen; x++) {
                if (grid.get(y).get(x) == 1) {
                    secure[y][x] = 0;
                    curID = y * xLen + x;
                    root[curID] = queue[++qIdx] = nDeque[++tail] = curID;
                }
            }
        }
        int start = 0;
        int stop = qIdx;
        for (int t = 1; tail > -1; t++) {
            tmpDeque = deque;
            deque = nDeque;
            nDeque = tmpDeque;
            head = tail;
            tail = -1;
            start = qIdx;
            for (; head >= 0; head--) {
                curY = deque[head] / xLen;
                curX = deque[head] % xLen;
                for (int[] move : MOVES) {
                    nextY = curY + move[0];
                    nextX = curX + move[1];
                    if (nextY >= 0
                            && nextY < yLen
                            && nextX >= 0
                            && nextX < xLen
                            && secure[nextY][nextX] < 0) {
                        secure[nextY][nextX] = t;
                        nextID = nextY * xLen + nextX;
                        root[nextID] = queue[++qIdx] = nDeque[++tail] = nextID;
                    }
                }
            }
        }
        for (qIdx = start; qIdx > stop; qIdx--) {
            curY = queue[qIdx] / xLen;
            curX = queue[qIdx] % xLen;
            curID = curY * xLen + curX;
            for (int[] move : MOVES) {
                nextY = curY + move[0];
                nextX = curX + move[1];
                if (nextY >= 0
                        && nextY < yLen
                        && nextX >= 0
                        && nextX < xLen
                        && secure[nextY][nextX] >= secure[curY][curX]) {
                    nextID = nextY * xLen + nextX;
                    root[find(root, curID)] = find(root, nextID);
                }
            }
            if (find(root, 0) == find(root, end)) {
                return secure[curY][curX];
            }
        }
        return 0;
    }

    private int find(int[] root, int idx) {
        if (idx == root[idx]) {
            return idx;
        }
        root[idx] = find(root, root[idx]);
        return root[idx];
    }
}
