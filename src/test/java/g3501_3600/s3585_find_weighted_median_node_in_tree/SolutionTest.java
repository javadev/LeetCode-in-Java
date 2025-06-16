package g3501_3600.s3585_find_weighted_median_node_in_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMedian() {
        assertThat(
                new Solution().findMedian(2, new int[][] {{0, 1, 7}}, new int[][] {{1, 0}, {0, 1}}),
                equalTo(new int[] {0, 1}));
    }

    @Test
    void findMedian2() {
        assertThat(
                new Solution()
                        .findMedian(
                                3,
                                new int[][] {{0, 1, 2}, {2, 0, 4}},
                                new int[][] {{0, 1}, {2, 0}, {1, 2}}),
                equalTo(new int[] {1, 0, 2}));
    }

    @Test
    void findMedian3() {
        assertThat(
                new Solution()
                        .findMedian(
                                5,
                                new int[][] {{0, 1, 2}, {0, 2, 5}, {1, 3, 1}, {2, 4, 3}},
                                new int[][] {{3, 4}, {1, 2}}),
                equalTo(new int[] {2, 2}));
    }
}
