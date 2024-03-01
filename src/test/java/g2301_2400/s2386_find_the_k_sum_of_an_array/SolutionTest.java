package g2301_2400.s2386_find_the_k_sum_of_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kSum() {
        assertThat(new Solution().kSum(new int[] {2, 4, -2}, 5), equalTo(2L));
    }

    @Test
    void kSum2() {
        assertThat(new Solution().kSum(new int[] {1, -2, 3, 4, -10, 12}, 16), equalTo(10L));
    }

    @Test
    void kSum3() {
        assertThat(
                new Solution().kSum(new int[] {-530219056, 353285209, 493533664}, 6),
                equalTo(-36685392L));
    }
}
