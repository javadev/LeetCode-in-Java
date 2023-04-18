package g2501_2600.s2521_distinct_prime_factors_of_product_of_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distinctPrimeFactors() {
        assertThat(new Solution().distinctPrimeFactors(new int[] {2, 4, 3, 7, 10, 6}), equalTo(4));
    }

    @Test
    void distinctPrimeFactors2() {
        assertThat(new Solution().distinctPrimeFactors(new int[] {2, 4, 8, 16}), equalTo(1));
    }
}
