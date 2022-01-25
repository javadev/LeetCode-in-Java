package g0601_0700.s0645_set_mismatch;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findErrorNums() {
        assertThat(new Solution().findErrorNums(new int[] {1, 2, 2, 4}), equalTo(new int[] {2, 3}));
    }

    @Test
    void findErrorNums2() {
        assertThat(new Solution().findErrorNums(new int[] {1, 1}), equalTo(new int[] {1, 2}));
    }
}
