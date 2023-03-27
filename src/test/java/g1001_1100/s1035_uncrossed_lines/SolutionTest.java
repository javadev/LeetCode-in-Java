package g1001_1100.s1035_uncrossed_lines;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxUncrossedLines() {
        assertThat(
                new Solution().maxUncrossedLines(new int[] {1, 4, 2}, new int[] {1, 2, 4}),
                equalTo(2));
    }

    @Test
    void maxUncrossedLines2() {
        assertThat(
                new Solution()
                        .maxUncrossedLines(
                                new int[] {2, 5, 1, 2, 5}, new int[] {10, 5, 2, 1, 5, 2}),
                equalTo(3));
    }

    @Test
    void maxUncrossedLines3() {
        assertThat(
                new Solution()
                        .maxUncrossedLines(new int[] {1, 3, 7, 1, 7, 5}, new int[] {1, 9, 2, 5, 1}),
                equalTo(2));
    }
}
