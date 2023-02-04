package g0301_0400.s0336_palindrome_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void palindromePairs() {
        assertThat(
                new Solution().palindromePairs(new String[] {"abcd", "dcba", "lls", "s", "sssll"}),
                equalTo(ArrayUtils.getLists(new int[][] {{0, 1}, {1, 0}, {2, 4}, {3, 2}})));
    }

    @Test
    void palindromePairs2() {
        assertThat(
                new Solution().palindromePairs(new String[] {"bat", "tab", "cat"}),
                equalTo(ArrayUtils.getLists(new int[][] {{0, 1}, {1, 0}})));
    }

    @Test
    void palindromePairs3() {
        assertThat(
                new Solution().palindromePairs(new String[] {"a", ""}),
                equalTo(ArrayUtils.getLists(new int[][] {{0, 1}, {1, 0}})));
    }
}
