package g2801_2900.s2801_count_stepping_numbers_in_range;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSteppingNumbers() {
        assertThat(new Solution().countSteppingNumbers("1", "11"), equalTo(10));
    }

    @Test
    void countSteppingNumbers2() {
        assertThat(new Solution().countSteppingNumbers("90", "101"), equalTo(2));
    }
}
