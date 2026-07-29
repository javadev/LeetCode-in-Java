package g3801_3900.s3871_count_commas_in_range_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countCommas() {
        assertThat(new Solution().countCommas(998), equalTo(0L));
    }

    @Test
    void countCommas2() {
        assertThat(new Solution().countCommas(1002), equalTo(3L));
    }

    @Test
    void countCommas3() {
        assertThat(new Solution().countCommas(1_000_000), equalTo(999_002L));
    }
}
