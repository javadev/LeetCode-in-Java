package g0001_0100.s0091_decode_ways;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void numDecodings() {
        assertThat(new Solution().numDecodings("12"), equalTo(2));
    }
}
