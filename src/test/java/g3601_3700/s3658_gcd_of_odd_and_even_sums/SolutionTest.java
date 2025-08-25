package g3601_3700.s3658_gcd_of_odd_and_even_sums;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void gcdOfOddEvenSums() {
        assertThat(new Solution().gcdOfOddEvenSums(4), equalTo(4));
    }

    @Test
    void gcdOfOddEvenSums2() {
        assertThat(new Solution().gcdOfOddEvenSums(5), equalTo(5));
    }
}
