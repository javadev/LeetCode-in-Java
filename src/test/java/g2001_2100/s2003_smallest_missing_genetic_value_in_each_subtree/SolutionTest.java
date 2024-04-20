package g2001_2100.s2003_smallest_missing_genetic_value_in_each_subtree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestMissingValueSubtree() {
        assertThat(
                new Solution()
                        .smallestMissingValueSubtree(
                                new int[] {-1, 0, 0, 2}, new int[] {1, 2, 3, 4}),
                equalTo(new int[] {5, 1, 1, 1}));
    }

    @Test
    void smallestMissingValueSubtree2() {
        assertThat(
                new Solution()
                        .smallestMissingValueSubtree(
                                new int[] {-1, 0, 1, 0, 3, 3}, new int[] {5, 4, 6, 2, 1, 3}),
                equalTo(new int[] {7, 1, 1, 4, 2, 1}));
    }

    @Test
    void smallestMissingValueSubtree3() {
        assertThat(
                new Solution()
                        .smallestMissingValueSubtree(
                                new int[] {-1, 2, 3, 0, 2, 4, 1}, new int[] {2, 3, 4, 5, 6, 7, 8}),
                equalTo(new int[] {1, 1, 1, 1, 1, 1, 1}));
    }
}
