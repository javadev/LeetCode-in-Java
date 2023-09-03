package g2501_2600.s2530_maximal_score_after_applying_k_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxKelements() {
        assertThat(new Solution().maxKelements(new int[] {10, 10, 10, 10, 10}, 5), equalTo(50L));
    }

    @Test
    void maxKelements2() {
        assertThat(new Solution().maxKelements(new int[] {1, 10, 3, 3, 3}, 3), equalTo(17L));
    }
}
