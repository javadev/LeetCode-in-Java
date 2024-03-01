package g1001_1100.s1016_binary_string_with_substrings_representing_1_to_n;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void queryString() {
        assertThat(new Solution().queryString("0110", 3), equalTo(true));
    }

    @Test
    void queryString2() {
        assertThat(new Solution().queryString("0110", 4), equalTo(false));
    }
}
