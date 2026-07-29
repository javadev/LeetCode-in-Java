package g3801_3900.s3871_count_commas_in_range_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void handlesEveryCommaMagnitudeBoundary() {
        Solution solution = new Solution();

        assertThat(solution.countCommas(998), equalTo(0L));
        assertThat(solution.countCommas(1002), equalTo(3L));
        assertThat(solution.countCommas(1_000_000), equalTo(999_002L));
    }
}
