package g2401_2500.s2433_find_the_original_array_of_prefix_xor;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findArray() {
        assertThat(
                new Solution().findArray(new int[] {5, 2, 0, 3, 1}),
                equalTo(new int[] {5, 7, 2, 3, 2}));
    }

    @Test
    void findArray2() {
        assertThat(new Solution().findArray(new int[] {13}), equalTo(new int[] {13}));
    }
}
