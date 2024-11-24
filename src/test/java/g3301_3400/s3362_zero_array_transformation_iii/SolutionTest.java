package g3301_3400.s3362_zero_array_transformation_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxRemoval() {
        assertThat(
                new Solution()
                        .maxRemoval(new int[] {2, 0, 2}, new int[][] {{0, 2}, {0, 2}, {1, 1}}),
                equalTo(1));
    }

    @Test
    void maxRemoval2() {
        assertThat(
                new Solution()
                        .maxRemoval(
                                new int[] {1, 1, 1, 1},
                                new int[][] {{1, 3}, {0, 2}, {1, 3}, {1, 2}}),
                equalTo(2));
    }

    @Test
    void maxRemoval3() {
        assertThat(
                new Solution().maxRemoval(new int[] {1, 2, 3, 4}, new int[][] {{0, 3}}),
                equalTo(-1));
    }
}
