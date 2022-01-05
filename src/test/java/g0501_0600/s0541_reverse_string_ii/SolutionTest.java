package g0501_0600.s0541_reverse_string_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reverseStr() {
        assertThat(new Solution().reverseStr("abcdefg", 2), equalTo("bacdfeg"));
    }

    @Test
    void reverseStr2() {
        assertThat(new Solution().reverseStr("abcd", 2), equalTo("bacd"));
    }
}
