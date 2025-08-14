package g3601_3700.s3644_maximum_k_to_sort_a_permutation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sortPermutation() {
        assertThat(new Solution().sortPermutation(new int[] {0, 3, 2, 1}), equalTo(1));
    }

    @Test
    void sortPermutation2() {
        assertThat(new Solution().sortPermutation(new int[] {0, 1, 3, 2}), equalTo(2));
    }

    @Test
    void sortPermutation3() {
        assertThat(new Solution().sortPermutation(new int[] {3, 2, 1, 0}), equalTo(0));
    }

    @Test
    void sortPermutation4() {
        assertThat(new Solution().sortPermutation(new int[] {0, 1}), equalTo(0));
    }
}
