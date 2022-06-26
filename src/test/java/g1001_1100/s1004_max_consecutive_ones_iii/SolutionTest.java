package g1001_1100.s1004_max_consecutive_ones_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestOnes() {
        assertThat(
                new Solution().longestOnes(new int[] {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2),
                equalTo(6));
    }

    @Test
    void longestOnes2() {
        assertThat(
                new Solution()
                        .longestOnes(
                                new int[] {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1},
                                3),
                equalTo(10));
    }
}
