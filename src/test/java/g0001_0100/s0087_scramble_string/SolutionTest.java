package g0001_0100.s0087_scramble_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void isScramble() {
        assertThat(new Solution().isScramble("great", "rgeat"), equalTo(true));
    }
}
