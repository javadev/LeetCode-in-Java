package g1101_1200.s1137_n_th_tribonacci_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void tribonacci() {
        assertThat(new Solution().tribonacci(4), equalTo(4));
    }

    @Test
    void tribonacci2() {
        assertThat(new Solution().tribonacci(25), equalTo(1389537));
    }
}
