package g3701_3800.s3752_lexicographically_smallest_negated_permutation_that_sums_to_target;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lexSmallestNegatedPerm() {
        assertThat(new Solution().lexSmallestNegatedPerm(3, 0L), equalTo(new int[] {-3, 1, 2}));
    }

    @Test
    void lexSmallestNegatedPerm2() {
        assertThat(new Solution().lexSmallestNegatedPerm(3, 10000000000L), equalTo(new int[] {}));
    }
}
