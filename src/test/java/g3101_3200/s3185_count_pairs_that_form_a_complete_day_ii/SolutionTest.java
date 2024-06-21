package g3101_3200.s3185_count_pairs_that_form_a_complete_day_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countCompleteDayPairs() {
        assertThat(
                new Solution().countCompleteDayPairs(new int[] {12, 12, 30, 24, 24}), equalTo(2L));
    }

    @Test
    void countCompleteDayPairs2() {
        assertThat(new Solution().countCompleteDayPairs(new int[] {72, 48, 24, 3}), equalTo(3L));
    }
}
