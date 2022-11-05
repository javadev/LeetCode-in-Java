package g1501_1600.s1553_minimum_number_of_days_to_eat_n_oranges;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDays() {
        assertThat(new Solution().minDays(10), equalTo(4));
    }

    @Test
    void minDays2() {
        assertThat(new Solution().minDays(6), equalTo(3));
    }
}
