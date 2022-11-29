package g1701_1800.s1723_find_minimum_time_to_finish_all_jobs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumTimeRequired() {
        assertThat(new Solution().minimumTimeRequired(new int[] {3, 2, 3}, 3), equalTo(3));
    }

    @Test
    void minimumTimeRequired2() {
        assertThat(new Solution().minimumTimeRequired(new int[] {1, 2, 4, 7, 8}, 2), equalTo(11));
    }
}
