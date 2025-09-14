package g3601_3700.s3685_subsequence_sum_after_capping_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void subsequenceSumAfterCapping() {
        assertThat(
                new Solution().subsequenceSumAfterCapping(new int[] {4, 3, 2, 4}, 5),
                equalTo(new boolean[] {false, false, true, true}));
    }

    @Test
    void subsequenceSumAfterCapping2() {
        assertThat(
                new Solution().subsequenceSumAfterCapping(new int[] {1, 2, 3, 4, 5}, 3),
                equalTo(new boolean[] {true, true, true, true, true}));
    }
}
