package g1401_1500.s1498_number_of_subsequences_that_satisfy_the_given_sum_condition;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numSubseq() {
        assertThat(new Solution().numSubseq(new int[] {3, 5, 6, 7}, 9), equalTo(4));
    }

    @Test
    void numSubseq2() {
        assertThat(new Solution().numSubseq(new int[] {3, 3, 6, 8}, 10), equalTo(6));
    }

    @Test
    void numSubseq3() {
        assertThat(new Solution().numSubseq(new int[] {2, 3, 3, 4, 6, 7}, 12), equalTo(61));
    }
}
