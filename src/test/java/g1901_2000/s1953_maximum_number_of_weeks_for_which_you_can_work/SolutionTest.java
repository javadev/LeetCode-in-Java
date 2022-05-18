package g1901_2000.s1953_maximum_number_of_weeks_for_which_you_can_work;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfWeeks() {
        assertThat(new Solution().numberOfWeeks(new int[] {1, 2, 3}), equalTo(6L));
    }

    @Test
    void numberOfWeeks2() {
        assertThat(new Solution().numberOfWeeks(new int[] {5, 2, 1}), equalTo(7L));
    }
}
