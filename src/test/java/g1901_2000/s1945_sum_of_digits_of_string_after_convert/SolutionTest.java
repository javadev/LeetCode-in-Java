package g1901_2000.s1945_sum_of_digits_of_string_after_convert;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getLucky() {
        assertThat(new Solution().getLucky("iiii", 1), equalTo(36));
    }

    @Test
    void getLucky2() {
        assertThat(new Solution().getLucky("leetcode", 2), equalTo(6));
    }

    @Test
    void getLucky3() {
        assertThat(new Solution().getLucky("zbax", 2), equalTo(8));
    }
}
