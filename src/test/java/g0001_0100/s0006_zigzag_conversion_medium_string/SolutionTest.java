package g0001_0100.s0006_zigzag_conversion;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void convert() {
        assertThat(new Solution().convert("PAYPALISHIRING", 3), equalTo("PAHNAPLSIIGYIR"));
    }
}
