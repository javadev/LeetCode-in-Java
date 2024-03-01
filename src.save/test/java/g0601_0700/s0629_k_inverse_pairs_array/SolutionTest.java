package g0601_0700.s0629_k_inverse_pairs_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kInversePairs() {
        assertThat(new Solution().kInversePairs(3, 0), equalTo(1));
    }

    @Test
    void kInversePairs2() {
        assertThat(new Solution().kInversePairs(3, 1), equalTo(2));
    }
}
