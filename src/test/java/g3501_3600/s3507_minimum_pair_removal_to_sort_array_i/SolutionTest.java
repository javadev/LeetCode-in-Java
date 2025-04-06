package g3501_3600.s3507_minimum_pair_removal_to_sort_array_i;

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
}
