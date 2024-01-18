package g1401_1500.s1492_the_kth_factor_of_n;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kthFactor() {
        assertThat(new Solution().kthFactor(12, 3), equalTo(3));
    }

    @Test
    void kthFactor2() {
        assertThat(new Solution().kthFactor(7, 2), equalTo(7));
    }

    @Test
    void kthFactor3() {
        assertThat(new Solution().kthFactor(4, 4), equalTo(-1));
    }
}
