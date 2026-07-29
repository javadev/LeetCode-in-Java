package g3801_3900.s3870_count_commas_in_range;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countCommas() {
        assertThat(new Solution().countCommas(998), equalTo(0));
    }

    @Test
    void countCommas2() {
        assertThat(new Solution().countCommas(1002), equalTo(3));
    }

    @Test
    void countCommas3() {
        assertThat(new Solution().countCommas(100000), equalTo(99001));
    }
}
