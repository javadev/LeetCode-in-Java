package g3601_3700.s3639_minimum_time_to_activate_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minTime() {
        assertThat(new Solution().minTime("abc", new int[] {1, 0, 2}, 2), equalTo(0));
    }

    @Test
    void minTime2() {
        assertThat(new Solution().minTime("cat", new int[] {0, 2, 1}, 6), equalTo(2));
    }

    @Test
    void minTime3() {
        assertThat(new Solution().minTime("xy", new int[] {0, 1}, 4), equalTo(-1));
    }
}
