package g0201_0300.s0263_ugly_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void isUgly() {
        assertThat(new Solution().isUgly(6), equalTo(true));
    }

    @Test
    public void isUgly2() {
        assertThat(new Solution().isUgly(8), equalTo(true));
    }

    @Test
    public void isUgly3() {
        assertThat(new Solution().isUgly(14), equalTo(false));
    }

    @Test
    public void isUgly4() {
        assertThat(new Solution().isUgly(1), equalTo(true));
    }
}
