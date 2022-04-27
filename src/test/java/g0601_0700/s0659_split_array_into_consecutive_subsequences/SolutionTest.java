package g0601_0700.s0659_split_array_into_consecutive_subsequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isPossible() {
        assertThat(new Solution().isPossible(new int[] {1, 2, 3, 3, 4, 5}), equalTo(true));
    }

    @Test
    void isPossible2() {
        assertThat(new Solution().isPossible(new int[] {1, 2, 3, 3, 4, 4, 5, 5}), equalTo(true));
    }
}
