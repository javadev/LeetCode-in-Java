package g2701_2800.s2768_number_of_black_blocks;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countBlackBlocks() {
        assertThat(
                new Solution().countBlackBlocks(3, 3, new int[][] {{0, 0}}),
                equalTo(new long[] {3, 1, 0, 0, 0}));
    }

    @Test
    void countBlackBlocks2() {
        assertThat(
                new Solution().countBlackBlocks(3, 3, new int[][] {{0, 0}, {1, 1}, {0, 2}}),
                equalTo(new long[] {0, 2, 2, 0, 0}));
    }
}
