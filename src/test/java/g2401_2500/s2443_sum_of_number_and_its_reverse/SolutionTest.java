package g2401_2500.s2443_sum_of_number_and_its_reverse;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumOfNumberAndReverse() {
        assertThat(new Solution().sumOfNumberAndReverse(443), equalTo(true));
    }

    @Test
    void sumOfNumberAndReverse2() {
        assertThat(new Solution().sumOfNumberAndReverse(63), equalTo(false));
    }

    @Test
    void sumOfNumberAndReverse3() {
        assertThat(new Solution().sumOfNumberAndReverse(181), equalTo(true));
    }
}
