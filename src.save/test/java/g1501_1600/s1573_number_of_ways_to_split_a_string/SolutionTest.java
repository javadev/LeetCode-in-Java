package g1501_1600.s1573_number_of_ways_to_split_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numWays() {
        assertThat(new Solution().numWays("10101"), equalTo(4));
    }

    @Test
    void numWays2() {
        assertThat(new Solution().numWays("1001"), equalTo(0));
    }

    @Test
    void numWays3() {
        assertThat(new Solution().numWays("0000"), equalTo(3));
    }
}
