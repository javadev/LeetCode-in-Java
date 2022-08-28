package g1901_2000.s1982_find_array_given_subset_sums;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void recoverArray() {
        assertThat(
                new Solution().recoverArray(3, new int[] {-3, -2, -1, 0, 0, 1, 2, 3}),
                equalTo(new int[] {1, 2, -3}));
    }

    @Test
    void recoverArray2() {
        assertThat(
                new Solution().recoverArray(2, new int[] {0, 0, 0, 0}), equalTo(new int[] {0, 0}));
    }

    @Test
    void recoverArray3() {
        assertThat(
                new Solution()
                        .recoverArray(
                                4, new int[] {0, 0, 5, 5, 4, -1, 4, 9, 9, -1, 4, 3, 4, 8, 3, 8}),
                equalTo(new int[] {0, -1, 4, 5}));
    }
}
