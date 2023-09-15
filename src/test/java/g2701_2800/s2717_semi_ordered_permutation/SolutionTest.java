package g2701_2800.s2717_semi_ordered_permutation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void semiOrderedPermutation() {
        assertThat(new Solution().semiOrderedPermutation(new int[] {2, 1, 4, 3}), equalTo(2));
    }

    @Test
    void semiOrderedPermutation2() {
        assertThat(new Solution().semiOrderedPermutation(new int[] {2, 4, 1, 3}), equalTo(3));
    }

    @Test
    void semiOrderedPermutation3() {
        assertThat(new Solution().semiOrderedPermutation(new int[] {1, 3, 4, 2, 5}), equalTo(0));
    }
}
