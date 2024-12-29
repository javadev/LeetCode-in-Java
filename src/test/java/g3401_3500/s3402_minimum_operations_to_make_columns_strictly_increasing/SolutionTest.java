package g3401_3500.s3402_minimum_operations_to_make_columns_strictly_increasing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumOperations() {
        assertThat(
                new Solution().minimumOperations(new int[][] {{3, 2}, {1, 3}, {3, 4}, {0, 1}}),
                equalTo(15));
    }

    @Test
    void minimumOperations2() {
        assertThat(
                new Solution().minimumOperations(new int[][] {{3, 2, 1}, {2, 1, 0}, {1, 2, 3}}),
                equalTo(12));
    }
}
