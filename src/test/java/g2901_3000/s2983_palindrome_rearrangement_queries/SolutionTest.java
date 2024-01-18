package g2901_3000.s2983_palindrome_rearrangement_queries;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canMakePalindromeQueries() {
        assertThat(
                new Solution()
                        .canMakePalindromeQueries(
                                "abcabc", new int[][] {{1, 1, 3, 5}, {0, 2, 5, 5}}),
                equalTo(new boolean[] {true, true}));
    }

    @Test
    void canMakePalindromeQueries2() {
        assertThat(
                new Solution().canMakePalindromeQueries("abbcdecbba", new int[][] {{0, 2, 7, 9}}),
                equalTo(new boolean[] {false}));
    }

    @Test
    void canMakePalindromeQueries3() {
        assertThat(
                new Solution().canMakePalindromeQueries("acbcab", new int[][] {{1, 2, 4, 5}}),
                equalTo(new boolean[] {true}));
    }
}
