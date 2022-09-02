package g0801_0900.s0848_shifting_letters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shiftingLetters() {
        assertThat(new Solution().shiftingLetters("abc", new int[] {3, 5, 9}), equalTo("rpl"));
    }

    @Test
    void shiftingLetters2() {
        assertThat(new Solution().shiftingLetters("aaa", new int[] {1, 2, 3}), equalTo("gfd"));
    }
}
