package g1801_1900.s1828_queries_on_number_of_points_inside_a_circle;

// #Medium #Array #Math #Geometry #2022_05_07_Time_23_ms_(75.03%)_Space_50.5_MB_(46.96%)

public class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] result = new int[queries.length];
        int i = 0;
        for (int[] query : queries) {
            int pts = 0;
            for (int[] point : points) {
                if ((point[0] - query[0]) * (point[0] - query[0])
                                + (point[1] - query[1]) * (point[1] - query[1])
                        <= query[2] * query[2]) {
                    pts++;
                }
            }
            result[i++] = pts;
        }
        return result;
    }
}
