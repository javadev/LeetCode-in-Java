package g0701_0800.s0786_k_th_smallest_prime_fraction;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kthSmallestPrimeFraction() {
        assertThat(
                new Solution().kthSmallestPrimeFraction(new int[] {1, 2, 3, 5}, 3),
                equalTo(new int[] {2, 5}));
    }

    @Test
    void kthSmallestPrimeFraction2() {
        assertThat(
                new Solution().kthSmallestPrimeFraction(new int[] {1, 7}, 1),
                equalTo(new int[] {1, 7}));
    }
}
