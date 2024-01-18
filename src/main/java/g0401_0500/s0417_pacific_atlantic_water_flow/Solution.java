package g0401_0500.s0417_pacific_atlantic_water_flow;

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Matrix
// #Graph_Theory_I_Day_4_Matrix_Related_Problems #Level_2_Day_10_Graph/BFS/DFS #Udemy_Graph
// #2022_07_16_Time_5_ms_(92.62%)_Space_54.8_MB_(59.96%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private int col = 0;
    private int row = 0;

    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> res = new ArrayList<>();
        if (matrix.length == 0) {
            return res;
        }
        col = matrix.length;
        row = matrix[0].length;
        boolean[][] pacific = new boolean[col][row];
        boolean[][] atlantic = new boolean[col][row];
        for (int i = 0; i < col; i++) {
            dfs(i, 0, matrix, pacific);
            dfs(i, row - 1, matrix, atlantic);
        }
        for (int i = 0; i < row; i++) {
            dfs(0, i, matrix, pacific);
            dfs(col - 1, i, matrix, atlantic);
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    res.add(temp);
                }
            }
        }
        return res;
    }

    private void dfs(int i, int j, int[][] matrix, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length || visited[i][j]) {
            return;
        }
        visited[i][j] = true;
        if (i < col - 1 && matrix[i][j] <= matrix[i + 1][j]) {
            dfs(i + 1, j, matrix, visited);
        }
        if (i > 0 && matrix[i][j] <= matrix[i - 1][j]) {
            dfs(i - 1, j, matrix, visited);
        }
        if (j < row - 1 && matrix[i][j] <= matrix[i][j + 1]) {
            dfs(i, j + 1, matrix, visited);
        }
        if (j > 0 && matrix[i][j] <= matrix[i][j - 1]) {
            dfs(i, j - 1, matrix, visited);
        }
    }
}
