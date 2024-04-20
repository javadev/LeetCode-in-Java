package g1801_1900.s1829_maximum_xor_for_each_query;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getMaximumXor() {
        assertThat(
                new Solution().getMaximumXor(new int[] {0, 1, 1, 3}, 2),
                equalTo(new int[] {0, 3, 2, 3}));
    }

    @Test
    void getMaximumXor2() {
        assertThat(
                new Solution().getMaximumXor(new int[] {2, 3, 4, 7}, 3),
                equalTo(new int[] {5, 2, 6, 5}));
    }

    @Test
    void getMaximumXor3() {
        assertThat(
                new Solution().getMaximumXor(new int[] {0, 1, 2, 2, 5, 7}, 3),
                equalTo(new int[] {4, 3, 6, 4, 6, 7}));
    }
}
