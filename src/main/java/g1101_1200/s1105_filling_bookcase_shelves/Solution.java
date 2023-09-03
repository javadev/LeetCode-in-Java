package g1101_1200.s1105_filling_bookcase_shelves;

// #Medium #Array #Dynamic_Programming #2023_09_03_Time_0_ms_(100.00%)_Space_40.7_MB_(85.99%)

public class Solution {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int[] heights = new int[books.length];
        heights[0] = books[0][1];
        for (int i = 1; i < books.length; i++) {
            int width = books[i][0];
            heights[i] = books[i][1] + heights[i - 1];
            int height = books[i][1];
            int l = i - 1;
            while (l >= 0 && width + books[l][0] <= shelfWidth) {
                width += books[l][0];
                height = Math.max(height, books[l][1]);
                heights[i] = Math.min(heights[i], (l > 0 ? heights[l - 1] : 0) + height);
                l--;
            }
        }
        return heights[books.length - 1];
    }
}
