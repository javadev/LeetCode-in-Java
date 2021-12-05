package g0001_0100.s0087_scramble_string_hard_string_dynamic_programming;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void isScramble() {
        assertThat(new Solution().isScramble("great", "rgeat"), equalTo(true));
    }
}
