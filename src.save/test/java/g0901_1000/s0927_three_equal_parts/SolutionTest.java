package g0901_1000.s0927_three_equal_parts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void threeEqualParts() {
        assertThat(
                new Solution().threeEqualParts(new int[] {1, 0, 1, 0, 1}),
                equalTo(new int[] {0, 3}));
    }

    @Test
    void threeEqualParts2() {
        assertThat(
                new Solution().threeEqualParts(new int[] {1, 1, 0, 1, 1}),
                equalTo(new int[] {-1, -1}));
    }

    @Test
    void threeEqualParts3() {
        assertThat(
                new Solution().threeEqualParts(new int[] {1, 1, 0, 0, 1}),
                equalTo(new int[] {0, 2}));
    }
}
