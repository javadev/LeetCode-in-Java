package g2101_2200.s2149_rearrange_array_elements_by_sign;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rearrangeArray() {
        assertThat(
                new Solution().rearrangeArray(new int[] {3, 1, -2, -5, 2, -4}),
                equalTo(new int[] {3, -2, 1, -5, 2, -4}));
    }

    @Test
    void rearrangeArray2() {
        assertThat(new Solution().rearrangeArray(new int[] {-1, 1}), equalTo(new int[] {1, -1}));
    }
}
