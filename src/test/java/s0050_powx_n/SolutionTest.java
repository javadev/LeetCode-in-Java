package s0050_powx_n;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void powxN() {
        assertThat(new Solution().myPow(2.00000, 10), equalTo(1024.00000));
    }
}
