package g2201_2300.s2289_steps_to_make_array_non_decreasing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void totalSteps() {
        assertThat(
                new Solution().totalSteps(new int[] {5, 3, 4, 4, 7, 3, 6, 11, 8, 5, 11}),
                equalTo(3));
    }

    @Test
    void totalSteps2() {
        assertThat(new Solution().totalSteps(new int[] {4, 5, 7, 7, 13}), equalTo(0));
    }
}
