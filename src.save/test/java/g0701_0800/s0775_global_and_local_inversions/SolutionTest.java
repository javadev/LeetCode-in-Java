package g0701_0800.s0775_global_and_local_inversions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isIdealPermutation() {
        assertThat(new Solution().isIdealPermutation(new int[] {1, 0, 2}), equalTo(true));
    }

    @Test
    void isIdealPermutation2() {
        assertThat(new Solution().isIdealPermutation(new int[] {1, 2, 0}), equalTo(false));
    }
}
