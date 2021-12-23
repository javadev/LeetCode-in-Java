package g0401_0500.s0456_132_pattern;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void find132pattern() {
        assertThat(new Solution().find132pattern(new int[] {1, 2, 3, 4}), equalTo(false));
    }

    @Test
    void find132pattern2() {
        assertThat(new Solution().find132pattern(new int[] {3, 1, 4, 2}), equalTo(true));
    }

    @Test
    void find132pattern3() {
        assertThat(new Solution().find132pattern(new int[] {-1, 3, 2, 0}), equalTo(true));
    }
}
