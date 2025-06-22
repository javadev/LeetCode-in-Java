package g3501_3600.s3590_kth_smallest_path_xor_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kthSmallest() {
        assertThat(
                new Solution()
                        .kthSmallest(
                                new int[] {-1, 0, 0},
                                new int[] {1, 1, 1},
                                new int[][] {{0, 1}, {0, 2}, {0, 3}}),
                equalTo(new int[] {0, 1, -1}));
    }

    @Test
    void kthSmallest2() {
        assertThat(
                new Solution()
                        .kthSmallest(
                                new int[] {-1, 0, 1},
                                new int[] {5, 2, 7},
                                new int[][] {{0, 1}, {1, 2}, {1, 3}, {2, 1}}),
                equalTo(new int[] {0, 7, -1, 0}));
    }
}
