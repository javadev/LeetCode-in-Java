package g2501_2600.s2507_smallest_value_after_replacing_with_sum_of_prime_factors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestValue() {
        assertThat(new Solution().smallestValue(15), equalTo(5));
    }

    @Test
    void smallestValue2() {
        assertThat(new Solution().smallestValue(3), equalTo(3));
    }
}
