package g0901_1000.s0922_sort_array_by_parity_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sortArrayByParityII() {
        assertThat(
                new Solution().sortArrayByParityII(new int[] {4, 2, 5, 7}),
                equalTo(new int[] {4, 5, 2, 7}));
    }

    @Test
    void sortArrayByParityII2() {
        assertThat(new Solution().sortArrayByParityII(new int[] {2, 3}), equalTo(new int[] {2, 3}));
    }
}
