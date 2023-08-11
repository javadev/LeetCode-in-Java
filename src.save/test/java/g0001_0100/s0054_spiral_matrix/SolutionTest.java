package g0001_0100.s0054_spiral_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void spiralOrder() {
        assertThat(
                new Solution().spiralOrder(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}),
                equalTo(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5)));
    }

    @Test
    void spiralOrder2() {
        assertThat(
                new Solution()
                        .spiralOrder(new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}),
                equalTo(Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7)));
    }
}
