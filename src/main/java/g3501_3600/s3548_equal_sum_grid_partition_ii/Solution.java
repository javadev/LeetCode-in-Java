package g3501_3600.s3548_equal_sum_grid_partition_ii;

// #Hard #Array #Hash_Table #Matrix #Prefix_Sum #Enumeration
// #2025_05_13_Time_46_ms_(85.24%)_Space_73.10_MB_(75.65%)

public class Solution {
    private static final int MAX_SIZE = 100001;

    private long calculateSum(int[][] grid, int[] count) {
        long sum = 0;
        for (int[] line : grid) {
            for (int num : line) {
                sum += num;
                count[num]++;
            }
        }
        return sum;
    }

    private boolean checkHorizontalPartition(int[][] grid, long sum, int[] count) {
        int[] half = new int[MAX_SIZE];
        long now = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                now += grid[i][j];
                count[grid[i][j]]--;
                half[grid[i][j]]++;
            }
            if (now * 2 == sum) {
                return true;
            }
            if (now * 2 > sum) {
                long diff = now * 2 - sum;
                if (diff <= MAX_SIZE - 1 && half[(int) diff] > 0) {
                    if (n > 1) {
                        if (i > 0 || grid[0][0] == diff || grid[0][n - 1] == diff) {
                            return true;
                        }
                    } else {
                        if (i > 0 && (grid[0][0] == diff || grid[i][0] == diff)) {
                            return true;
                        }
                    }
                }
            } else {
                long diff = sum - now * 2;
                if (diff <= MAX_SIZE - 1 && count[(int) diff] > 0) {
                    if (n > 1) {
                        if (i < m - 2 || grid[m - 1][0] == diff || grid[m - 1][n - 1] == diff) {
                            return true;
                        }
                    } else {
                        if (i > 0 && (grid[m - 1][0] == diff || grid[i + 1][0] == diff)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean checkVerticalPartition(int[][] grid, long sum) {
        int[] count = new int[MAX_SIZE];
        int[] half = new int[MAX_SIZE];
        for (int[] line : grid) {
            for (int num : line) {
                count[num]++;
            }
        }
        long now = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < n - 1; i++) {
            for (int[] ints : grid) {
                now += ints[i];
                count[ints[i]]--;
                half[ints[i]]++;
            }
            if (now * 2 == sum) {
                return true;
            }
            if (now * 2 > sum) {
                long diff = now * 2 - sum;
                if (diff <= MAX_SIZE - 1 && half[(int) diff] > 0) {
                    if (m > 1) {
                        if (i > 0 || grid[0][0] == diff || grid[m - 1][0] == diff) {
                            return true;
                        }
                    } else {
                        if (i > 0 && (grid[0][0] == diff || grid[0][i] == diff)) {
                            return true;
                        }
                    }
                }
            } else {
                long diff = sum - now * 2;
                if (diff <= MAX_SIZE - 1 && count[(int) diff] > 0) {
                    if (m > 1) {
                        if (i < n - 2 || grid[0][n - 1] == diff || grid[m - 1][n - 1] == diff) {
                            return true;
                        }
                    } else {
                        if (i > 0 && (grid[0][n - 1] == diff || grid[0][i + 1] == diff)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean canPartitionGrid(int[][] grid) {
        int[] count = new int[MAX_SIZE];
        long sum = calculateSum(grid, count);
        return checkHorizontalPartition(grid, sum, count) || checkVerticalPartition(grid, sum);
    }
}
