package g3401_3500.s3404_count_special_subsequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfSubsequences() {
        assertThat(
                new Solution().numberOfSubsequences(new int[] {1, 2, 3, 4, 3, 6, 1}), equalTo(1L));
    }

    @Test
    void numberOfSubsequences2() {
        assertThat(
                new Solution().numberOfSubsequences(new int[] {3, 4, 3, 4, 3, 4, 3, 4}),
                equalTo(3L));
    }
}
