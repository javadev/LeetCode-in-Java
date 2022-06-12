package g1001_1100.s1001_grid_illumination;

// #Hard #Array #Hash_Table #2022_06_12_Time_82_ms_(96.12%)_Space_59.6_MB_(87.60%)

import java.util.HashMap;

public class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        HashMap<Integer, Integer> row = new HashMap<>();
        HashMap<Integer, Integer> col = new HashMap<>();
        HashMap<Integer, Integer> d1 = new HashMap<>();
        HashMap<Integer, Integer> d2 = new HashMap<>();
        HashMap<Integer, Integer> cellno = new HashMap<>();
        for (int[] lamp : lamps) {
            int row1 = lamp[0];
            int col1 = lamp[1];
            row.put(row1, row.getOrDefault(row1, 0) + 1);
            col.put(col1, col.getOrDefault(col1, 0) + 1);
            d1.put((row1 + col1), d1.getOrDefault((row1 + col1), 0) + 1);
            d2.put((row1 - col1), d2.getOrDefault((row1 - col1), 0) + 1);
            int cell = row1 * n + col1;
            cellno.put(cell, cellno.getOrDefault(cell, 0) + 1);
        }
        int[][] dir = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int row1 = queries[i][0];
            int col1 = queries[i][1];
            int cell = row1 * n + col1;
            ans[i] =
                    (row.containsKey(row1)
                                    || col.containsKey(col1)
                                    || d1.containsKey(row1 + col1)
                                    || d2.containsKey(row1 - col1)
                                    || cellno.containsKey(cell))
                            ? 1
                            : 0;
            if (cellno.containsKey(cell)) {
                int val = cellno.get(cell);
                cellno.remove(cell);
                if (row.containsKey(row1)) {
                    int rowval = row.get(row1);
                    rowval -= val;
                    if (rowval == 0) {
                        row.remove(row1);
                    } else {
                        row.put(row1, rowval);
                    }
                }
                if (col.containsKey(col1)) {
                    int colval = col.get(col1);
                    colval -= val;
                    if (colval == 0) {
                        col.remove(col1);
                    } else {
                        col.put(col1, colval);
                    }
                }
                if (d1.containsKey(row1 + col1)) {
                    int d1val = d1.get(row1 + col1);
                    d1val -= val;
                    if (d1val == 0) {
                        d1.remove(row1 + col1);
                    } else {
                        row.put((row1 + col1), d1val);
                    }
                }
                if (d2.containsKey(row1 - col1)) {
                    int d2val = d2.get(row1 - col1);
                    d2val -= val;
                    if (d2val == 0) {
                        d2.remove(row1 - col1);
                    } else {
                        d2.put((row1 - col1), d2val);
                    }
                }
            }
            for (int[] ints : dir) {
                int rowdash = row1 + ints[0];
                int coldash = col1 + ints[1];
                int cellno1 = rowdash * n + coldash;
                if (cellno.containsKey(cellno1)) {
                    int val = cellno.get(cellno1);
                    cellno.remove(cellno1);
                    if (row.containsKey(rowdash)) {
                        int rowval = row.get(rowdash);
                        rowval -= val;
                        if (rowval == 0) {
                            row.remove(rowdash);
                        } else {
                            row.put(rowdash, rowval);
                        }
                    }
                    if (col.containsKey(coldash)) {
                        int colval = col.get(coldash);
                        colval -= val;
                        if (colval == 0) {
                            col.remove(coldash);
                        } else {
                            col.put(coldash, colval);
                        }
                    }
                    if (d1.containsKey(rowdash + coldash)) {
                        int d1val = d1.get(rowdash + coldash);
                        d1val -= val;
                        if (d1val == 0) {
                            d1.remove(rowdash + coldash);
                        } else {
                            row.put((rowdash + coldash), d1val);
                        }
                    }
                    if (d2.containsKey(rowdash - coldash)) {
                        int d2val = d2.get(rowdash - coldash);
                        d2val -= val;
                        if (d2val == 0) {
                            d2.remove(rowdash - coldash);
                        } else {
                            d2.put((rowdash - coldash), d2val);
                        }
                    }
                }
            }
        }
        return ans;
    }
}
