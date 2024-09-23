package g3201_3300.s3296_minimum_number_of_seconds_to_make_mountain_height_zero;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minNumberOfSeconds() {
        assertThat(new Solution().minNumberOfSeconds(4, new int[] {2, 1, 1}), equalTo(3L));
    }

    @Test
    void minNumberOfSeconds2() {
        assertThat(new Solution().minNumberOfSeconds(10, new int[] {3, 2, 2, 4}), equalTo(12L));
    }

    @Test
    void minNumberOfSeconds3() {
        assertThat(new Solution().minNumberOfSeconds(5, new int[] {1}), equalTo(15L));
    }
}
