package g1501_1600.s1540_can_convert_string_in_k_moves;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canConvertString() {
        assertThat(new Solution().canConvertString("input", "ouput", 9), equalTo(true));
    }

    @Test
    void canConvertString2() {
        assertThat(new Solution().canConvertString("abc", "bcd", 10), equalTo(false));
    }

    @Test
    void canConvertString3() {
        assertThat(new Solution().canConvertString("aab", "bbb", 27), equalTo(true));
    }
}
