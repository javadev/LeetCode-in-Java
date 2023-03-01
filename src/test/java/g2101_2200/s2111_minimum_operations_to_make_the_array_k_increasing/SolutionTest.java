package g2101_2200.s2111_minimum_operations_to_make_the_array_k_increasing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kIncreasing() {
        assertThat(new Solution().kIncreasing(new int[] {5, 4, 3, 2, 1}, 1), equalTo(4));
    }

    @Test
    void kIncreasing2() {
        assertThat(new Solution().kIncreasing(new int[] {4, 1, 5, 2, 6, 2}, 2), equalTo(0));
    }

    @Test
    void kIncreasing3() {
        assertThat(new Solution().kIncreasing(new int[] {4, 1, 5, 2, 6, 2}, 3), equalTo(2));
    }
}
