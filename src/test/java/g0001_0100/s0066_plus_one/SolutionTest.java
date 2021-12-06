package g0001_0100.s0066_plus_one;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void plusOne() {
        assertThat(new Solution().plusOne(new int[] {1, 2, 3}), equalTo(new int[] {1, 2, 4}));
    }

    @Test
    void plusOne2() {
        assertThat(new Solution().plusOne(new int[] {4, 3, 2, 1}), equalTo(new int[] {4, 3, 2, 2}));
    }

    @Test
    void plusOne3() {
        assertThat(new Solution().plusOne(new int[] {0}), equalTo(new int[] {1}));
    }

    @Test
    void plusOne4() {
        assertThat(new Solution().plusOne(new int[] {9}), equalTo(new int[] {1, 0}));
    }
}
