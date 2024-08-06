package g3201_3300.s3242_design_neighbor_sum_service;

// #Easy #Array #Hash_Table #Matrix #Design #Simulation
// #2024_08_06_Time_14_ms_(100.00%)_Space_45.6_MB_(26.72%)

public class NeighborSum {
    private final int[][] grid;
    private final int n;
    private final int[] rowIndex;
    private final int[] colIndex;

    public NeighborSum(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
        this.rowIndex = new int[n * n];
        this.colIndex = new int[n * n];
        // Precompute the positions of each value in the grid for quick access
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowIndex[grid[i][j]] = i;
                colIndex[grid[i][j]] = j;
            }
        }
    }

    public int adjacentSum(int value) {
        int sum = 0;
        int i = rowIndex[value];
        int j = colIndex[value];
        // Check up
        if (i > 0) {
            sum += grid[i - 1][j];
        }
        // Check down
        if (i < n - 1) {
            sum += grid[i + 1][j];
        }
        // Check left
        if (j > 0) {
            sum += grid[i][j - 1];
        }
        // Check right
        if (j < n - 1) {
            sum += grid[i][j + 1];
        }
        return sum;
    }

    public int diagonalSum(int value) {
        int sum = 0;
        int i = rowIndex[value];
        int j = colIndex[value];
        // Check top-left
        if (i > 0 && j > 0) {
            sum += grid[i - 1][j - 1];
        }
        // Check top-right
        if (i > 0 && j < n - 1) {
            sum += grid[i - 1][j + 1];
        }
        // Check bottom-left
        if (i < n - 1 && j > 0) {
            sum += grid[i + 1][j - 1];
        }
        // Check bottom-right
        if (i < n - 1 && j < n - 1) {
            sum += grid[i + 1][j + 1];
        }
        return sum;
    }
}

/*
 * Your neighborSum object will be instantiated and called as such:
 * neighborSum obj = new neighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */
