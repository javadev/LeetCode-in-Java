package g2101_2200.s2167_minimum_time_to_remove_all_cars_containing_illegal_goods;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumTime() {
        assertThat(new Solution().minimumTime("0010"), equalTo(2));
    }

    @Test
    void minimumTime2() {
        assertThat(new Solution().minimumTime("1100101"), equalTo(5));
    }
}
