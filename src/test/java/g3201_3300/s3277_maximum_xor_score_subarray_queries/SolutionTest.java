package g3201_3300.s3277_maximum_xor_score_subarray_queries;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumSubarrayXor() {
        assertThat(
                new Solution()
                        .maximumSubarrayXor(
                                new int[] {2, 8, 4, 32, 16, 1},
                                new int[][] {{0, 2}, {1, 4}, {0, 5}}),
                equalTo(new int[] {12, 60, 60}));
    }

    @Test
    void maximumSubarrayXor2() {
        assertThat(
                new Solution()
                        .maximumSubarrayXor(
                                new int[] {0, 7, 3, 2, 8, 5, 1},
                                new int[][] {{0, 3}, {1, 5}, {2, 4}, {2, 6}, {5, 6}}),
                equalTo(new int[] {7, 14, 11, 14, 5}));
    }
}
