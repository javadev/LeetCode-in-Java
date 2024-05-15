package g3101_3200.s3149_find_the_minimum_cost_array_permutation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findPermutation() {
        assertThat(
                new Solution().findPermutation(new int[] {1, 0, 2}), equalTo(new int[] {0, 1, 2}));
    }

    @Test
    void findPermutation2() {
        assertThat(
                new Solution().findPermutation(new int[] {0, 2, 1}), equalTo(new int[] {0, 2, 1}));
    }
}
