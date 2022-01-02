package g0501_0600.s0509_fibonacci_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void fib() {
        assertThat(new Solution().fib(2), equalTo(1));
    }

    @Test
    void fib2() {
        assertThat(new Solution().fib(3), equalTo(2));
    }

    @Test
    void fib3() {
        assertThat(new Solution().fib(4), equalTo(3));
    }
}
