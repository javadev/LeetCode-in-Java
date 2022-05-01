package g0001_0100.s0050_powx_n;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void myPow() {
        assertThat(new Solution().myPow(2.00000, 10), equalTo(1024.00000));
    }

    @Test
    void myPow2() {
        assertThat(new Solution().myPow(2.10000, 3), equalTo(9.261000000000001));
    }

    @Test
    void myPow3() {
        assertThat(new Solution().myPow(2.00000, -2), equalTo(0.25000));
    }
}
