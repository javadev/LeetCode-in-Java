package g2201_2300.s2224_minimum_number_of_operations_to_convert_time;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void convertTime() {
        assertThat(new Solution().convertTime("02:30", "04:35"), equalTo(3));
    }

    @Test
    void convertTime2() {
        assertThat(new Solution().convertTime("11:00", "11:01"), equalTo(1));
    }
}
