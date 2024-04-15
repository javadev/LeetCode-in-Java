package g1901_2000.s1922_count_good_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countGoodNumbers() {
        assertThat(new Solution().countGoodNumbers(1), equalTo(5));
    }

    @Test
    void countGoodNumbers2() {
        assertThat(new Solution().countGoodNumbers(4), equalTo(400));
    }

    @Test
    void countGoodNumbers3() {
        assertThat(new Solution().countGoodNumbers(50), equalTo(564908303));
    }
}
