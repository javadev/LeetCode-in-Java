package g1901_2000.s1920_build_array_from_permutation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void buildArray() {
        assertThat(
                new Solution().buildArray(new int[] {0, 2, 1, 5, 3, 4}),
                equalTo(new int[] {0, 1, 2, 4, 5, 3}));
    }

    @Test
    void buildArray2() {
        assertThat(
                new Solution().buildArray(new int[] {5, 0, 1, 2, 3, 4}),
                equalTo(new int[] {4, 5, 0, 1, 2, 3}));
    }
}
