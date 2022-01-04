package g0501_0600.s0532_k_diff_pairs_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findPairs() {
        assertThat(new Solution().findPairs(new int[] {3, 1, 4, 1, 5}, 2), equalTo(2));
    }

    @Test
    void findPairs2() {
        assertThat(new Solution().findPairs(new int[] {1, 2, 3, 4, 5}, 1), equalTo(4));
    }

    @Test
    void findPairs3() {
        assertThat(new Solution().findPairs(new int[] {1, 3, 1, 5, 4}, 0), equalTo(1));
    }
}
