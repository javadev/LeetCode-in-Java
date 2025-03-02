package g3401_3500.s3471_find_the_largest_almost_missing_integer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestInteger() {
        assertThat(new Solution().largestInteger(new int[] {3, 9, 2, 1, 7}, 3), equalTo(7));
    }

    @Test
    void largestInteger2() {
        assertThat(new Solution().largestInteger(new int[] {3, 9, 7, 2, 1, 7}, 4), equalTo(3));
    }

    @Test
    void largestInteger3() {
        assertThat(new Solution().largestInteger(new int[] {0, 0}, 1), equalTo(-1));
    }
}
