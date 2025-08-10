package g3601_3700.s3636_threshold_majority_queries;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void subarrayMajority() {
        assertThat(
                new Solution()
                        .subarrayMajority(
                                new int[] {1, 1, 2, 2, 1, 1},
                                new int[][] {{0, 5, 4}, {0, 3, 3}, {2, 3, 2}}),
                equalTo(new int[] {1, -1, 2}));
    }

    @Test
    void subarrayMajority2() {
        assertThat(
                new Solution()
                        .subarrayMajority(
                                new int[] {3, 2, 3, 2, 3, 2, 3},
                                new int[][] {{0, 6, 4}, {1, 5, 2}, {2, 4, 1}, {3, 3, 1}}),
                equalTo(new int[] {3, 2, 3, 2}));
    }
}
