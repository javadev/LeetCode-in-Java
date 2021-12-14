package g0401_0500.s0405_convert_a_number_to_hexadecimal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void toHex() {
        assertThat(new Solution().toHex(26), equalTo("1a"));
    }

    @Test
    void toHex2() {
        assertThat(new Solution().toHex(-1), equalTo("ffffffff"));
    }
}
