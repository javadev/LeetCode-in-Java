package g3301_3400.s3331_find_subtree_sizes_after_changes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findSubtreeSizes() {
        assertThat(
                new Solution().findSubtreeSizes(new int[] {-1, 0, 0, 1, 1, 1}, "abaabc"),
                equalTo(new int[] {6, 3, 1, 1, 1, 1}));
    }

    @Test
    void findSubtreeSizes2() {
        assertThat(
                new Solution().findSubtreeSizes(new int[] {-1, 0, 4, 0, 1}, "abbba"),
                equalTo(new int[] {5, 2, 1, 1, 1}));
    }
}
