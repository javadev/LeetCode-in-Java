package g1001_1100.s1027_longest_arithmetic_subsequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestArithSeqLength() {
        assertThat(new Solution().longestArithSeqLength(new int[] {3, 6, 9, 12}), equalTo(4));
    }

    @Test
    void longestArithSeqLength2() {
        assertThat(new Solution().longestArithSeqLength(new int[] {9, 4, 7, 2, 10}), equalTo(3));
    }

    @Test
    void longestArithSeqLength3() {
        assertThat(
                new Solution().longestArithSeqLength(new int[] {20, 1, 15, 3, 10, 5, 8}),
                equalTo(4));
    }
}
