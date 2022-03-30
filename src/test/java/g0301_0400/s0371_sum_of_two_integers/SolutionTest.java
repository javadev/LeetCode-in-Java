package g0301_0400.s0371_sum_of_two_integers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getSum() {
        assertThat(new Solution().getSum(1, 2), equalTo(3));
    }

    @Test
    void getSum2() {
        assertThat(new Solution().getSum(2, 3), equalTo(5));
    }
}
