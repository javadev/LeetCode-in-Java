package g0001_0100.s0069_sqrtx;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void mySqrt() {
        assertThat(new Solution().mySqrt(4), equalTo(2));
    }
}
