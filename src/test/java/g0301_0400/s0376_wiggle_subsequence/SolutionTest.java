package g0301_0400.s0376_wiggle_subsequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void wiggleMaxLength() {
        assertThat(new Solution().wiggleMaxLength(new int[] {1, 7, 4, 9, 2, 5}), equalTo(6));
    }

    @Test
    void wiggleMaxLength2() {
        assertThat(
                new Solution().wiggleMaxLength(new int[] {1, 17, 5, 10, 13, 15, 10, 5, 16, 8}),
                equalTo(7));
    }

    @Test
    void wiggleMaxLength3() {
        assertThat(
                new Solution().wiggleMaxLength(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}), equalTo(2));
    }
}
