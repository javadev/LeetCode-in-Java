package s0006.zigzag.conversion;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void convert() {
        assertThat(new Solution().convert("PAYPALISHIRING", 3), equalTo("PAHNAPLSIIGYIR"));
    }
}
