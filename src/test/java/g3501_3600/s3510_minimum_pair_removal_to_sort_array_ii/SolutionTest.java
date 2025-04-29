package g3501_3600.s3510_minimum_pair_removal_to_sort_array_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumPairRemoval() {
        assertThat(new Solution().minimumPairRemoval(new int[] {5, 2, 3, 1}), equalTo(2));
    }

    @Test
    void minimumPairRemoval2() {
        assertThat(new Solution().minimumPairRemoval(new int[] {1, 2, 2}), equalTo(0));
    }

    @Test
    void minimumPairRemoval3() {
        assertThat(new Solution().minimumPairRemoval(new int[] {5, 2, 3, 1}), equalTo(2));
    }

    @Test
    void minimumPairRemoval4() {
        assertThat(
                new Solution().minimumPairRemoval(new int[] {2, 2, -1, 3, -2, 2, 1, 1, 1, 0, -1}),
                equalTo(9));
    }
}
