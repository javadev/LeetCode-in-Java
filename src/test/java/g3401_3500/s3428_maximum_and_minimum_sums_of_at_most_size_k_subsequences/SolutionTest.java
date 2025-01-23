package g3401_3500.s3428_maximum_and_minimum_sums_of_at_most_size_k_subsequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMaxSums() {
        assertThat(new Solution().minMaxSums(new int[] {1, 2, 3}, 2), equalTo(24));
    }

    @Test
    void minMaxSums2() {
        assertThat(new Solution().minMaxSums(new int[] {5, 0, 6}, 1), equalTo(22));
    }
}
