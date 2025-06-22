package g3501_3600.s3589_count_prime_gap_balanced_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void primeSubarray() {
        assertThat(new Solution().primeSubarray(new int[] {1, 2, 3}, 1), equalTo(2));
    }

    @Test
    void primeSubarray2() {
        assertThat(new Solution().primeSubarray(new int[] {2, 3, 5, 7}, 3), equalTo(4));
    }
}
