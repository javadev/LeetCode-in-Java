package g2601_2700.s2652_sum_multiples;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumOfMultiples() {
        assertThat(new Solution().sumOfMultiples(7), equalTo(21));
    }

    @Test
    void sumOfMultiples2() {
        assertThat(new Solution().sumOfMultiples(10), equalTo(40));
    }

    @Test
    void sumOfMultiples3() {
        assertThat(new Solution().sumOfMultiples(9), equalTo(30));
    }
}
