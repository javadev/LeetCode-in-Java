package g1401_1500.s1476_subrectangle_queries;

// #Medium #Array #Matrix #Design #2022_04_04_Time_20_ms_(97.61%)_Space_44.6_MB_(95.87%)

public class SubrectangleQueries {
    private final int[][] rectangle;

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                rectangle[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return rectangle[row][col];
    }
}
