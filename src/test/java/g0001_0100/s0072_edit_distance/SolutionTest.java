package g0001_0100.s0072_edit_distance;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDistance() {
        assertThat(new Solution().minDistance("horse", "ros"), equalTo(3));
    }

    @Test
    void minDistance2() {
        assertThat(new Solution().minDistance("intention", "execution"), equalTo(5));
    }
}
