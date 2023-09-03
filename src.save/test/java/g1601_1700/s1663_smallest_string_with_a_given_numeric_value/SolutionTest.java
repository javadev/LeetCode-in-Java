package g1601_1700.s1663_smallest_string_with_a_given_numeric_value;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getSmallestString() {
        assertThat(new Solution().getSmallestString(3, 27), equalTo("aay"));
    }

    @Test
    void getSmallestString2() {
        assertThat(new Solution().getSmallestString(5, 73), equalTo("aaszz"));
    }
}
