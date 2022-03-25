package g1401_1500.s1401_circle_and_rectangle_overlapping;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkOverlap() {
        assertThat(new Solution().checkOverlap(1, 0, 0, 1, -1, 3, 1), equalTo(true));
    }

    @Test
    void checkOverlap2() {
        assertThat(new Solution().checkOverlap(1, 1, 1, 1, -3, 2, -1), equalTo(false));
    }

    @Test
    void checkOverlap3() {
        assertThat(new Solution().checkOverlap(1, 0, 0, -1, 0, 0, 1), equalTo(true));
    }
}
