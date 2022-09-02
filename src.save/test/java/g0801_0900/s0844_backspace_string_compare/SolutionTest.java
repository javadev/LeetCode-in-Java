package g0801_0900.s0844_backspace_string_compare;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void backspaceCompare() {
        assertThat(new Solution().backspaceCompare("ab#c", "ad#c"), equalTo(true));
    }

    @Test
    void backspaceCompare2() {
        assertThat(new Solution().backspaceCompare("ab##", "c#d#"), equalTo(true));
    }

    @Test
    void backspaceCompare3() {
        assertThat(new Solution().backspaceCompare("a#c", "b"), equalTo(false));
    }
}
