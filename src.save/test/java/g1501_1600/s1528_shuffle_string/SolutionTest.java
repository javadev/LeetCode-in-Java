package g1501_1600.s1528_shuffle_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void restoreString() {
        assertThat(
                new Solution().restoreString("codeleet", new int[] {4, 5, 6, 7, 0, 2, 1, 3}),
                equalTo("leetcode"));
    }

    @Test
    void restoreString2() {
        assertThat(new Solution().restoreString("abc", new int[] {0, 1, 2}), equalTo("abc"));
    }
}
