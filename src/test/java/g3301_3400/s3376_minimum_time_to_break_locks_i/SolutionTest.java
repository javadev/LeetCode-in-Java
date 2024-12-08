package g3301_3400.s3376_minimum_time_to_break_locks_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMinimumTime() {
        assertThat(new Solution().findMinimumTime(List.of(3, 4, 1), 1), equalTo(4));
    }

    @Test
    void findMinimumTime2() {
        assertThat(new Solution().findMinimumTime(List.of(2, 5, 4), 2), equalTo(5));
    }
}
