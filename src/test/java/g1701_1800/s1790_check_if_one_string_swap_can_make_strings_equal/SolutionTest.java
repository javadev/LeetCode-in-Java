package g1701_1800.s1790_check_if_one_string_swap_can_make_strings_equal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void areAlmostEqual() {
        assertThat(new Solution().areAlmostEqual("bank", "kanb"), equalTo(true));
    }

    @Test
    void areAlmostEqual2() {
        assertThat(new Solution().areAlmostEqual("attack", "defend"), equalTo(false));
    }

    @Test
    void areAlmostEqual3() {
        assertThat(new Solution().areAlmostEqual("kelb", "kelb"), equalTo(true));
    }
}
