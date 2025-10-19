package g3701_3800.s3718_smallest_missing_multiple_of_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void missingMultiple() {
        assertThat(new Solution().missingMultiple(new int[] {8, 2, 3, 4, 6}, 2), equalTo(10));
    }

    @Test
    void missingMultiple2() {
        assertThat(new Solution().missingMultiple(new int[] {1, 4, 7, 10, 15}, 5), equalTo(5));
    }
}
