package g0001_0100.s0007_reverse_integer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void reverse() {
        assertThat(new Solution().reverse(123), equalTo(321));
    }
}
