package g0001_0100.s0017_letter_combinations_of_a_phone_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void letterCombinations() {
        assertThat(
                new Solution().letterCombinations("23"),
                equalTo(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")));
    }

    @Test
    public void letterCombinations2() {
        assertThat(new Solution().letterCombinations(""), equalTo(Arrays.asList()));
    }

    @Test
    public void letterCombinations3() {
        assertThat(new Solution().letterCombinations("2"), equalTo(Arrays.asList("a", "b", "c")));
    }

    @Test
    public void letterCombinations4() {
        assertThat(new Solution().letterCombinations("4"), equalTo(Arrays.asList("g", "h", "i")));
    }

    @Test
    public void letterCombinations5() {
        assertThat(new Solution().letterCombinations("5"), equalTo(Arrays.asList("j", "k", "l")));
    }

    @Test
    public void letterCombinations6() {
        assertThat(new Solution().letterCombinations("6"), equalTo(Arrays.asList("m", "n", "o")));
    }

    @Test
    public void letterCombinations7() {
        assertThat(
                new Solution().letterCombinations("7"), equalTo(Arrays.asList("p", "q", "r", "s")));
    }

    @Test
    public void letterCombinations8() {
        assertThat(new Solution().letterCombinations("8"), equalTo(Arrays.asList("t", "u", "v")));
    }

    @Test
    public void letterCombinations9() {
        assertThat(
                new Solution().letterCombinations("9"), equalTo(Arrays.asList("w", "x", "y", "z")));
    }
}
