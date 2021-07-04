package s0012.integer.to.roman;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void intToRoman() {
        assertThat(new Solution().intToRoman(3), equalTo("III"));
    }
}
