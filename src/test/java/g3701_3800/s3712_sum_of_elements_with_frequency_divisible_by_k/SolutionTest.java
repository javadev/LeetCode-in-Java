package g3701_3800.s3712_sum_of_elements_with_frequency_divisible_by_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumDivisibleByK() {
        assertThat(
                new Solution().sumDivisibleByK(new int[] {1, 2, 2, 3, 3, 3, 3, 4}, 2), equalTo(16));
    }

    @Test
    void sumDivisibleByK2() {
        assertThat(new Solution().sumDivisibleByK(new int[] {1, 2, 3, 4, 5}, 2), equalTo(0));
    }

    @Test
    void sumDivisibleByK3() {
        assertThat(new Solution().sumDivisibleByK(new int[] {4, 4, 4, 1, 2, 3}, 3), equalTo(12));
    }
}
