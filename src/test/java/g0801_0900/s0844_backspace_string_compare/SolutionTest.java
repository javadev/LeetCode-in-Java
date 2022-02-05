package g0801_0900.s0844_backspace_string_compare;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void backspaceCompare() {
        assertThat(new Solution().backspaceCompare("ab#c","ad#c"), equalTo(true));
    }

    @Test
    void backspaceCompare2() {
        assertThat(new Solution().backspaceCompare("ab##","c#d#"), equalTo(true));
    }

    @Test
    void backspaceCompare3() {
        assertThat(new Solution().backspaceCompare("a#c","b"), equalTo(false));
    }
}
