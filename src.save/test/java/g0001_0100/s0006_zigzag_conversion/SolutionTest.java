package g0001_0100.s0006_zigzag_conversion;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void convert() {
        assertThat(new Solution().convert("PAYPALISHIRING", 3), equalTo("PAHNAPLSIIGYIR"));
    }

    @Test
    void convert2() {
        assertThat(new Solution().convert("PAYPALISHIRING", 4), equalTo("PINALSIGYAHRPI"));
    }
}
