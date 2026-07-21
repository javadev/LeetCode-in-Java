package g3801_3900.s3833_count_dominant_indices;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void dominantIndices() {
        assertThat(new Solution().dominantIndices(new int[] {5, 4, 3}), equalTo(2));
    }

    @Test
    void dominantIndices2() {
        assertThat(new Solution().dominantIndices(new int[] {4, 1, 2}), equalTo(1));
    }
}
