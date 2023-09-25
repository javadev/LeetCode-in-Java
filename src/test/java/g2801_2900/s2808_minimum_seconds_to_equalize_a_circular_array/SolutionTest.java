package g2801_2900.s2808_minimum_seconds_to_equalize_a_circular_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumSeconds() {
        assertThat(new Solution().minimumSeconds(Arrays.asList(2, 1, 3, 3, 2)), equalTo(2));
    }

    @Test
    void minimumSeconds2() {
        assertThat(new Solution().minimumSeconds(Arrays.asList(5, 5, 5, 5)), equalTo(0));
    }
}
