package s0091_decode_ways;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void numDecodings() {
        assertThat(new Solution().numDecodings("12"), equalTo(2));
    }
}
