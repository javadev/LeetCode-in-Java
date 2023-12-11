package g1701_1800.s1725_number_of_rectangles_that_can_form_the_largest_square;

// #Easy #Array #2022_04_25_Time_1_ms_(100.00%)_Space_53.6_MB_(64.54%)

public class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxSoFar = 0;
        int count = 0;
        for (int[] rectangle : rectangles) {
            int sqLen = Math.min(rectangle[0], rectangle[1]);
            if (maxSoFar <= sqLen) {
                if (maxSoFar < sqLen) {
                    maxSoFar = sqLen;
                    count = 1;
                } else {
                    count++;
                }
            }
        }
        return count;
    }
}
