package g0801_0900.s0873_length_of_longest_fibonacci_subsequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lenLongestFibSubseq() {
        assertThat(
                new Solution().lenLongestFibSubseq(new int[] {1, 2, 3, 4, 5, 6, 7, 8}), equalTo(5));
    }

    @Test
    void lenLongestFibSubseq2() {
        assertThat(
                new Solution().lenLongestFibSubseq(new int[] {1, 3, 7, 11, 12, 14, 18}),
                equalTo(3));
    }
}
