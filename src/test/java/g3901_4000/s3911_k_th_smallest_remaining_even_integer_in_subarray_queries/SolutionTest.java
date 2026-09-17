package g3901_4000.s3911_k_th_smallest_remaining_even_integer_in_subarray_queries;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kthRemainingInteger() {
        assertThat(
                new Solution()
                        .kthRemainingInteger(
                                new int[] {1, 4, 7}, new int[][] {{0, 2, 1}, {1, 1, 2}, {0, 0, 3}}),
                equalTo(new int[] {2, 6, 6}));
    }

    @Test
    void kthRemainingInteger2() {
        assertThat(
                new Solution()
                        .kthRemainingInteger(
                                new int[] {2, 5, 8}, new int[][] {{0, 1, 2}, {1, 2, 1}, {0, 2, 4}}),
                equalTo(new int[] {6, 2, 12}));
    }

    @Test
    void kthRemainingInteger3() {
        assertThat(
                new Solution()
                        .kthRemainingInteger(new int[] {3, 6}, new int[][] {{0, 1, 1}, {1, 1, 3}}),
                equalTo(new int[] {2, 8}));
    }

    @Test
    void kthRemainingInteger4() {
        assertThat(
                new Solution()
                        .kthRemainingInteger(
                                new int[] {2, 4, 6},
                                new int[][] {{0, 2, 1}, {1, 2, 1}, {0, 2, 1000000000}}),
                equalTo(new int[] {8, 2, 2000000006}));
    }

    @Test
    void kthRemainingInteger5() {
        assertThat(
                new Solution()
                        .kthRemainingInteger(
                                new int[] {2, 6, 10},
                                new int[][] {{0, 2, 1}, {0, 2, 2}, {0, 2, 3}}),
                equalTo(new int[] {4, 8, 12}));
    }

    @Test
    void kthRemainingInteger6() {
        assertThat(
                new Solution()
                        .kthRemainingInteger(
                                new int[] {1, 3, 5}, new int[][] {{0, 2, 1}, {1, 2, 4}}),
                equalTo(new int[] {2, 8}));
    }
}
