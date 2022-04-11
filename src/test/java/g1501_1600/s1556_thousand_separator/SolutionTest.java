package g1501_1600.s1556_thousand_separator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void thousandSeparator() {
        assertThat(new Solution().thousandSeparator(987), equalTo("987"));
    }

    @Test
    void thousandSeparator2() {
        assertThat(new Solution().thousandSeparator(1234), equalTo("1.234"));
    }
}
