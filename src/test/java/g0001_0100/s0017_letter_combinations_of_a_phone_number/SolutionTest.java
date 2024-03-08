package g0001_0100.s0017_letter_combinations_of_a_phone_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void letterCombinations() {
        assertThat(
                new Solution().letterCombinations("23"),
                equalTo(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")));
    }

    @Test
    void letterCombinations2() {
        assertThat(new Solution().letterCombinations(""), equalTo(Arrays.asList()));
    }

    @Test
    void letterCombinations3() {
        assertThat(new Solution().letterCombinations("2"), equalTo(Arrays.asList("a", "b", "c")));
    }

    @Test
    void letterCombinations4() {
        assertThat(new Solution().letterCombinations("4"), equalTo(Arrays.asList("g", "h", "i")));
    }

    @Test
    void letterCombinations5() {
        assertThat(new Solution().letterCombinations("5"), equalTo(Arrays.asList("j", "k", "l")));
    }

    @Test
    void letterCombinations6() {
        assertThat(new Solution().letterCombinations("6"), equalTo(Arrays.asList("m", "n", "o")));
    }

    @Test
    void letterCombinations7() {
        assertThat(
                new Solution().letterCombinations("7"), equalTo(Arrays.asList("p", "q", "r", "s")));
    }

    @Test
    void letterCombinations8() {
        assertThat(new Solution().letterCombinations("8"), equalTo(Arrays.asList("t", "u", "v")));
    }

    @Test
    void letterCombinations9() {
        assertThat(
                new Solution().letterCombinations("9"), equalTo(Arrays.asList("w", "x", "y", "z")));
    }
}
