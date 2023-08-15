package g2501_2600.s2546_apply_bitwise_operations_to_make_strings_equal;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void makeStringsEqual() {
        assertThat(
                new Solution().makeStringsEqual("1010", "0110"),
                equalTo(true));
    }

    @Test
    void makeStringsEqual2() {
        assertThat(
                new Solution().makeStringsEqual("11", "00"),
                equalTo(false));
    }
}
