package g3801_3900.s3870_count_commas_in_range;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countsCommasAcrossTheWholeRange() {
        Solution solution = new Solution();

        assertThat(solution.countCommas(998), equalTo(0));
        assertThat(solution.countCommas(1002), equalTo(3));
        assertThat(solution.countCommas(100000), equalTo(99001));
    }
}
