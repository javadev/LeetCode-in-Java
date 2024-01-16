package g0001_0100.s0031_next_permutation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void nextPermutation() {
        int[] array = new int[] {1, 2, 3};
        new Solution().nextPermutation(array);
        assertThat(array, equalTo(new int[] {1, 3, 2}));
    }

    @Test
    void nextPermutation2() {
        int[] array = new int[] {3, 2, 1};
        new Solution().nextPermutation(array);
        assertThat(array, equalTo(new int[] {1, 2, 3}));
    }

    @Test
    void nextPermutation3() {
        int[] array = new int[] {1, 1, 5};
        new Solution().nextPermutation(array);
        assertThat(array, equalTo(new int[] {1, 5, 1}));
    }
}
