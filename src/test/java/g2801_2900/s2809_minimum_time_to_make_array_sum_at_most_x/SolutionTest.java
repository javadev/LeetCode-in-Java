package g2801_2900.s2809_minimum_time_to_make_array_sum_at_most_x;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumTime() {
        assertThat(
                new Solution().minimumTime(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3), 4),
                equalTo(3));
    }

    @Test
    void minimumTime2() {
        assertThat(
                new Solution().minimumTime(Arrays.asList(1, 2, 3), Arrays.asList(3, 3, 3), 4),
                equalTo(-1));
    }
}
