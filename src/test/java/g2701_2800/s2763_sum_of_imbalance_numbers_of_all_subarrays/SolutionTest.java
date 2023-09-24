package g2701_2800.s2763_sum_of_imbalance_numbers_of_all_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumImbalanceNumbers() {
        assertThat(new Solution().sumImbalanceNumbers(new int[] {2, 3, 1, 4}), equalTo(3));
    }

    @Test
    void sumImbalanceNumbers2() {
        assertThat(new Solution().sumImbalanceNumbers(new int[] {1, 3, 3, 3, 5}), equalTo(8));
    }
}
