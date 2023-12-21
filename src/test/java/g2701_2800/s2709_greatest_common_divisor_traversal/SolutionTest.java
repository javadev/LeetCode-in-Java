package g2701_2800.s2709_greatest_common_divisor_traversal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canTraverseAllPairs() {
        assertThat(new Solution().canTraverseAllPairs(new int[] {2, 3, 6}), equalTo(true));
    }

    @Test
    void canTraverseAllPairs2() {
        assertThat(new Solution().canTraverseAllPairs(new int[] {3, 9, 5}), equalTo(false));
    }

    @Test
    void canTraverseAllPairs3() {
        assertThat(new Solution().canTraverseAllPairs(new int[] {4, 3, 12, 8}), equalTo(true));
    }
}
