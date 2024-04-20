package g2701_2800.s2710_remove_trailing_zeros_from_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeTrailingZeros() {
        assertThat(new Solution().removeTrailingZeros("51230100"), equalTo("512301"));
    }

    @Test
    void removeTrailingZeros2() {
        assertThat(new Solution().removeTrailingZeros("123"), equalTo("123"));
    }
}
