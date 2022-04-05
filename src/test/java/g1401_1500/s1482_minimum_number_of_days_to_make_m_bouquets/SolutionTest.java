package g1401_1500.s1482_minimum_number_of_days_to_make_m_bouquets;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDays() {
        assertThat(new Solution().minDays(new int[] {1, 10, 3, 10, 2}, 3, 2), equalTo(-1));
    }

    @Test
    void minDays2() {
        assertThat(new Solution().minDays(new int[] {1, 10, 3, 10, 2}, 3, 2), equalTo(-1));
    }

    @Test
    void minDays3() {
        assertThat(new Solution().minDays(new int[] {7, 7, 7, 7, 12, 7, 7}, 2, 3), equalTo(12));
    }
}
