package g2101_2200.s2182_construct_string_with_repeat_limit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void repeatLimitedString() {
        assertThat(new Solution().repeatLimitedString("cczazcc", 3), equalTo("zzcccac"));
    }

    @Test
    void repeatLimitedString2() {
        assertThat(new Solution().repeatLimitedString("aababab", 2), equalTo("bbabaa"));
    }
}
