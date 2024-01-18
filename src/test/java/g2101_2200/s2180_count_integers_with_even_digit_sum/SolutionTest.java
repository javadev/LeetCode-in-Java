package g2101_2200.s2180_count_integers_with_even_digit_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countEven() {
        assertThat(new Solution().countEven(4), equalTo(2));
    }

    @Test
    void countEven2() {
        assertThat(new Solution().countEven(30), equalTo(14));
    }

    @Test
    void countEven3() {
        assertThat(new Solution().countEven(11), equalTo(5));
    }
}
