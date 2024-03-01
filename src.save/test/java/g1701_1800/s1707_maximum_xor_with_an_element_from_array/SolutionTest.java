package g1701_1800.s1707_maximum_xor_with_an_element_from_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximizeXor() {
        assertThat(
                new Solution()
                        .maximizeXor(
                                new int[] {0, 1, 2, 3, 4}, new int[][] {{3, 1}, {1, 3}, {5, 6}}),
                equalTo(new int[] {3, 3, 7}));
    }

    @Test
    void maximizeXor2() {
        assertThat(
                new Solution()
                        .maximizeXor(
                                new int[] {5, 2, 4, 6, 6, 3},
                                new int[][] {{12, 4}, {8, 1}, {6, 3}}),
                equalTo(new int[] {15, -1, 5}));
    }
}
