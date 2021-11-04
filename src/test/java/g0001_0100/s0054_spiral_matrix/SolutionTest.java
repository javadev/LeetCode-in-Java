package g0001_0100.s0054_spiral_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void spiralOrder() {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertThat(
                new Solution().spiralOrder(input),
                equalTo(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5)));
    }
}
