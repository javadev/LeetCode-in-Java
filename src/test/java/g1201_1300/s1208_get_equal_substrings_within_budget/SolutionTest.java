package g1201_1300.s1208_get_equal_substrings_within_budget;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void equalSubstring() {
        assertThat(new Solution().equalSubstring("abcd", "bcdf", 3), equalTo(3));
    }

    @Test
    void equalSubstring2() {
        assertThat(new Solution().equalSubstring("abcd", "cdef", 3), equalTo(1));
    }

    @Test
    void equalSubstring3() {
        assertThat(new Solution().equalSubstring("abcd", "acde", 0), equalTo(1));
    }
}
