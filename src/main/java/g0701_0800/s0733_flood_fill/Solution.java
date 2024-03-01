package g0701_0800.s0733_flood_fill;

// #Easy #Array #Depth_First_Search #Breadth_First_Search #Matrix
// #Algorithm_I_Day_7_Breadth_First_Search_Depth_First_Search
// #Graph_Theory_I_Day_1_Matrix_Related_Problems #Level_1_Day_9_Graph/BFS/DFS
// #2022_03_25_Time_1_ms_(85.36%)_Space_48.1_MB_(38.02%)

public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int o = image[sr][sc];
        helper(image, sr, sc, newColor, o);
        return image;
    }

    private void helper(int[][] img, int r, int c, int n, int o) {
        if (r >= img.length
                || c >= img[0].length
                || r < 0
                || c < 0
                || img[r][c] == n
                || img[r][c] != o) {
            return;
        }
        img[r][c] = n;
        helper(img, r + 1, c, n, o);
        helper(img, r - 1, c, n, o);
        helper(img, r, c + 1, n, o);
        helper(img, r, c - 1, n, o);
    }
}
