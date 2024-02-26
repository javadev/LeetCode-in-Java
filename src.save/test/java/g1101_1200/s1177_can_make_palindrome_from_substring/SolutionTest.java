package g1101_1200.s1177_can_make_palindrome_from_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canMakePaliQueries() {
        assertThat(
                new Solution()
                        .canMakePaliQueries(
                                "abcda",
                                new int[][] {
                                    {3, 3, 0}, {1, 2, 0}, {0, 3, 1}, {0, 3, 2}, {0, 4, 1}
                                }),
                equalTo(Arrays.asList(true, false, false, true, true)));
    }

    @Test
    void canMakePaliQueries2() {
        assertThat(
                new Solution().canMakePaliQueries("lyb  ", new int[][] {{0, 1, 0}, {2, 2, 1}}),
                equalTo(Arrays.asList(false, true)));
    }
}
