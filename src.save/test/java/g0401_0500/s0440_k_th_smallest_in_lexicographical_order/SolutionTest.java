package g0401_0500.s0440_k_th_smallest_in_lexicographical_order;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findKthNumber() {
        assertThat(new Solution().findKthNumber(13, 2), equalTo(10));
    }

    @Test
    void findKthNumber2() {
        assertThat(new Solution().findKthNumber(1, 1), equalTo(1));
    }
}
