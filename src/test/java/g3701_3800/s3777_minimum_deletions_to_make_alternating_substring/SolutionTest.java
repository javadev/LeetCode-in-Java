package g3701_3800.s3777_minimum_deletions_to_make_alternating_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDeletions() {
        assertThat(
                new Solution().minDeletions("ABA", new int[][] {{2, 1, 2}, {1, 1}, {2, 0, 2}}),
                equalTo(new int[] {0, 2}));
    }

    @Test
    void minDeletions2() {
        assertThat(
                new Solution().minDeletions("ABB", new int[][] {{2, 0, 2}, {1, 2}, {2, 0, 2}}),
                equalTo(new int[] {1, 0}));
    }

    @Test
    void minDeletions3() {
        assertThat(
                new Solution().minDeletions("BABA", new int[][] {{2, 0, 3}, {1, 1}, {2, 1, 3}}),
                equalTo(new int[] {0, 1}));
    }

    @Test
    void minDeletions4() {
        // j == 0, tests j > 0 false branch
        // "AAB" -> flip index 0 -> "BAB"
        assertThat(
                new Solution().minDeletions("AAB", new int[][] {{2, 0, 2}, {1, 0}, {2, 0, 2}}),
                equalTo(new int[] {1, 0}));
    }

    @Test
    void minDeletions5() {
        // j == n-1, tests j + 1 < n false branch
        // "ABB" -> flip index 2 -> "ABA"
        assertThat(
                new Solution().minDeletions("ABB", new int[][] {{2, 0, 2}, {1, 2}, {2, 0, 2}}),
                equalTo(new int[] {1, 0}));
    }

    @Test
    void minDeletions6() {
        // tests a[j] == 'A' false branch (i.e., 'B' -> 'A')
        // "BAA" -> flip index 0 (B) -> "AAA"
        assertThat(
                new Solution().minDeletions("BAA", new int[][] {{2, 0, 2}, {1, 0}, {2, 0, 2}}),
                equalTo(new int[] {1, 2}));
    }

    @Test
    void minDeletions7() {
        // tests a[j] == 'A' true branch
        // "AAA" -> flip index 1 -> "ABA"
        assertThat(
                new Solution().minDeletions("AAA", new int[][] {{2, 0, 2}, {1, 1}, {2, 0, 2}}),
                equalTo(new int[] {2, 0}));
    }

    @Test
    void minDeletions8() {
        // tests l < r false branch
        assertThat(
                new Solution().minDeletions("AAB", new int[][] {{2, 1, 1}, {2, 0, 0}}),
                equalTo(new int[] {0, 0}));
    }

    @Test
    void minDeletions9() {
        // larger string to exercise BIT loops more
        // "AABBA" -> pairs at index 0 (AA), 2 (BB)
        assertThat(
                new Solution()
                        .minDeletions(
                                "AABBA",
                                new int[][] {
                                    {2, 0, 4}, {1, 2}, {2, 0, 4}, {1, 0}, {2, 0, 4}, {2, 1, 3}
                                }),
                equalTo(new int[] {2, 1, 2, 1}));
    }

    @Test
    void minDeletions10() {
        // All neighbor pairs match
        // "AAAA" -> flip middle to break/create pairs
        assertThat(
                new Solution()
                        .minDeletions(
                                "AAAA", new int[][] {{2, 0, 3}, {1, 2}, {2, 0, 3}, {2, 0, 1}}),
                equalTo(new int[] {3, 2, 1}));
    }

    @Test
    void minDeletions11() {
        // No initial neighbor pairs - covers a[i] == a[i+1] false branch dominantly
        assertThat(
                new Solution()
                        .minDeletions(
                                "ABABAB", new int[][] {{2, 0, 5}, {1, 3}, {2, 0, 5}, {2, 2, 4}}),
                equalTo(new int[] {0, 2, 2}));
    }
}
