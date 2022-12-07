package g1901_2000.s1914_cyclically_rotating_a_grid;

// #Medium #Array #Matrix #Simulation #2022_05_14_Time_2_ms_(91.30%)_Space_43_MB_(86.96%)

public class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        rotateInternal(grid, 0, grid[0].length - 1, 0, grid.length - 1, k);
        return grid;
    }

    private void rotateInternal(int[][] grid, int left, int right, int up, int bottom, int k) {
        if (left > right || up > bottom) {
            return;
        }
        int loopLen = (right - left + 1) * 2 + (bottom - up + 1) * 2 - 4;
        int realK = k % loopLen;
        if (realK != 0) {
            rotateLayer(grid, left, right, up, bottom, realK);
        }
        rotateInternal(grid, left + 1, right - 1, up + 1, bottom - 1, k);
    }

    private void rotateLayer(int[][] grid, int left, int right, int up, int bottom, int k) {
        int[] startPoint = new int[] {up, left};
        int loopLen = (right - left + 1) * 2 + (bottom - up + 1) * 2 - 4;
        int[] arr = new int[loopLen];
        int idx = 0;
        int[] currPoint = startPoint;
        int[] startPointAfterRotation = null;

        while (idx < arr.length) {
            arr[idx] = grid[currPoint[0]][currPoint[1]];
            idx++;
            currPoint = getNextPosCC(left, right, up, bottom, currPoint);
            if (idx == k) {
                startPointAfterRotation = currPoint;
            }
        }

        idx = 0;
        currPoint = startPointAfterRotation;
        if (currPoint != null) {
            while (idx < arr.length) {
                grid[currPoint[0]][currPoint[1]] = arr[idx];
                idx++;
                currPoint = getNextPosCC(left, right, up, bottom, currPoint);
            }
        }
    }

    private int[] getNextPosCC(int left, int right, int up, int bottom, int[] curr) {
        int x = curr[0];
        int y = curr[1];
        if (x == up && y > left) {
            return new int[] {x, y - 1};
        } else if (y == left && x < bottom) {
            return new int[] {x + 1, y};
        } else if (x == bottom && y < right) {
            return new int[] {x, y + 1};
        } else {
            return new int[] {x - 1, y};
        }
    }
}
