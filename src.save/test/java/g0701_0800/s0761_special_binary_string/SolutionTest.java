package g0701_0800.s0761_special_binary_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void makeLargestSpecial() {
        assertThat(new Solution().makeLargestSpecial("11011000"), equalTo("11100100"));
    }

    @Test
    void makeLargestSpecial2() {
        assertThat(new Solution().makeLargestSpecial("10"), equalTo("10"));
    }
}
