package g2301_2400.s2381_shifting_letters_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shiftingLetters() {
        assertThat(
                new Solution()
                        .shiftingLetters("abc", new int[][] {{0, 1, 0}, {1, 2, 1}, {0, 2, 1}}),
                equalTo("ace"));
    }

    @Test
    void shiftingLetters2() {
        assertThat(
                new Solution().shiftingLetters("dztz", new int[][] {{0, 0, 0}, {1, 1, 1}}),
                equalTo("catz"));
    }
}
