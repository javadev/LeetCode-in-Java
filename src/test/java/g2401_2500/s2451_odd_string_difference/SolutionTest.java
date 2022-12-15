package g2401_2500.s2451_odd_string_difference;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void oddString() {
        assertThat(new Solution().oddString(new String[] {"adc", "wzy", "abc"}), equalTo("abc"));
    }

    @Test
    void oddString2() {
        assertThat(
                new Solution().oddString(new String[] {"aaa", "bob", "ccc", "ddd"}),
                equalTo("bob"));
    }
}
