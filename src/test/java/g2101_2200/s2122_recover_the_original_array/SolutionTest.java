package g2101_2200.s2122_recover_the_original_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void recoverArray() {
        assertThat(
                new Solution().recoverArray(new int[] {2, 10, 6, 4, 8, 12}),
                equalTo(new int[] {3, 7, 11}));
    }

    @Test
    void recoverArray2() {
        assertThat(new Solution().recoverArray(new int[] {1, 1, 3, 3}), equalTo(new int[] {2, 2}));
    }

    @Test
    void recoverArray3() {
        assertThat(new Solution().recoverArray(new int[] {5, 435}), equalTo(new int[] {220}));
    }

    @Test
    void recoverArray4() {
        assertThat(
                new Solution().recoverArray(new int[] {1, 50, 99, 101, 150, 199}),
                equalTo(new int[] {51, 100, 149}));
    }
}
