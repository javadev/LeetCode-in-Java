package g1001_1100.s1051_height_checker;

// #Easy #Array #Sorting #Counting_Sort #2022_02_28_Time_1_ms_(94.01%)_Space_42.6_MB_(5.71%)

public class Solution {
    public int heightChecker(int[] heights) {
        int heightDiff = 0;
        int[] count = new int[101];
        int[] actualLine = new int[heights.length];
        for (int height : heights) {
            count[height]++;
        }
        int heightLength = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                for (int j = 0; j < count[i]; j++) {
                    actualLine[heightLength] = i;
                    heightLength++;
                }
                count[i] = 0;
            }
        }
        for (int i = 0; i < heights.length; i++) {
            if (actualLine[i] != heights[i]) {
                heightDiff++;
            }
        }
        return heightDiff;
    }
}
