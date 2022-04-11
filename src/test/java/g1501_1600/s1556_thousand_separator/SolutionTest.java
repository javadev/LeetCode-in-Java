package g1501_1600.s1556_thousand_separator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import g1501_1600.s1540_can_convert_string_in_k_moves.Solution;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canConvertString() {
        assertThat(
                new g1501_1600.s1540_can_convert_string_in_k_moves.Solution()
                        .canConvertString("input", "ouput", 9),
                equalTo(true));
    }

    @Test
    void canConvertString2() {
        assertThat(
                new g1501_1600.s1540_can_convert_string_in_k_moves.Solution()
                        .canConvertString("abc", "bcd", 10),
                equalTo(false));
    }

    @Test
    void canConvertString3() {
        assertThat(new Solution().canConvertString("aab", "bbb", 27), equalTo(true));
    }
}
