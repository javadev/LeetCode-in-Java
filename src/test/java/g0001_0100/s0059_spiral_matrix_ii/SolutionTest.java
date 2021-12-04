package g0001_0100.s0059_spiral_matrix_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void generateMatrix() {
        int[][] expected = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        assertThat(new Solution().generateMatrix(3), equalTo(expected));
    }
}
