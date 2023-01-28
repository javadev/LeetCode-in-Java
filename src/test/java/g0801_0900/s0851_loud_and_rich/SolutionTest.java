package g0801_0900.s0851_loud_and_rich;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void loudAndRich() {
        assertThat(
                new Solution()
                        .loudAndRich(
                                new int[][] {
                                    {1, 0}, {2, 1}, {3, 1}, {3, 7}, {4, 3}, {5, 3}, {6, 3}
                                },
                                new int[] {3, 2, 5, 4, 6, 1, 7, 0}),
                equalTo(new int[] {5, 5, 2, 5, 4, 5, 6, 7}));
    }

    @Test
    void loudAndRich2() {
        assertThat(
                new Solution().loudAndRich(new int[][] {}, new int[] {0}), equalTo(new int[] {0}));
    }
}
