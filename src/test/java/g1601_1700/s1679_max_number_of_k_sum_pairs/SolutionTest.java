package g1601_1700.s1679_max_number_of_k_sum_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxOperations() {
        assertThat(new Solution().maxOperations(new int[] {1, 2, 3, 4}, 5), equalTo(2));
    }

    @Test
    void maxOperations2() {
        assertThat(new Solution().maxOperations(new int[] {3, 1, 3, 4, 3}, 6), equalTo(1));
    }
}
