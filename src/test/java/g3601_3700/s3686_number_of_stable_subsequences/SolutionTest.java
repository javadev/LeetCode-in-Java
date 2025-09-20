package g3601_3700.s3686_number_of_stable_subsequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countStableSubsequences() {
        assertThat(new Solution().countStableSubsequences(new int[] {1, 3, 5}), equalTo(6));
    }

    @Test
    void countStableSubsequences2() {
        assertThat(new Solution().countStableSubsequences(new int[] {2, 3, 4, 2}), equalTo(14));
    }
}
