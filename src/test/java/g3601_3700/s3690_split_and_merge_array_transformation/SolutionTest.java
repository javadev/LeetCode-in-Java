package g3601_3700.s3690_split_and_merge_array_transformation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSplitMerge() {
        assertThat(
                new Solution().minSplitMerge(new int[] {3, 1, 2}, new int[] {1, 2, 3}), equalTo(1));
    }

    @Test
    void minSplitMerge2() {
        assertThat(
                new Solution()
                        .minSplitMerge(new int[] {1, 1, 2, 3, 4, 5}, new int[] {5, 4, 3, 2, 1, 1}),
                equalTo(3));
    }
}
