package g0401_0500.s0407_trapping_rain_water_ii;

// #Hard #Array #Breadth_First_Search #Matrix #Heap_Priority_Queue

import java.util.PriorityQueue;

public class Solution {
    private static class Cell implements Comparable<Cell> {
        private int row;
        private int col;
        private int value;

        public Cell(int r, int c, int v) {
            this.row = r;
            this.col = c;
            this.value = v;
        }

        @Override
        public int compareTo(Cell other) {
            return value - other.value;
        }
    }

    private int water;
    private boolean[][] visited1;

    public int trapRainWater(int[][] heightMap) {
        if (heightMap.length == 0) {
            return 0;
        }
        PriorityQueue<Cell> walls = new PriorityQueue<Cell>();
        water = 0;
        visited1 = new boolean[heightMap.length][heightMap[0].length];
        int rows = heightMap.length, cols = heightMap[0].length;
        // build wall
        for (int c = 0; c < cols; c++) {
            walls.add(new Cell(0, c, heightMap[0][c]));
            walls.add(new Cell(rows - 1, c, heightMap[rows - 1][c]));
            visited1[0][c] = true;
            visited1[rows - 1][c] = true;
        }
        for (int r = 1; r < rows - 1; r++) {
            walls.add(new Cell(r, 0, heightMap[r][0]));
            walls.add(new Cell(r, cols - 1, heightMap[r][cols - 1]));
            visited1[r][0] = true;
            visited1[r][cols - 1] = true;
        }
        // end build wall
        while (walls.size() > 0) {
            Cell min = walls.poll();
            visit(heightMap, min, walls);
        }
        return water;
    }

    private void visit(int[][] height, Cell start, PriorityQueue<Cell> walls) {
        fill(height, start.row + 1, start.col, walls, start.value);
        fill(height, start.row - 1, start.col, walls, start.value);
        fill(height, start.row, start.col + 1, walls, start.value);
        fill(height, start.row, start.col - 1, walls, start.value);
    }

    private void fill(int[][] height, int row, int col, PriorityQueue<Cell> walls, int min) {
        if (row < 0 || col < 0) {
            return;
        } else if (row >= height.length || col >= height[0].length) {
            return;
        } else if (visited1[row][col]) {
            return;
        } else if (height[row][col] >= min) {
            walls.add(new Cell(row, col, height[row][col]));
            visited1[row][col] = true;
            return;
        } else {
            water += min - height[row][col];
            visited1[row][col] = true;
            fill(height, row + 1, col, walls, min);
            fill(height, row - 1, col, walls, min);
            fill(height, row, col + 1, walls, min);
            fill(height, row, col - 1, walls, min);
        }
    }
}
