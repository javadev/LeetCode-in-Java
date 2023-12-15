package g2801_2900.s2849_determine_if_a_cell_is_reachable_at_a_given_time;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isReachableAtTime() {
        assertThat(new Solution().isReachableAtTime(2, 4, 7, 7, 6), equalTo(true));
    }

    @Test
    void isReachableAtTime2() {
        assertThat(new Solution().isReachableAtTime(3, 1, 7, 3, 3), equalTo(false));
    }

    @Test
    void isReachableAtTime3() {
        assertThat(new Solution().isReachableAtTime(3, 1, 3, 1, 3), equalTo(true));
    }

    @Test
    void isReachableAtTime4() {
        assertThat(new Solution().isReachableAtTime(3, 1, 3, 1, 1), equalTo(false));
    }
}
